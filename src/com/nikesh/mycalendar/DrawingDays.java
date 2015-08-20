package com.nikesh.mycalendar;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class DrawingDays extends JPanel {

    public DrawingDays(int firstDay, int lastDay, int today) {
        setLayout(new GridLayout(5, 7, 0, 0));

        for (int day = 1, i = 1; i <= 35; i++) {

            if (i >= firstDay && day <= lastDay) {
                JLabel lbl = new JLabel(day + "");
                lbl.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                lbl.setBorder(new LineBorder(Color.BLACK));
                if (day == today) {
                    lbl.setOpaque(true);
                    lbl.setBackground(Color.red);
                    lbl.setForeground(Color.CYAN);

                }
                this.add(lbl);
                day++;
            } else {
                this.add(new JLabel(""));
            }
        }
    }
    /*
     public static void main(String[] args){
     JFrame fm = new JFrame();
     fm.add(new DrawingDays(5, 31, 6));
     fm.setSize(200, 200);
     fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fm.setVisible(true);
     }
     */
}

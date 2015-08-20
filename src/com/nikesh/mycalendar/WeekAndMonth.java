package com.nikesh.mycalendar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class WeekAndMonth extends JPanel {

    private final String[] nameOfMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private final String[] nameOfDays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    private JPanel weeks, monthYear;

    public WeekAndMonth(int month, int year) {
        setLayout(new GridLayout(2, 1, 5, 5));

        weeks = new JPanel(new GridLayout(1, 7, 0, 0));

        monthYear = new JPanel(new FlowLayout(FlowLayout.CENTER));
        monthYear.setBorder(new LineBorder(Color.BLACK));

        for (int i = 0; i < 7; i++) {
            JLabel lbl = new JLabel(nameOfDays[i]);
            lbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            lbl.setHorizontalAlignment(SwingConstants.CENTER);
            lbl.setBorder(new LineBorder(Color.BLACK));
            switch (i) {
                case 0:
                case 1:
                case 5:
                    lbl.setToolTipText(nameOfDays[i] + "day");
                    break;
                case 2:
                    lbl.setToolTipText(nameOfDays[i] + "sday");
                    break;
                case 3:
                    lbl.setToolTipText(nameOfDays[i] + "nesday");
                    break;
                case 4:
                    lbl.setToolTipText(nameOfDays[i] + "rsday");
                    break;
                case 6:
                    lbl.setToolTipText(nameOfDays[i] + "urday");
                    break;

            }
            weeks.add(lbl);
        }
        JLabel mY = new JLabel(nameOfMonths[month] + " " + year);
        mY.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        monthYear.add(mY);

        this.add(monthYear);
        this.add(weeks);
    }
}

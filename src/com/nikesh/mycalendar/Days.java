package com.nikesh.mycalendar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Days {
    protected JLabel label;
    
    protected Days(){
        label = new JLabel();
        label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
    }
    
    public abstract void makeDayLabel(int dayNo);
}

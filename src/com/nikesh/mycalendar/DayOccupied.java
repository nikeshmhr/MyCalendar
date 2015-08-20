package com.nikesh.mycalendar;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class DayOccupied extends Days {

    @Override
    public void makeDayLabel(int dayNo) {
        /*if (dayNo == 28) {
            label.setOpaque(true);
            label.setBackground(Color.red);
            label.setForeground(Color.CYAN);
        }*/
        label.setText(dayNo + "");
        label.setBorder(new LineBorder(Color.BLACK));
    }

}

package com.nikesh.mycalendar;

import javax.swing.JLabel;

public class DaysFactory {
    
       
    public JLabel createDay(int dayNo){
        JLabel lbl = null;
        if(dayNo >= 1){
            DayOccupied d = new DayOccupied();
            d.makeDayLabel(dayNo);
            lbl = d.label;
        }else if(dayNo == 0){
            DayVacant d = new DayVacant();
            d.makeDayLabel(dayNo);
            lbl = d.label;
        }
        return lbl;
    }
    
}

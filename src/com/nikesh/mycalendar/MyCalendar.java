package com.nikesh.mycalendar;

import java.awt.BorderLayout;
import java.awt.Cursor;
import javax.swing.JFrame;

public class MyCalendar extends JFrame {

    private CalendarMaker cmaker;
    private WeekAndMonth weekAndMonth;
    private DrawingDays drawingDays;
    private static MyCalendar mc = null;

    private MyCalendar() {

        cmaker = new CalendarMaker();
        weekAndMonth = new WeekAndMonth(cmaker.getMonth(), cmaker.getYear());
        drawingDays = new DrawingDays(cmaker.getFirstDay(), cmaker.getLastDay(), cmaker.getToday());

        add(weekAndMonth, BorderLayout.NORTH);
        add(drawingDays, BorderLayout.CENTER);

        setSize(500, 400);
        setTitle("My Calendar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    }

    public static MyCalendar getInstance() {
        if (mc == null) {
            mc = new MyCalendar();
        }
        return mc;
    }
}

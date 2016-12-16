package com.kienht.materialcalendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.widget.TextView;

import com.kienht.materialcalendarview.format.WeekDayFormatter;

import java.util.Calendar;

/**
 * Display a day of the week
 */
@Experimental
@SuppressLint("ViewConstructor")
class WeekDayView extends TextView {

    private WeekDayFormatter formatter = WeekDayFormatter.DEFAULT;
    private int dayOfWeek;

    public WeekDayView(Context context, int dayOfWeek) {
        super(context);

        setGravity(Gravity.CENTER | Gravity.BOTTOM);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            setTextAlignment(TEXT_ALIGNMENT_CENTER);
        }

        setDayOfWeek(dayOfWeek);
    }

    public void setWeekDayFormatter(WeekDayFormatter formatter) {
        this.formatter = formatter == null ? WeekDayFormatter.DEFAULT : formatter;
        setDayOfWeek(dayOfWeek);
    }

    /**
     *add by Kien
     */

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        if (formatter.format(dayOfWeek).equals("Mon")) {
            setText("M");
        } else if (formatter.format(dayOfWeek).equals("Tue")) {
            setText("T");
        } else if (formatter.format(dayOfWeek).equals("Wed")) {
            setText("W");
        } else if (formatter.format(dayOfWeek).equals("Thu")) {
            setText("TH");
        } else if (formatter.format(dayOfWeek).equals("Fri")) {
            setText("F");
        } else if (formatter.format(dayOfWeek).equals("Sat")) {
            setText("SA");
        } else if (formatter.format(dayOfWeek).equals("Sun")) {
            setText("SU");
        } else {
            setText(formatter.format(dayOfWeek).toString().toUpperCase());
        }
    }


    public void setDayOfWeek(Calendar calendar) {
        setDayOfWeek(CalendarUtils.getDayOfWeek(calendar));
    }

}

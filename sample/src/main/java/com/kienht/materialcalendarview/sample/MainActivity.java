package com.kienht.materialcalendarview.sample;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kienht.materialcalendarview.CalendarDay;
import com.kienht.materialcalendarview.MaterialCalendarView;
import com.kienht.materialcalendarview.OnDateSelectedListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Routing Activity for other samples
 */
public class MainActivity extends AppCompatActivity implements OnDateSelectedListener {

    private static final DateFormat FORMATTER = new SimpleDateFormat("EEEE, MMM dd yyyy");

    @Bind(R.id.calendarView)
    MaterialCalendarView widget;

    @Bind(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        widget.setOnDateChangedListener(this);

        widget.setSelectedDate(Calendar.getInstance().getTime());

        //Setup initial text
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/brandon_med.ttf");
        widget.setTypeFaceFont(type);

        textView.setTypeface(type);
        textView.setText(getSelectedDatesString());
    }

    @Override
    public void onDateSelected(@NonNull MaterialCalendarView widget, @Nullable CalendarDay date, boolean selected) {
        textView.setText(getSelectedDatesString());
    }

    private String getSelectedDatesString() {
        CalendarDay date = widget.getSelectedDate();
        if (date == null) {
            return "No Selection";
        }
        return FORMATTER.format(date.getDate());
    }
}

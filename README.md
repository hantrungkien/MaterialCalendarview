# MaterialCalendarview
MaterialCalendarview

[![](https://jitpack.io/v/hantrungkien/MaterialCalendarview.svg)](https://jitpack.io/#hantrungkien/MaterialCalendarview)

<a><img src="http://sv1.upsieutoc.com/2017/05/17/screenshot.jpg" width="200"></a>

### install:

**via JitPack (to get current code)**

project/build.gradle
````gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
````
module/build.gradle
````gradle
compile 'com.github.hantrungkien:MaterialCalendarview:-SNAPSHOT'
````

#### How to use:

````xml
<com.kienht.materialcalendarview.MaterialCalendarView
            android:id="@+id/calendarView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:mcv_arrowColor="@color/pink"
            app:mcv_calendarMode="week"
            app:mcv_firstDayOfWeek="monday"
            app:mcv_selectionColor="@color/pink" />
````

See [MainActivity.java](https://github.com/hantrungkien/MaterialCalendarview/blob/master/sample/src/main/java/com/kienht/materialcalendarview/sample/MainActivity.java) to know how to add events into calendar-day-view

````Java
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
````

### Contribution

If you've found an error, please file an issue.

Patches and new samples are encouraged, and may be submitted by forking this project and submitting a pull request through GitHub.

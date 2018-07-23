# MaterialCalendarview
MaterialCalendarview

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
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
compile 'com.github.hantrungkien:MaterialCalendarview:1.0.0'
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

### LICENCE

    Copyright 2017 Kien Han Trung

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.




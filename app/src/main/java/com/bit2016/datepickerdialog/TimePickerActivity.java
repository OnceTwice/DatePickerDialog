package com.bit2016.datepickerdialog;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        ((TimePicker)findViewById(R.id.timePicker)).setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Intent intent = new Intent();
                intent.putExtra("hourOfDay", hourOfDay);
                intent.putExtra("minute", minute);

                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}

package com.heqinuc.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.heqinuc.coolweather.gson.Weather;
import com.heqinuc.coolweather.service.AutoUpdateService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        if (pref.getString("weather",null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            intent.putExtra("weather",pref.getString("weather",null));
            startActivity(intent);
            finish();
        }
    }

}

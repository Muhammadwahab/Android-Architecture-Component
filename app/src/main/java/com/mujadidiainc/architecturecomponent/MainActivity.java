package com.mujadidiainc.architecturecomponent;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mujadidiainc.architecturecomponent.ViewModel.NamazViewModel;
import com.mujadidiainc.architecturecomponent.Wrapper.Timings;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NamazViewModel namazViewModel;
    public static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namazViewModel=ViewModelProviders.of(this).get(NamazViewModel.class);
        namazViewModel.init();
        namazViewModel.getNamazTiming().observe(this, new Observer<List<Timings>>() {
            @Override
            public void onChanged(@Nullable List<Timings> timings) {
                Log.e(TAG, "onChanged: data arrived");
            }
        });
    }
}

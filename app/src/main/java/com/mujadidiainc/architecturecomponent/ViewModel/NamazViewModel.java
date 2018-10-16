package com.mujadidiainc.architecturecomponent.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.mujadidiainc.architecturecomponent.Repositry.NamazRepositry;
import com.mujadidiainc.architecturecomponent.Wrapper.Timings;

import java.util.List;

public class NamazViewModel extends ViewModel {

    private  NamazRepositry namazRepositry;
    private LiveData<List<Timings>> timingsList;
    public void init()
    {
        namazRepositry=new NamazRepositry();
    }


    public LiveData<List<Timings>> getNamazTiming() {
        return namazRepositry.getTimings();

    }
}


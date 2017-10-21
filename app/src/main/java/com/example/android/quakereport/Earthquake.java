package com.example.android.quakereport;

/**
 * Created by JS IID on 10/7/2017.
 */

public class Earthquake { private String mlocation;
    private String mMagnitude;

    private long mTimeInMilliseconds;
    public Earthquake(String Magnitude,String location,long TimeInMilliseconds ){
        mMagnitude = Magnitude;
        mlocation= location;

        mTimeInMilliseconds = TimeInMilliseconds;
    }
    public String getLocation (){return mlocation;}

    public String getMagnitude (){return mMagnitude;}

    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
   }

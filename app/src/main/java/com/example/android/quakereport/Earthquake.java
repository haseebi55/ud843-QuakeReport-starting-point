package com.example.android.quakereport;

/**
 * Created by JS IID on 10/7/2017.
 */

public class Earthquake { private String mlocation;
    private String mMagnitude;
    private String mDate;
    public Earthquake(String Magnitude,String location,String Date ){
        mMagnitude = Magnitude;
        mlocation= location;
        mDate = Date;
    }
    private String getlocation (){return mlocation;}
    private String getMagnitude (){return mMagnitude;}
    private String getDate(){return mDate;}
   }

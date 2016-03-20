package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by leon on 3/14/16.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        for (int i = 0; i < 17; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + (i + 1));
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
        }

    }

    public static CrimeLab get(Context c) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for(Crime c : mCrimes) {
            if(c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }
}
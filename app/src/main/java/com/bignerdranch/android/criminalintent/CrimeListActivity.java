package com.bignerdranch.android.criminalintent;

import android.app.Fragment;
/**
 * Created by leon on 3/14/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new CrimeListFragment();
    }
}

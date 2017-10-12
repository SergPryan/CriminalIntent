package com.example.pryanichnikov.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;


public class CrimeActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID =
            "com.bignerdranch.android.criminalintent.crime_id";

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

    public static Intent newIntent(Context packageContext, UUID crimed){
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID,crimed);
        return intent;
    }
}
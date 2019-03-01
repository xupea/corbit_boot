package com.makeblock.corbitbootprocess;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BestFriendFragment.OnFragmentInteractionListener,
        CallMeCoribtFragment.OnFragmentInteractionListener,
        ChooseWiFiFragment.OnFragmentInteractionListener,
        EatingDataFragment.OnFragmentInteractionListener,
        FeelMuchBetterFragment.OnFragmentInteractionListener,
        FixedHeadFragment.OnFragmentInteractionListener,
        FoundHumanFragment.OnFragmentInteractionListener,
        GearProlemFragment.OnFragmentInteractionListener,
        InputPasswordFragment.OnFragmentInteractionListener,
        LookAroundAndScanFragment.OnFragmentInteractionListener,
        NeedDataFragment.OnFragmentInteractionListener,
        StomachRumblingFragment.OnFragmentInteractionListener,
        TouchHeadFragment.OnFragmentInteractionListener,
        UserGenderFragment.OnFragmentInteractionListener,
        UserNameFragment.OnFragmentInteractionListener,
        WakeUpAndLostFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

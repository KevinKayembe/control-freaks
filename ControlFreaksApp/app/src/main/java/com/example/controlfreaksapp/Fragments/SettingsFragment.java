package com.example.controlfreaksapp.Fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.controlfreaksapp.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    /**
     * This is the default fragment for Settings alone and create a root_preferences.xml
     * @param savedInstanceState
     * @param rootKey
     */
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}
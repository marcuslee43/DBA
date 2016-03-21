package com.example.administrator.dba;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by administrator on 2/22/16.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FragXtraR extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.lin_extrar, container,false);
        return v;


    }
    }


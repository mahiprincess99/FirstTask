package com.margi.task1;

import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Margi on 30-Jan-17.
 */
public class signup1 extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {


        View  view=inflater.inflate(R.layout.signup1_main,container,false);
        return view;
    }
}

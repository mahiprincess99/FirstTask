package com.margi.task1;

import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Margi on 30-Jan-17.
 */
public class Loginpage extends Fragment

{
    private Button btnSubmit;
    EditText uname,password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.login_fragment, container, false);
        btnSubmit=(Button)view.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Loginpage s = new Loginpage();
                getFragmentManager().beginTransaction().replace(R.id.linear_main,s).addToBackStack("").commit();
               // android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               // fragmentTransaction.replace(R.id.linear_main, fragment1);
                //.addToBackStack("");
               // fragmentTransaction.commit();

                //Go to next
                getFragmentManager().popBackStack();

            }
        });
        return view;


    }
    }




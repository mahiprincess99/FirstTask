package com.margi.task1;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private LinearLayout linearLayout;
    private Button button,button2;
    private Button button1;
    private Loginpage fragment;
    private signup fragment1;
    private signup1 fragment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linearLayout = (LinearLayout) findViewById(R.id.linear_main);
        button = (Button) findViewById(R.id.btn_ok);
        button1=(Button)findViewById(R.id.frg_main);
        button2=(Button)findViewById(R.id.frg2_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                fragment = new Loginpage();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.linear_main, fragment);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                fragment1= new signup();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.linear_main, fragment1);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment2 = new signup1();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.linear_main, fragment2);
                fragmentTransaction.addToBackStack("");
                fragmentTransaction.commit();

            }
        });
    }
}

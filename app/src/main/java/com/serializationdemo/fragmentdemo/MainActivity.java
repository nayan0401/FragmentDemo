package com.serializationdemo.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment1 fragment1;
    Fragment2 fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button showFrag1 = findViewById(R.id.show_frag1_btn);
        Button showFrag2 = findViewById(R.id.show_frag2_btn);

        showFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    fragment1 = new Fragment1();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, fragment1)
                            .commit();
            }
        });

        showFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 = new Fragment2();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment2_container, fragment2)
                        .commit();
            }
        });




    }
}
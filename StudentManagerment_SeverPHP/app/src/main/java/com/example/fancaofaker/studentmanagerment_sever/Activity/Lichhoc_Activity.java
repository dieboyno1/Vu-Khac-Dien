package com.example.fancaofaker.studentmanagerment_sever.Activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;
import com.example.fancaofaker.studentmanagerment_sever.Fragment.Fragment_main_lichhoc;
import com.example.fancaofaker.studentmanagerment_sever.R;

public class Lichhoc_Activity extends AppCompatActivity {
    FrameLayout frameLayout ;
    FragmentManager fragmentManager ;
    ImageButton _back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichhoc_);

        fragmentManager = getSupportFragmentManager();
        innit();
        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainApp_Activity.class));
            }
        });

        // kiểm tra nếu frame rõng thì trả về fragment ds nganh
        if(savedInstanceState == null)
        {
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_lichhoc ,new Fragment_main_lichhoc() , utils.fragment_lichhoc_main).commit();

        }

    }
    void innit(){
        _back = (ImageButton)findViewById(R.id._back);
        frameLayout = (FrameLayout) findViewById(R.id.frame_lichhoc);
    }


    @Override
    public void onBackPressed() {
        Fragment fragment_main_lichhoctag = fragmentManager
                .findFragmentByTag(utils.fragment_lichhoc_main);


    }
}

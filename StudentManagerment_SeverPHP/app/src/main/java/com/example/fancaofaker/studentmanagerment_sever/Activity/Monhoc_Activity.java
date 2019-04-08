package com.example.fancaofaker.studentmanagerment_sever.Activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;
import com.example.fancaofaker.studentmanagerment_sever.Fragment.Fragment_monhoc_danhsachnganh;
import com.example.fancaofaker.studentmanagerment_sever.Fragment.Fragment_sv_main;
import com.example.fancaofaker.studentmanagerment_sever.R;

public class Monhoc_Activity extends AppCompatActivity {
    FrameLayout frameLayout ;
    FragmentManager fragmentManager ;
    public static TextView txttile ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monhoc_);
        fragmentManager = getSupportFragmentManager();
        innit();

        // kiểm tra nếu frame rõng thì trả về fragment ds nganh
        if(savedInstanceState == null)
        {
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_monhoc ,new Fragment_monhoc_danhsachnganh() ,utils.fragment_monhoc_dsnganh).commit();

        }

    }

    void innit(){
        frameLayout = (FrameLayout) findViewById(R.id.frame_monhoc);
        txttile = (TextView) findViewById(R.id.txt_monhoc);
    }

    @Override
    public void onBackPressed() {
        Fragment fragment_dsnganh_tag = fragmentManager
                .findFragmentByTag(utils.fragment_monhoc_dsnganh);
        Fragment fragment_dsmon_tag = fragmentManager
                .findFragmentByTag(utils.fragment_monhoc_dsmon);


        if (fragment_dsmon_tag != null)
        {
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_monhoc ,new Fragment_monhoc_danhsachnganh() ,utils.fragment_monhoc_dsnganh).commit();
        }
        else
        {
            startActivity(new Intent(getApplicationContext(),MainApp_Activity.class));
        }


}
}

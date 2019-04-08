package com.example.fancaofaker.studentmanagerment_sever.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.fancaofaker.studentmanagerment_sever.R;

public class MainApp_Activity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn_sv , btn_mon , btn_diem , btn_lichhoc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_);
        //
        innit();
        btn_sv.setOnClickListener(this);
        btn_mon.setOnClickListener(this);
        btn_diem.setOnClickListener(this);
        btn_lichhoc.setOnClickListener(this);
    }


    //innit()
    void innit(){
        btn_sv = (ImageButton) findViewById(R.id.btn_qlsv);
        btn_mon = (ImageButton) findViewById(R.id.btn_monhoc);
        btn_diem = (ImageButton) findViewById(R.id.btn_diem);
        btn_lichhoc = (ImageButton) findViewById(R.id.btn_lichhoc);

    }

    // Hàm load menu mặc định khi tạo 1 Project mới.

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_app, menu);
        return true;
    }


    // backpress

    @Override
    public void onBackPressed() {
        //Khoi tao lai Activity muốn khởi tạo lại khi vào lần nữa

        Intent intent = new Intent(getApplicationContext(), MainApp_Activity.class);
        startActivity(intent);
        // kết thúc app
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startActivity(startMain);
        finish();
    }

    // onclick

    @Override
    public void onClick(View view) {
            int d = view.getId();
        if(d == R.id.btn_qlsv){
            startActivity(new Intent(getApplicationContext(),Sinhvien_activity.class));
        }
        if(d == R.id.btn_monhoc){
            startActivity(new Intent(getApplicationContext(),Monhoc_Activity.class));
        }
        if(d == R.id.btn_diem){
            startActivity(new Intent(getApplicationContext(),Diem_Activity.class));
        }
        if(d == R.id.btn_lichhoc){
            startActivity(new Intent(getApplicationContext(),Lichhoc_Activity.class));
        }
    }
}

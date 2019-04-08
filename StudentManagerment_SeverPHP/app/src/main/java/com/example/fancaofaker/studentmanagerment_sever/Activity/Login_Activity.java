package com.example.fancaofaker.studentmanagerment_sever.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.User;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;
import com.example.fancaofaker.studentmanagerment_sever.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {
    EditText edtname, edtpass;
    Button btn_login;
    ArrayList<User> users;
    private String urlget = utils.http + "Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/login/login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ẩn thanh bar ở trên ở activity này
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        //
        setContentView(R.layout.activity_login_);
        // anh xa
        innit();

        // onclick
        btn_login.setOnClickListener(this);
    }

    void innit() {
        edtname = (EditText) findViewById(R.id.edt_user);
        edtpass = (EditText) findViewById(R.id.edt_pass);
        btn_login = (Button) findViewById(R.id.btn_login);
        //
        edtname.setText("");
        edtpass.setText("");
        users = new ArrayList<User>();

    }


    // onback press phisics
    //Back press
    @Override
    public void onBackPressed() {
        //Khoi tao lai Activity muốn khởi tạo lại khi vào lần nữa

        Intent intent = new Intent(getApplicationContext(), Login_Activity.class);
        startActivity(intent);
        // kết thúc app
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startActivity(startMain);
        finish();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_login) {
           login();
        }
    }

    private void login() {
        if (edtname.getText().toString().equals("") || edtpass.getText().toString().equals("")) {
            Toast.makeText(this, "Dữ liệu rỗng xin mời nhập vào", Toast.LENGTH_SHORT).show();
        } else {
            GetUser(urlget);
        }
    }

    private void GetUser(String url) {
    Log.e("Chck", "url:"+url);
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        final JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArraymonhoc = response.getJSONArray("username");
                    for (int i = 0; i < jsonArraymonhoc.length(); i++) {
                        JSONObject users = jsonArraymonhoc.getJSONObject(i);

                        String id = users.getString("id");
                        String username = users.getString("Username");
                        String pas = users.getString("passs");
                        Login_Activity.this.users.add(new User(id, username, pas));


                    }
                    checkLogin();
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }

        );
        requestQueue.add(objectRequest);
    }

    private void checkLogin() {
        for (int i = 0; i < users.size(); i++) {
            if (edtname.getText().toString().equals(users.get(i).getUsername())
                    && edtpass.getText().toString().equals(users.get(i).getPass())) {
                startActivity(new Intent(getApplicationContext(), MainApp_Activity.class));
                finish();
            } else {
                Toast.makeText(this, "User hoặc Mật khẩu không đúng", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
package com.example.fancaofaker.studentmanagerment_sever.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.R;
import com.example.fancaofaker.studentmanagerment_sever.Util.Configpt11304;
import com.example.fancaofaker.studentmanagerment_sever.Util.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class ThemSV04_Activity extends AppCompatActivity implements View.OnClickListener {
    //Defining views
    private EditText editTextName;
    private EditText editTextMasv;
    private EditText editTextLink;
    private EditText editTextDTB;

    private Button buttonAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_sv04_);

        // innit()
        innit();

        // onclick

        buttonAdd.setOnClickListener(this);

    }

    private void innit()
    {
//Initializing views
        editTextName = (EditText) findViewById(R.id.edt_addsv_name);
        editTextMasv = (EditText) findViewById(R.id.edt_addsv_masv);
        editTextLink = (EditText) findViewById(R.id.edt_addsv_link);
        editTextDTB = (EditText) findViewById(R.id.edt_addsv_dtb);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);


    }

    // ADD SV
    //Adding an employee
    private void addSV04(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                if(response.trim().equals("OK"))
                {
                    Toast.makeText(ThemSV04_Activity.this, "Thêm thành công SV", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ThemSV04_Activity.this, "Lỗi thêm", Toast.LENGTH_SHORT).show();
                }

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(ThemSV04_Activity.this, "Xảy ra lỗi", Toast.LENGTH_SHORT).show();

                    }
                }


        )
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<>();

                params.put("namesv04",editTextName.getText().toString().trim());
                params.put("masv04",editTextMasv.getText().toString().trim());
                params.put("linksv04",editTextLink.getText().toString().trim());
                params.put("dtbsv04",editTextDTB.getText().toString().trim());

                return params;
            }
        };

        requestQueue.add(stringRequest);



    }

// onclick

    @Override
    public void onClick(View view) {
        if(view == buttonAdd){
            if (editTextName.getText().toString().equals("") || editTextMasv.getText().toString().equals("") || editTextLink.getText().toString().equals("")
                    || editTextDTB.getText().toString().equals(""))
            {
                Toast.makeText(this, "Xin mời nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            }
            else {
                    addSV04(Configpt11304.URL_ADD);
                super.onBackPressed();

            }
        }
    }
}

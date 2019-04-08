package com.example.fancaofaker.studentmanagerment_sever.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.R;
import com.example.fancaofaker.studentmanagerment_sever.Util.Configpt11305;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Chinhsua_sv05_Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextId;
    private EditText editTextName;
    private EditText editTextMASV;
    private EditText editTextLink;
    private EditText editTextDTB;

    private Button buttonUpdate;
    RequestQueue requestQueue;

    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinhsua_sv05_);

        innit();

        Intent intent = getIntent();

        id = intent.getStringExtra(Configpt11305.EMP_ID);



        buttonUpdate.setOnClickListener(this);


        editTextId.setText(id);

        //

        getstudentbyid();


    }

    private void innit()
    {
        editTextId = (EditText) findViewById(R.id.edt_update_id);
        editTextName = (EditText) findViewById(R.id.edt_update_name);
        editTextMASV = (EditText) findViewById(R.id.edt_update_masv);
        editTextLink = (EditText) findViewById(R.id.edt_update_link);
        editTextDTB = (EditText) findViewById(R.id.edt_update_dtb);

        buttonUpdate = (Button) findViewById(R.id.button_update);

    }


    // get sv05 theo id
    // getSV theo id
    private void getstudentbyid()
    {


        // Creates the Volley request queue
        requestQueue = Volley.newRequestQueue(getApplicationContext()) ;
        // Casts results into the TextView found within the main layout XML with id jsonData

        JsonObjectRequest obreg = new JsonObjectRequest(Request.Method.GET,Configpt11305.URL_GET_EMP+id,
                new Response.Listener<JSONObject>()
                {


                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONArray jsarray =  response.getJSONArray(Configpt11305.TAG_JSON_ARRAY);



                            JSONObject objitem = jsarray.getJSONObject(0);


                            String name = objitem.getString(Configpt11305.TAG_NAME);
                            String masv = objitem.getString(Configpt11305.TAG_MASV);
                            String link = objitem.getString(Configpt11305.TAG_LINK);
                            String DTB = objitem.getString(Configpt11305.TAG_DTB);

                            // setText

                            editTextName.setText(name);
                            editTextMASV.setText(masv);
                            editTextLink.setText(link);
                            editTextDTB.setText(DTB);


















                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                // The final parameter overrides the method onErrorResponse() and passes VolleyError
                //as a parameter
                new Response.ErrorListener() {
                    @Override
                    // Handles errors that occur due to Volley
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                    }
                }
        );

        requestQueue.add(obreg);




    }

    // update SV
    private void updateEmployee(String url)

    {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                if(response.trim().equals("OK"))
                {
                    Toast.makeText(Chinhsua_sv05_Activity.this, "Cập nhật thành công SV", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Chinhsua_sv05_Activity.this, "Lỗi cập nhật", Toast.LENGTH_SHORT).show();
                }

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Chinhsua_sv05_Activity.this, "Xảy ra lỗi", Toast.LENGTH_SHORT).show();

                    }
                }


        )
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<>();

                params.put("idsv04",editTextId.getText().toString().trim());
                params.put("namesv04",editTextName.getText().toString().trim());
                params.put("masv04",editTextMASV.getText().toString().trim());
                params.put("linksv04",editTextLink.getText().toString().trim());
                params.put("dtbsv04",editTextDTB.getText().toString().trim());

                return params;
            }
        };

        requestQueue.add(stringRequest);


    }




    @Override
    public void onClick(View view) {
        updateEmployee(Configpt11305.URL_UPDATE_EMP);
        super.onBackPressed();
    }
}

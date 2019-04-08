package com.example.fancaofaker.studentmanagerment_sever.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.Adapter.custom_khenthuong_adapter;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.khenthuong;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;
import com.example.fancaofaker.studentmanagerment_sever.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Diem_Activity extends AppCompatActivity {

    ListView listxuatsac , listgioi ;
    TextView txtname_ov , txtmasv_ov , txtdtb_ov ;
    String urlget = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/khenthuong/Json_diem.php";
    ImageButton _back;
    ArrayList <khenthuong> arrxuatsac ;
    ArrayList <khenthuong> arrgioi ;
    private static custom_khenthuong_adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diem_);

        init();

        // getongvang
        getOngvang(urlget);

        // getxuatsac
        getXuatsac(urlget);

        //getgioi
        getgioi(urlget);
        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainApp_Activity.class));
            }
        });

    }
// anh xa
    private void init()
    {
        arrxuatsac = new ArrayList<>();
        arrgioi = new ArrayList<>();
        listxuatsac = (ListView) findViewById(R.id.listview_sv_xuatsac);
        listgioi = (ListView) findViewById(R.id.listview_sv_gioi);
        txtname_ov = (TextView) findViewById(R.id.tenongvangpolytxt);
        txtmasv_ov = (TextView) findViewById(R.id.masvongvang);
        txtdtb_ov = (TextView) findViewById(R.id.dtbongvang);
        _back = (ImageButton) findViewById(R.id._back);
    }

    // get ong vang

    private void getOngvang(String url)
    {

        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        final JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArraymonhoc = response.getJSONArray("ongvang");
                    for (int i = 0 ; i<jsonArraymonhoc.length();i++)
                    {
                        JSONObject itemmon = jsonArraymonhoc.getJSONObject(i);

                        String name = itemmon.getString("name");
                        String masv = itemmon.getString("masv");
                        String DTB = itemmon.getString("DTB");
                       txtname_ov.setText(name);
                        txtmasv_ov.setText(masv);
                        txtdtb_ov.setText(DTB);



                    }





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

    // get xuatsac

    private void getXuatsac(String url)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        final JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArraymonhoc = response.getJSONArray("xuatsac");
                    for (int i = 0 ; i<jsonArraymonhoc.length();i++)
                    {
                        JSONObject itemmon = jsonArraymonhoc.getJSONObject(i);

                        String name = itemmon.getString("name");
                        String masv = itemmon.getString("masv");
                        String DTB = itemmon.getString("DTB");


                        arrxuatsac.add(new khenthuong(name,masv,DTB));

                    }

                    //settolistxuatsac
                    adapter = new custom_khenthuong_adapter(Diem_Activity.this,R.layout.custom_khenthuong_adapter,arrxuatsac);
                    listxuatsac.setAdapter(adapter);
                    adapter.notifyDataSetChanged();





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


    private void getgioi(String url)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        final JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArraymonhoc = response.getJSONArray("gioi");
                    for (int i = 0 ; i<jsonArraymonhoc.length();i++)
                    {
                        JSONObject itemmon = jsonArraymonhoc.getJSONObject(i);

                        String name = itemmon.getString("name");
                        String masv = itemmon.getString("masv");
                        String DTB = itemmon.getString("DTB");


                        arrgioi.add(new khenthuong(name,masv,DTB));





                    }

                    //settolistxuatsac
                    adapter = new custom_khenthuong_adapter(Diem_Activity.this,R.layout.custom_khenthuong_adapter,arrgioi);
                    listgioi.setAdapter(adapter);
                    adapter.notifyDataSetChanged();





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
}

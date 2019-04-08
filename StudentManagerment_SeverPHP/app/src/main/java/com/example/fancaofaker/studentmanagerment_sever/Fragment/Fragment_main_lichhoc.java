package com.example.fancaofaker.studentmanagerment_sever.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.Adapter.custom_lichhoc_adapter;
import com.example.fancaofaker.studentmanagerment_sever.Adapter.custom_monhoc_adapter;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.lichhoc;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.monhoc;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;
import com.example.fancaofaker.studentmanagerment_sever.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_main_lichhoc extends Fragment{

    private  static  View view;
    private  static FragmentManager fragmentManager ;
    ArrayList<lichhoc> Arrlichhoc;
    private static custom_lichhoc_adapter adapter;
    private String urlget = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/lichhoc/lichhoc_JSON.php";


    ListView lv_lichhoc ;


    public Fragment_main_lichhoc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_main_lichhoc, container, false);

        inntit();


       getlichhoc(urlget);



        // Inflate the layout for this fragment
        return view ;
    }

    // innit()
    void inntit()
    {
        fragmentManager = getActivity().getSupportFragmentManager();
        lv_lichhoc = view.findViewById(R.id.lv_lichhoc);
        Arrlichhoc = new ArrayList<>();

    }




    // getLichhoc
    private void getlichhoc(String url)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        final JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArraymonhoc = response.getJSONArray("lichhoc");
                    for (int i = 0 ; i<jsonArraymonhoc.length();i++)
                    {
                        JSONObject itemmon = jsonArraymonhoc.getJSONObject(i);

                        String thu = itemmon.getString("thu");
                        String monhoc = itemmon.getString("monhoc");
                        String giaovien = itemmon.getString("giaovien");

                        Arrlichhoc.add(new lichhoc(thu,monhoc,giaovien));





                    }


                    //settolisstview
                    // Toast.makeText(getActivity(), data, Toast.LENGTH_SHORT).show();
                    adapter = new custom_lichhoc_adapter(getActivity(),R.layout.custom_lichhoc_adapter,Arrlichhoc);
                    lv_lichhoc.setAdapter(adapter);
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

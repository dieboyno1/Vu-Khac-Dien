package com.example.fancaofaker.studentmanagerment_sever.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.Activity.Monhoc_Activity;
import com.example.fancaofaker.studentmanagerment_sever.Adapter.custom_SV_adapter;
import com.example.fancaofaker.studentmanagerment_sever.Adapter.custom_monhoc_adapter;
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
public class Fragment_monhoc_danhsachnganh extends Fragment implements AdapterView.OnItemClickListener {


    private  static  View view;
    private  static FragmentManager fragmentManager ;

    String urlgetmon = "Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/monhoc/monhoc_JSON.php";

   private static ArrayList<monhoc> Arrmonhocs ;
    private static custom_monhoc_adapter adapter ;
    String data="";

    ListView lv_dsmon;


    public Fragment_monhoc_danhsachnganh() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fragment_monhoc_danhsachnganh, container, false);

        // innit
        inntit();
        Monhoc_Activity.txttile.setText("Danh sách môn học");




        //getjsonmon

        gẹtJSONDSmon(utils.http+urlgetmon);

        //listview onclick

        lv_dsmon.setOnItemClickListener(this);
        // Inflate the layout for this fragment
        return view ;
    }

    // innit()
    void inntit()
    {
        fragmentManager = getActivity().getSupportFragmentManager();
        lv_dsmon = view.findViewById(R.id.listview_monhoc);
        Arrmonhocs = new ArrayList<monhoc>();

    }

    // getJSONDsachmonhoc

    private void gẹtJSONDSmon(String url)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        final JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArraymonhoc = response.getJSONArray("monhoc");
                    for (int i = 0 ; i<jsonArraymonhoc.length();i++)
                    {
                        JSONObject itemmon = jsonArraymonhoc.getJSONObject(i);

                        String tenmon = itemmon.getString("tenmon");
                        String nganh = itemmon.getString("thuocnganh");
                        String pdf = itemmon.getString("linkpdf");

                        Arrmonhocs.add(new monhoc(tenmon,nganh,pdf));

                        data += Arrmonhocs.get(i).toString();



                    }


                    //settolisstview
                   // Toast.makeText(getActivity(), data, Toast.LENGTH_SHORT).show();
                    adapter = new custom_monhoc_adapter(getActivity(),R.layout.custom_monhoc_adapter,Arrmonhocs);
                    lv_dsmon.setAdapter(adapter);
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

    void getViewFragment()
    {
        fragmentManager
                .beginTransaction()
                .replace(R.id.frame_monhoc ,new Fragment_monhoc_dsmon(), utils.fragment_monhoc_dsmon).commit();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String t = Arrmonhocs.get(i).getLinkpdf().toString();
       // Toast.makeText(getActivity(), t, Toast.LENGTH_SHORT).show();


        // bundle

        FragmentTransaction transection = getFragmentManager().beginTransaction();
        Fragment_monhoc_dsmon mfragment = new Fragment_monhoc_dsmon();
        //using Bundle to send data
        Bundle bundle = new Bundle();
        bundle.putString("link", t);
        mfragment.setArguments(bundle); //data being send to SecondFragment
        transection.replace(R.id.frame_monhoc, mfragment);
        transection.isAddToBackStackAllowed();
        transection.addToBackStack(null);
        transection.commit();





    }


    // onback press




}

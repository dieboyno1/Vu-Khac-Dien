 package com.example.fancaofaker.studentmanagerment_sever.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;
import com.example.fancaofaker.studentmanagerment_sever.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

 /**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_sv_main extends Fragment implements View.OnClickListener {
    private  static  View view;
    private  static FragmentManager fragmentManager ;

    // URL
    String Json_url = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/parseJSON_QLSV.php";

    String data = "" ;
    RequestQueue requestQueue;

     public static ArrayList Arr_DsLop = null ;
     private  static ArrayAdapter adapter_dsLop = null ;

    //
   ListView listview_dslop;


    public Fragment_sv_main() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fragment_sinhvien_main, container, false);

        // innit
        inntit();

        // getDslop
        GetDSachLop();

        adapter_dsLop = new ArrayAdapter(getActivity(),android.R.layout.select_dialog_multichoice,Arr_DsLop);
        listview_dslop.setAdapter(adapter_dsLop);

        // Listview Onclick
         listview_dslop.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0)
                {
                    fragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_sv ,new Fragment_sv_11301class(), utils.fragment_Pt11031_class)
                            .commit();
                }
                if(i ==1)
                {
                    fragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_sv ,new Fragment_sv_11305class(), utils.fragment_Pt11035_class)
                            .commit();
                }
             }
         });


        // Inflate the layout for this fragment
        return view ;
    }

    // innit()
    void inntit()
    {
        fragmentManager = getActivity().getSupportFragmentManager();
       listview_dslop = view.findViewById(R.id.Listview_DsachLop);
        Arr_DsLop = new ArrayList();


    }



     private void GetDSachLop()
     {
         Arr_DsLop.add("Lớp - PT11304");
         Arr_DsLop.add("Lớp - PT11305");
     }





    // su kien btn
    @Override
    public void onClick(View view) {

    }

    // onback press


}


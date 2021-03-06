package com.example.fancaofaker.studentmanagerment_sever.Fragment;


import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.fancaofaker.studentmanagerment_sever.Activity.Chinhsua_sv04_Activity;
import com.example.fancaofaker.studentmanagerment_sever.Activity.Chinhsua_sv05_Activity;
import com.example.fancaofaker.studentmanagerment_sever.Activity.ThemSV04_Activity;
import com.example.fancaofaker.studentmanagerment_sever.Activity.Them_sv05_Activity;
import com.example.fancaofaker.studentmanagerment_sever.Adapter.custom_SV_adapter;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.student_pt11304;
import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;
import com.example.fancaofaker.studentmanagerment_sever.R;
import com.example.fancaofaker.studentmanagerment_sever.Util.Configpt11304;
import com.example.fancaofaker.studentmanagerment_sever.Util.Configpt11305;
import com.example.fancaofaker.studentmanagerment_sever.Util.RequestHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_sv_11305class extends Fragment implements View.OnClickListener {

    private static ListView listview_PT11305;
    private static View view;
    // URL
    String Json_url = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/parseJSON_QLSV.php";
    String data = "" ;
    RequestQueue requestQueue;
    // get id theo listview
    String id_sv;



    //
    public static ArrayList<student_pt11304> studentpt11305ArrayList = null ;
    private static custom_SV_adapter adapter ;

    //
    com.github.clans.fab.FloatingActionButton fab_add , fab_refresh ;
    //
    FrameLayout frameLayout ;
    FragmentManager fragmentManager ;


    public Fragment_sv_11305class() {


        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fragment_sv_11305class, container, false);

        innit();

        // get json 11305
        Get11305student();

        // onclick fab
        fab_add.setOnClickListener(this);
        fab_refresh.setOnClickListener(this);

        // onclick listview
        registerForContextMenu(listview_PT11305);
        listview_PT11305.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                id_sv = studentpt11305ArrayList.get(i).getMa();
                Toast.makeText(getActivity(), id_sv, Toast.LENGTH_SHORT).show();

                return false;
            }
        });



        // reload




        // Inflate the layout for this fragment
        return view;
    }

    private void innit()
    {
        studentpt11305ArrayList = new ArrayList<student_pt11304>();
        listview_PT11305 = (ListView) view.findViewById(R.id.Listview_sv_PT11305);
        //fab
        fab_add = view.findViewById(R.id.menu_item_addsv);
        fab_refresh = view.findViewById(R.id.menu_item_refresh);
//
        frameLayout = view.findViewById(R.id.frame_sv);
    }



    // Context menu (sua , xoa)
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Tùy Chọn");
        menu.add(0, v.getId(), 0, "Chỉnh Sửa");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "Xóa");
    }

    // context click
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Chỉnh Sửa"){
            Intent intent = new Intent(getActivity(), Chinhsua_sv05_Activity.class);
            intent.putExtra(Configpt11305.EMP_ID,id_sv);
            startActivity(intent);

        }
        else if(item.getTitle()=="Xóa"){
            confirmDeleteEmployee();

        }else{
            return false;
        }
        return true;
    }



    private void Get11305student()
    {


        // Creates the Volley request queue
        requestQueue = Volley.newRequestQueue(getActivity()) ;
        // Casts results into the TextView found within the main layout XML with id jsonData

        JsonObjectRequest obreg = new JsonObjectRequest(Request.Method.GET,Json_url,
                new Response.Listener<JSONObject>()
                {


                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONArray jsarray =  response.getJSONArray("PT11305");


                            for (int i = 0; i < jsarray.length(); i++) {
                                JSONObject objitem = jsarray.getJSONObject(i);

                                String id = objitem.getString("id");
                                String name = objitem.getString("name");
                                String masv = objitem.getString("masv");
                                String link = objitem.getString("link");
                                String DTB = objitem.getString("DTB");







                                studentpt11305ArrayList.add(new student_pt11304(id,name,masv,link,DTB));


                                data += studentpt11305ArrayList.get(i).toString();




                            }




                            adapter = new custom_SV_adapter(getActivity(),R.layout.custom_sv_adapter, studentpt11305ArrayList);
                            listview_PT11305.setAdapter(adapter);
                            adapter.notifyDataSetChanged();








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


    // void xóa sv
    private void deleteEmployee(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
                if(response.trim().equals("OK"))
                {
                    Toast.makeText(getActivity(), "Xóa thành công SV", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getActivity(), "Lỗi xóa", Toast.LENGTH_SHORT).show();
                }

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "Xảy ra lỗi", Toast.LENGTH_SHORT).show();

                    }
                }


        )
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<>();

                params.put("idofsv",id_sv);

                return params;
            }
        };

        requestQueue.add(stringRequest);


    }

    // confilm delete
    private void confirmDeleteEmployee(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setMessage("Bạn có muốn xóa sv này?");

        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        deleteEmployee(Configpt11305.URL_DELETE_EMP);
                        reload();

                    }
                });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void reload(){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.detach(this).attach(this).commit();
    }


    // onclick fab
    @Override
    public void onClick(View view) {
        int t = view.getId();
        if(t == R.id.menu_item_addsv)
        {
            startActivity(new Intent(getActivity(), Them_sv05_Activity.class));
        }
        if(t == R.id.menu_item_refresh)
        {
            reload();
        }
    }

}

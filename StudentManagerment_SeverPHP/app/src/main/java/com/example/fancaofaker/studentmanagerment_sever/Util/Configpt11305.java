package com.example.fancaofaker.studentmanagerment_sever.Util;

import com.example.fancaofaker.studentmanagerment_sever.Contructor.utils;

/**
 * Created by FancaoFaker on 6/22/2017.
 */

public class Configpt11305 {
    //


    //Address of our scripts of the CRUD PT11304
    public static final String URL_ADD= utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/RQFromAndroid/PT11305/addEmp.php";
    public static final String URL_GET_ALL = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/RQFromAndroid/PT11305/getAllEmp.php";
    public static final String URL_GET_EMP = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/RQFromAndroid/PT11305/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/RQFromAndroid/PT11305/updateEmp.php";
    public static final String URL_DELETE_EMP = utils.http+"Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/RQFromAndroid/PT11305/deleteEmp.php";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_MASV = "masv";
    public static final String KEY_LINK = "link";
    public static final String KEY_DTB = "DTB";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_MASV = "masv";
    public static final String TAG_LINK = "link";
    public static final String TAG_DTB = "DTB";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";
}

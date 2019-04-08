package com.example.fancaofaker.studentmanagerment_sever.Contructor;

/**
 * Created by FancaoFaker on 6/29/2017.
 */

public class khenthuong {
    String name ;
    String masv ;
    String DTB ;

    public khenthuong() {
    }

    public khenthuong(String name, String masv, String DTB) {
        this.name = name;
        this.masv = masv;
        this.DTB = DTB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getDTB() {
        return DTB;
    }

    public void setDTB(String DTB) {
        this.DTB = DTB;
    }

    @Override
    public String toString() {
        return name+"-"+DTB+"\n";
    }
}

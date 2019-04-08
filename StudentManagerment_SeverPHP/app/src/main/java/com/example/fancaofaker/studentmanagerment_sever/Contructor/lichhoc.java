package com.example.fancaofaker.studentmanagerment_sever.Contructor;

/**
 * Created by FancaoFaker on 6/29/2017.
 */

public class lichhoc {
    String thu ;
    String monhoc;
    String giaovien ;

    public lichhoc() {
    }

    public lichhoc(String thu, String monhoc, String giaovien) {
        this.thu = thu;
        this.monhoc = monhoc;
        this.giaovien = giaovien;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public String getGiaovien() {
        return giaovien;
    }

    public void setGiaovien(String giaovien) {
        this.giaovien = giaovien;
    }

    @Override
    public String toString() {
        return thu+"-"+monhoc+"-"+giaovien;
    }
}

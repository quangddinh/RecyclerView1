package com.example.recyclerview;

import android.media.MediaPlayer;

public class Menu {
    // thuộc tính
    private String name;
    private String mota;
    private Integer hinhanh;
    private Integer gia;

    public Menu(String name, String mota, Integer hinhanh, Integer gia) {
        // constructor có tham số, dùng để tạo món ăn
        this.name = name;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.gia = gia;
    }
     public Menu() {
        // hứng món ăn


     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }
}

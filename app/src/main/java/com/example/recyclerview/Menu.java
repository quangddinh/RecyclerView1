package com.example.recyclerview;

import android.media.MediaPlayer;

import java.util.ArrayList;

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

    public static ArrayList<Menu> mock(){
        ArrayList<Menu> mArraylistMenu = new ArrayList<>();
        mArraylistMenu.add(new Menu("Banh bong lan","124 Le Tuan Mau",R.drawable.pie,20000));
        mArraylistMenu.add(new Menu("Banh mi","144 Cong Quynh",R.drawable.banhmi,15000));
        mArraylistMenu.add(new Menu("Com ga","28 Ba Hom",R.drawable.comga,50000));
        mArraylistMenu.add(new Menu("Oc gia dinh","100 duong so 3",R.drawable.oc,30000));
        mArraylistMenu.add(new Menu("Pizza","51 Ly Thuong Kiet",R.drawable.pizza,200000));
        return mArraylistMenu;
    }
}

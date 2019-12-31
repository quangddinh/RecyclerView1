package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.*;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>  {

    private ArrayList<Menu> mArrayMenus;

    public MenuAdapter(ArrayList<Menu> mArrayMenus) {
        this.mArrayMenus = mArrayMenus;
    }
    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_menu,parent,false);
        MenuViewHolder holder = new MenuViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menu = mArrayMenus.get(position);
        holder.mIvMenu.setImageResource(menu.getHinhanh());
        holder.mTvTen.setText(menu.getName());
        holder.mTvMota.setText(menu.getMota());
        holder.mTvGia.setText(" " +menu.getGia());
    }

    @Override
    public int getItemCount() {
        return mArrayMenus!= null ? mArrayMenus.size() : 0;
    }

    class MenuViewHolder extends ViewHolder {
        ImageView mIvMenu;
        TextView mTvTen, mTvGia, mTvMota;
        // ánh xạ

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);

            mIvMenu = itemView.findViewById(R.id.ivMonan);
            mTvGia = itemView.findViewById(R.id.tvGiaMonan);
            mTvMota = itemView.findViewById(R.id.tvMotaMonan);
            mTvTen = itemView.findViewById(R.id.tvTenMonan);
        }
    }
}

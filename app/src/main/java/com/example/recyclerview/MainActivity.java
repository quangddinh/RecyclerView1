package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvMenu;
    MenuAdapter mMenuAdapter;
    ArrayList<Menu> mArraylistMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvMenu = findViewById(R.id.rcvMenu);
        mArraylistMenu = Menu.mock();
        mMenuAdapter = new MenuAdapter(mArraylistMenu);
        mRcvMenu.setAdapter(mMenuAdapter);
// mock is fake data, tranh tinh trang muon dung` nhieu noi ma ko can copy
    }
}

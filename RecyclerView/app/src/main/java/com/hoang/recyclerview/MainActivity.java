package com.hoang.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewDatas = getDataForRecyclerView();
        recyclerViewLandscape = findViewById(R.id.recyderLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();

        LandScape landScape1 = new LandScape(
                "flag_tower_of_hanoi",
                "Cột cờ Hà Nội"
        );
        dsDuLieu.add(landScape1);

        dsDuLieu.add(new LandScape(
                "effel",
                "Tháp Effel"
        ));

        dsDuLieu.add(new LandScape(
                "buckingham",
                "Cung điện Buckingham"
        ));
        return dsDuLieu;
    }
}
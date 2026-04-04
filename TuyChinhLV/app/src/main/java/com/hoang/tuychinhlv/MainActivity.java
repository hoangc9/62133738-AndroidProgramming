package com.hoang.tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tìm listview
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        // Chuẩn bị nguồn dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả ở đây", R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm sườn trứng", 27000, "Mô tả ở đây", R.drawable.ctdb));
        dsMonAn.add(new MonAn("Gà xối mỡ", 30000, "Mô tả ở đây", R.drawable.cgsm));
        dsMonAn.add(new MonAn("Sườn bì chả", 32000, "Mô tả ở đây", R.drawable.ctst));
        dsMonAn.add(new MonAn("Đặc biệt", 35000, "Mô tả ở đây", R.drawable.ctsbc));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy phần tử được chạm
                MonAn monAnChon = dsMonAn.get(i);
                // Làm gì đó, tùy bạn

                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package thigk2.NguyenNhatHoang.baigiuaky;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class Feature3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature3);

        // Dùng ảnh mặc định ic_launcher_background, thay bằng ảnh thật nếu có
        List<TouristSpot> danhSach = Arrays.asList(
                new TouristSpot("Vinpearl", "Đảo Vinpearl, Nha Trang", R.drawable.ic_launcher_background),
                new TouristSpot("Tháp Bà Ponaga", "Đường 2 tháng 4, Nha Trang", R.drawable.ic_launcher_background),
                new TouristSpot("Chùa Long Sơn", "Đường 23 Tháng 10, Nha Trang", R.drawable.ic_launcher_background),
                new TouristSpot("Bãi Tắm", "Bờ biển Trần Phú, Nha Trang", R.drawable.ic_launcher_background),
                new TouristSpot("Đảo Khỉ", "Vịnh Nha Trang, Khánh Hòa", R.drawable.ic_launcher_background)
        );

        ListView listView = findViewById(R.id.listTourist);
        TouristAdapter adapter = new TouristAdapter(this, danhSach);
        listView.setAdapter(adapter);
    }
}
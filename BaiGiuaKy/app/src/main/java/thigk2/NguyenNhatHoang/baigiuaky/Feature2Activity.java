package thigk2.NguyenNhatHoang.baigiuaky;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class Feature2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature2);

        List<String> danhSach = Arrays.asList(
                "Thái Nguyên",
                "Sài Gòn",
                "Đồng Tháp",
                "Nha Trang",
                "Cần Thơ",
                "Hải Phòng",
                "Hà Nội",
                "Đà Lạt",
                "Phú Yên",
                "Nguyễn Nhật Hoàng"
        );

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                danhSach
        );
        listView.setAdapter(adapter);
    }
}
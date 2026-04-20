package thigk2.NguyenNhatHoang.baigiuaky;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Feature1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature1);

        EditText edtDai = findViewById(R.id.edtDai);
        EditText edtRong = findViewById(R.id.edtRong);
        Button btnTinh = findViewById(R.id.btnTinh);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        btnTinh.setOnClickListener(v -> {
            String strDai = edtDai.getText().toString().trim();
            String strRong = edtRong.getText().toString().trim();

            if (strDai.isEmpty() || strRong.isEmpty()) {
                Toast.makeText(this, "Vui long nhap day du", Toast.LENGTH_SHORT).show();
                return;
            }

            double dai = Double.parseDouble(strDai);
            double rong = Double.parseDouble(strRong);

            double chuVi = 2 * (dai + rong);
            double dienTich = dai * rong;

            tvKetQua.setText(
                    "Chieu dai: " + dai + " m\n" +
                            "Chieu rong: " + rong + " m\n\n" +
                            "Chu vi: " + chuVi + " m\n" +
                            "Dien tich: " + dienTich + " m²"
            );
        });
    }
}
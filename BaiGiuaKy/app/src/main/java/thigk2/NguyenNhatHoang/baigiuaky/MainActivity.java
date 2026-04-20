package thigk2.NguyenNhatHoang.baigiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnF1 = findViewById(R.id.btnFeature1);
        Button btnF2 = findViewById(R.id.btnFeature2);
        Button btnF3 = findViewById(R.id.btnFeature3);
        Button btnF4 = findViewById(R.id.btnFeature4);

        btnF1.setOnClickListener(v -> startActivity(new Intent(this, Feature1Activity.class)));
        btnF2.setOnClickListener(v -> startActivity(new Intent(this, Feature2Activity.class)));
        btnF3.setOnClickListener(v -> startActivity(new Intent(this, Feature3Activity.class)));
        btnF4.setOnClickListener(v -> startActivity(new Intent(this, Feature4Activity.class)));
    }
}
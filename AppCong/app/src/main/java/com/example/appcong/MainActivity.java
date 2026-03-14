package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText edtA, edtb, edtKetQua;
    Button btnCong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtA);
        edtb = findViewById(R.id.edtb);
        edtKetQua = findViewById(R.id.editTextText3);
        btnCong = findViewById(R.id.btnCong);
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(edtA.getText().toString());
                double b = Double.parseDouble(edtb.getText().toString());
                double tong = a + b;
                edtKetQua.setText(String.valueOf(tong));
            }
        });
    }
}
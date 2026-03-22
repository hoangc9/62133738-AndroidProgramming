package com.example.xulyxukien;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();

                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);

                float kq = soA + soB;

                EditText editTextKQ = findViewById(R.id.edtKetQua);
                editTextKQ.setText(String.valueOf(kq));
            }
        };

        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();

                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);

                float kq = soA - soB;

                EditText editTextKQ = findViewById(R.id.edtKetQua);
                editTextKQ.setText(String.valueOf(kq));
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();

                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);

                float kq = soA * soB;

                EditText editTextKQ = findViewById(R.id.edtKetQua);
                editTextKQ.setText(String.valueOf(kq));
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soThu1 = editTextSo1.getText().toString();
                String soThu2 = editTextSo2.getText().toString();

                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);

                if (soB == 0) {
                    editTextKQ.setText("Không chia cho 0");
                    return;
                }

                float kq = soA / soB;
                editTextKQ.setText(String.valueOf(kq));
            }
        });
    }
    void TimDieuKhien(){
        EditText editTextSo1 = findViewById(R.id.edtSo1);
        EditText editTextSo2 = findViewById(R.id.edtSo2);
        EditText editTextKQ = findViewById(R.id.edtKetQua);
        nutCong= (Button) findViewById(R.id.btnCong);
        nutTru= (Button) findViewById(R.id.btnTru);
        nutNhan= (Button) findViewById(R.id.btnNhan);
        nutChia= (Button) findViewById(R.id.btnChia);
    }
    void XULY_CONG(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 + num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_TRU(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 - num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_NHAN(){
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 * num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_CONGCHIA{
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 / num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
}
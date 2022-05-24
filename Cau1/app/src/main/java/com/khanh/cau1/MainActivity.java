package com.khanh.cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editCanhKe, editChieuCao, editCanhDay;
    TextView textViewKetQua;
    Button nutTinhChuVi, nutTinhDienTich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget(){
        editCanhKe = (EditText)findViewById(R.id.edCanhKe);
        editChieuCao = (EditText)findViewById(R.id.edChieuCao);
        editCanhDay = (EditText)findViewById(R.id.edCanhDay);
        textViewKetQua = (TextView)findViewById(R.id.tvKetQua);
        nutTinhChuVi = (Button)findViewById(R.id.btnChuVi);
        nutTinhDienTich = (Button)findViewById(R.id.btnDienTich);
    }
    public void TinhChuVi(View v){
        //lay du lieu
        String sA = editCanhDay.getText().toString();
        String sB = editCanhKe.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int chuvi = 2 * (a + b);
        //chuyen tong thanh chuoi
        String chuoiTru = String.valueOf(chuvi);
        //
        textViewKetQua.setText("Kết quá: " + chuoiTru);
    }

    public void TinhDienTich(View v){
        //lay du lieu
        String sA = editCanhDay.getText().toString();
        String sH = editChieuCao.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int h = Integer.parseInt(sH);
        //
        int dientich = a * h;
        //chuyen tong thanh chuoi
        String chuoiTru = String.valueOf(dientich);
        //
        textViewKetQua.setText("Kết quá: " + chuoiTru);
    }
}
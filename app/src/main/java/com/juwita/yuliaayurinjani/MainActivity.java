package com.juwita.yuliaayurinjani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnhonda, btntoyota, btnbmw;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }


    private void inisialisasiView() {
        btnhonda = findViewById(R.id.btn_buka_honda);
        btntoyota = findViewById(R.id.btn_buka_toyota);
        btnbmw = findViewById(R.id.btn_buka_bmw);

        btnhonda.setOnClickListener(view -> bukaGaleri("Honda"));
        btntoyota.setOnClickListener(view -> bukaGaleri("Toyota"));
        btnbmw.setOnClickListener(view -> bukaGaleri("Bmw"));
    }

    private void bukaGaleri(String jenisMobil) {
        Log.d("MAIN","Buka activity horror");
        Intent intent = new Intent(this, DaftarMobilActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisMobil);
        startActivity(intent);
    }
    public void Pindahbiodata(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
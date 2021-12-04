package com.juwita.yuliaayurinjani;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.juwita.yuliaayurinjani.model.Mobil;
public class ProfileMobil extends AppCompatActivity {

    Mobil mobil;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivPosterFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);
        Intent intent = getIntent();
        mobil = (Mobil) intent.getSerializableExtra(DaftarMobilActivity.MOBIL_TERPILIH);
        inisialisasiView();
        tampilkanProfil(mobil);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txGenre);
        txAsal = findViewById(R.id.txNama);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivPosterFilm = findViewById(R.id.gambarMobil);
    }


    private void tampilkanProfil(Mobil mobil) {
        Log.d("Profil","Menampilkan "+mobil.getJeniMobil());
        txJudul.setText(mobil.getNamaMobil());
        txJenis.setText(mobil.getJeniMobil());
        txAsal.setText(mobil.getAsalMobil());
        txDeskripsi.setText(mobil.getDescMobil());
        ivPosterFilm.setImageDrawable(this.getDrawable(mobil.getGambarMobil()));
    }

}

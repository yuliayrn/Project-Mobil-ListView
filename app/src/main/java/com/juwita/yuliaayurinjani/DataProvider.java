package com.juwita.yuliaayurinjani;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.juwita.yuliaayurinjani.model.Mobil;
import com.juwita.yuliaayurinjani.model.Toyota;
import com.juwita.yuliaayurinjani.model.Honda;
import com.juwita.yuliaayurinjani.model.Bmw;
public class DataProvider {

    private static List<Mobil> mobils = new ArrayList<>();

    private static List<Honda> initHonda(Context ctx) {
        List<Honda> hondas = new ArrayList<>();
        hondas.add(new Honda("AVANZA", "Honda",
                "Toyota Avanza adalah mobil yang diproduksi di Indonesia oleh pabrikan Daihatsu, yang dipasarkan juga oleh Daihatsu dengan nama Daihatsu Xenia. Generasi pertama mobil ini diluncurkan pada Desember 2003.[1] Nama \"Avanza\" berasal dari bahasa Italia dan bahasa Spanyol avanzato/avanza, yang berarti peningkatan.", R.drawable.avanza));
        hondas.add(new Honda("Xenia", "Honda",
                "Daihatsu Xenia adalah nama mobil jenis MPV yang dirancang dan diproduksi bersama oleh Astra Daihatsu Motor dan Toyota-Astra Motor. ... Untuk suspensi depan, Xenia menggunakan MacPherson strut. Sedangkan pada varian 1.3 dan 1.5 telah ditambahkan stabilizer.Daihatsu Xenia adalah nama mobil jenis MPV yang dirancang dan diproduksi bersama oleh Astra Daihatsu Motor dan Toyota-Astra Motor Untuk suspensi depan, Xenia menggunakan MacPherson strut. Sedangkan pada varian 1.3 dan 1.5 telah ditambahkan stabilizer.", R.drawable.xenia));
        hondas.add(new Honda("Honda HRV", "Honda",
                "Honda HR-V adalah sebuah mobil SUV mini yang diproduksi oleh Honda pada tahun 1998 sampai 2006 lalu dari tahun 2014 sampai sekarang. Generasi pertama HR-V berbasis dari Logo dan dijual di Jepang dan beberapa negara di Asia-Pasifik dari tahun 1998 sampai 2006.", R.drawable.hrv));
        return hondas;
    }

    private static List<Toyota> initToyota(Context ctx) {
        List<Toyota> toyotas = new ArrayList<>();
        toyotas.add(new Toyota("Inova", "Toyota",
                "Toyota Kijang Innova adalah sebuah Mobil MPV buatan Toyota Motor Corporation yang diproduksi di Indonesia oleh Toyota-Astra Motor sejak tahun 2004.", R.drawable.inova));
        toyotas.add(new Toyota("Civic", "Toyota ",
                "Honda Civic adalah mobil yang diproduksi oleh Honda Motor Co. Pertama kali diperkenalkan pada Juli 1972 sebagai coupé 2 pintu, diikuti dengan versi hatchback 3 pintu pada September tahun itu juga. Mobil ini menganut sistem gerak roda depan, di mana mesinnya diletakan melintang, sehingga dapat menyediakan ruang interior yang cukup luas walaupun dimensi mobil terbilang kecil.", R.drawable.civic));
        toyotas.add(new Toyota("Brio", "Toyota",
                " Brio adalah mobil berjenis hatchback subkompak 5 pintu yang diproduksi oleh Honda di Indonesia dan Thailand. Mobil ini diperkenalkan pada bulan Maret 2011.", R.drawable.brio));
        return toyotas;
    }

    private static List<Bmw> initBMW(Context ctx) {
        List<Bmw> bmws = new ArrayList<>();
        bmws.add(new Bmw("BMWX1", "BMW",
                "BMW X1 adalah SUV kompak berkategori mewah yang diproduksi oleh BMW dan BMW Brilliance. X1 tersedia dengan penggerak roda belakang (sDrive) atau all-wheel-drive (xDrive). Mobil konsepnya diperkenalkan pertama kali pada ajang Paris Motor Show 2008.", R.drawable.bmwx1));
        bmws.add(new Bmw("BMWX2", "BMW",
                "The BMW X2 (model code F39) is a subcompact luxury crossover SUV produced by BMW. It was first showcased as the BMW Concept X2 at the 2016 Paris Motor Show,[3] with a production version unveiled in October 2017.[", R.drawable.bmwx2));
        bmws.add(new Bmw("BMWX3", "BMW",
                "BMW X3 merupakan mobil SUV medium mewah yang diproduksi oleh perusahaan Jerman, BMW sejak 2003.SUV ini berbasis dari platform BMW Seri 3, dan sekarang di generasi ketiga, BMW menyebut crossover ini sebagai Sport Activity Vehicle (SAV), deskriptor perusahaan untuk kendaraan X-Linenya", R.drawable.bmwx3));
        return bmws;
    }


    private static void initAllMobil(Context ctx) {
        mobils.addAll(initHonda(ctx));
        mobils.addAll(initToyota(ctx));
        mobils.addAll(initBMW(ctx));
    }

    public static List<Mobil> getAllMobil(Context ctx) {
        if (mobils.size() == 0) {
            initAllMobil(ctx);
        }
        return  mobils;
    }

    public static List<Mobil> getMobilsByTipe(Context ctx, String jenis) {
        List<Mobil> mobilByType = new ArrayList<>();
        if (mobils.size() == 0) {
            initAllMobil(ctx);
        }
        for (Mobil m : mobils) {
            if (m.getJeniMobil().equals(jenis)) {
                mobilByType.add(m);
            }
        }
        return mobilByType;
    }
}

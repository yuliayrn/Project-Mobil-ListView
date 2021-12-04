package com.juwita.yuliaayurinjani;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import com.juwita.yuliaayurinjani.model.Mobil;
public class DaftarMobilAdapter  extends ArrayAdapter<Mobil>{

    Context context;

    public DaftarMobilAdapter(Context context, List<Mobil> mobils) {
        super(context, R.layout.row_daftar_mobil, mobils);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView jenismobil;
        TextView textNama;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Mobil mobil = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_mobil, parent, false);
            viewHolder.jenismobil =  convertView.findViewById(R.id.row_text_genre);
            viewHolder.textNama = (TextView) convertView.findViewById(R.id.row_text_nama_mobil);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_mobil);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.jenismobil.setText(mobil.getJeniMobil());
        viewHolder.textNama.setText(mobil.getNamaMobil());
        viewHolder.gambar.setImageDrawable(context.getDrawable(mobil.getGambarMobil()));
        return convertView;
    }

}

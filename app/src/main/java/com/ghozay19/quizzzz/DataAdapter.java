package com.ghozay19.quizzzz;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

/**
 * Created by {$user} on 25/02/2019.
 * at 10:31
 * Copyright (c) 2019 Naghom Dev All rights reserved.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private List<Model> mDataItems;
    private Context context;

    public DataAdapter(Context context, List<Model> mDataItems){
        this.context = context;
        this.mDataItems = mDataItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        final  Model items = mDataItems.get(position);

        double amount = items.getHarga();
        Locale locale = new Locale("EN", "ID");
        Currency currency = Currency.getInstance(locale);
        String symbol = currency.getSymbol(locale);

        //String harga = String.valueOf(amount);
        String harga = FormatterUtil.bigDecimalFormat(new BigDecimal(amount));


        holder.tvNama.setText(items.getNama());
        holder.tvHarga.setText(symbol +" "+ harga);

        Log.d("hargaaaa", harga);
        String imageFile = items.getImage();

        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Drawable d = Drawable.createFromStream(inputStream,null);
        holder.imageView.setImageDrawable(d);

    }

    @Override
    public int getItemCount() {
        if (mDataItems == null) return 0;
        return mDataItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView tvNama, tvHarga;
        private CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivProduk);
            tvNama = itemView.findViewById(R.id.tvNamaProduk);
            tvHarga = itemView.findViewById(R.id.tvHargaProduk);
            cardView = itemView.findViewById(R.id.cvList);

        }
    }
}

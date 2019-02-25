package com.ghozay19.quizzzz;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by {$user} on 25/02/2019.
 * at 10:23
 * Copyright (c) 2019 Naghom Dev All rights reserved.
 */
public class Model implements Parcelable {
    String nama;
    String keterangan;
    int harga;
    String image;


    protected Model(Parcel in) {
        nama = in.readString();
        keterangan = in.readString();
        harga = in.readInt();
        image = in.readString();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Model(String nama, String keterangan, int harga, String image) {
        this.nama = nama;
        this.keterangan = keterangan;
        this.harga = harga;
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(keterangan);
        dest.writeInt(harga);
        dest.writeString(image);
    }
}

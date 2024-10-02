package com.example.myfragment;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView profileImage = findViewById(R.id.profile_image);

        // Menggunakan Glide dengan circleCrop untuk membuat gambar bulat
        Glide.with(this)
                .load("https://www.example.com/agas.jpg") // Ganti dengan URL yang benar
                .circleCrop()
                .placeholder(R.drawable.agas) // Tambahkan gambar sementara
                               .into(profileImage);
    }
}

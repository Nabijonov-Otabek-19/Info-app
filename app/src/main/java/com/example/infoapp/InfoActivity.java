package com.example.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private ImageView image, btnBack;
    private TextView title, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);
        loadData(number);
    }

    private void loadData(int number) {
        image = findViewById(R.id.img_animal);
        title = findViewById(R.id.txt_animalName);
        desc = findViewById(R.id.txt_about);
        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(view -> {
            finish();
        });

        if (number == 1) {
            image.setImageResource(R.drawable.cat);
            title.setText("CAT");
            desc.setText(R.string.cat);

        } else if (number == 2) {

            image.setImageResource(R.drawable.dog);
            title.setText("dog");
            desc.setText(R.string.dog);

        } else if (number == 3) {

            image.setImageResource(R.drawable.lion);
            title.setText("lion");
            desc.setText(R.string.lion);

        } else if (number == 4) {
            image.setImageResource(R.drawable.begemot);
            title.setText("hypopotamus");
            desc.setText(R.string.begemot);

        } else if (number == 5) {
            image.setImageResource(R.drawable.kangaroo);
            title.setText("kangaroo");
            desc.setText(R.string.kangaroo);

        } else if (number == 6) {
            image.setImageResource(R.drawable.zebra);
            title.setText("zebra");
            desc.setText(R.string.zebra);

        } else if (number == 7) {
            image.setImageResource(R.drawable.jiraf);
            title.setText("giraffe");
            desc.setText(R.string.jiraf);

        } else if (number == 8) {
            image.setImageResource(R.drawable.wolf);
            title.setText("wolf");
            desc.setText(R.string.wolf);

        } else if (number == 9) {
            image.setImageResource(R.drawable.fox);
            title.setText("fox");
            desc.setText(R.string.fox);

        } else {
            image.setImageResource(R.drawable.elephant);
            title.setText("elephant");
            desc.setText(R.string.elephant);
        }
    }
}
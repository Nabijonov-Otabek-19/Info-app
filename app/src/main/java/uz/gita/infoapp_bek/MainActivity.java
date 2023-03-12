package uz.gita.infoapp_bek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.cat).setOnClickListener(view -> openWindow(1));
        findViewById(R.id.dog).setOnClickListener(view -> openWindow(2));
        findViewById(R.id.lion).setOnClickListener(view -> openWindow(3));
        findViewById(R.id.begemot).setOnClickListener(view -> openWindow(4));
        findViewById(R.id.kangaroo).setOnClickListener(view -> openWindow(5));
        findViewById(R.id.zebra).setOnClickListener(view -> openWindow(6));
        findViewById(R.id.jiraf).setOnClickListener(view -> openWindow(7));
        findViewById(R.id.wolf).setOnClickListener(view -> openWindow(8));
        findViewById(R.id.fox).setOnClickListener(view -> openWindow(9));
        findViewById(R.id.elephant).setOnClickListener(view -> openWindow(10));
    }

    private void openWindow(int num) {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("number", num);
        startActivity(intent);
    }
}
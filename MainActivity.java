package com.example.akpinar.odev12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void YAZDIR(View view) {
        EditText etAd =(EditText) findViewById(R.id.etName);
        EditText etSoyad =(EditText) findViewById(R.id.etSurname);
        TextView tvSonuc =(TextView) findViewById(R.id.tvSonuc);

        String ad=etAd.getText().toString().trim()+etSoyad.getText().toString().trim();
        if (ad.isEmpty())
            Toast.makeText(this, "Lütfen Alanları Doldurunuz!", Toast.LENGTH_SHORT).show();
        else {
            for (int i = 0; i < ad.length(); i++)
                tvSonuc.setText(tvSonuc.getText() + "\n" + ad.substring(i, i + 1));
        }
    }
}

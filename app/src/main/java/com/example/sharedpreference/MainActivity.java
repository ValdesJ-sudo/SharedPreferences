package com.example.sharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void btn_shared(View v){
        Intent shared = new Intent(this, MainShared.class);
        startActivity(shared);
    }
    public void btn_agenda(View v){
        Intent agenda = new Intent(this, MainAgenda.class);
        startActivity(agenda);
    }
    public void btn_nota(View v){
        Intent nota = new Intent(this, MainNota.class);
        startActivity(nota);
    }
    public void btn_name1(View v){
        Intent nombre1 = new Intent(this, MainNombreUno.class);
        startActivity(nombre1);
    }
    public void btn_name2(View v){
        Intent nombre2 = new Intent(this, MainNombreDos.class);
        startActivity(nombre2);
    }
}
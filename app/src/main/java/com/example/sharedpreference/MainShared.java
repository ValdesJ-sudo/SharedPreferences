package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainShared extends AppCompatActivity {


    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_shared);

        et1 = findViewById(R.id.etEmail);
        SharedPreferences preferences = getSharedPreferences("Datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("Mail", " "));
    }

    public void Guardar(View v){
        SharedPreferences preferences = getSharedPreferences("Datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_Editor = preferences.edit();
        Obj_Editor.putString("Mail", et1.getText().toString());
        finish();
    }
}
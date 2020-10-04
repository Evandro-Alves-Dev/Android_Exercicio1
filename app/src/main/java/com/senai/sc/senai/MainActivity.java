package com.senai.sc.senai;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar(View v){
        EditText editTextTexto1 = findViewById(R.id.et_texto1);
        EditText editTextTexto2 = findViewById(R.id.et_texto2);

        Toast.makeText( MainActivity.this, editTextTexto1.getText() + " " + editTextTexto2.getText(), Toast.LENGTH_LONG).show();
    }
    public void onClickLimpar(View v) {
        EditText limparCampo1 = findViewById(R.id.et_texto1);
        EditText limparCampo2 = findViewById(R.id.et_texto2);

        limparCampo1.setText(" ");
        limparCampo2.setText(" ");

    }

}
package com.example.pablo.burritosbeta2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String nombres="names";
    TextView cajaBienvenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cajaBienvenido=(TextView)findViewById(R.id.txtbienvenido);
        String usuario=getIntent().getStringExtra("names");
        cajaBienvenido.setText("¡Bienvenido "+ usuario + "!");
    }
}
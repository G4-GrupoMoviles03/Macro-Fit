package com.misiontic.macrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class objetivo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_objetivo );

        Button siguiente = findViewById(R.id.btnsiguienteobjetivo);
        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(objetivo.this, resultado.class);
                startActivityForResult(intencion, 0);
            }

        } );

        TextView registrarse = findViewById(R.id.txtvolverobjetivo);
        registrarse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(objetivo.this, actividadfisica.class);
                startActivityForResult(intencion, 0);
            }
        } );
    }
}
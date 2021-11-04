package com.misiontic.macrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class actividadfisica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_actividadfisica );

        Button siguiente = findViewById(R.id.btnsiguienteactfisica);
        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(actividadfisica.this, objetivo.class);
                startActivityForResult(intencion, 0);
            }

        } );

        TextView volver = findViewById(R.id.txtvolveractfisica);
        volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(actividadfisica.this, informacionpersonal.class);
                startActivityForResult(intencion, 0);
            }
        } );

    }
}
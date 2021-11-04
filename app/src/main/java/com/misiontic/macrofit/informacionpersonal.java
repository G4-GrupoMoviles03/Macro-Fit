package com.misiontic.macrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class informacionpersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_informacionpersonal );

        Button siguiente = findViewById(R.id.btnsiguienteinfopersonal);
        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(informacionpersonal.this, actividadfisica.class);
                startActivityForResult(intencion, 0);
            }

        } );

        TextView volver = findViewById(R.id.txtvolverinfopersonal);
        volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(informacionpersonal.this, home.class);
                startActivityForResult(intencion, 0);
            }
        } );

    }
}
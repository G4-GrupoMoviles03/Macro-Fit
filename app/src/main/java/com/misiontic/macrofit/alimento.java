package com.misiontic.macrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class alimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_alimento );

        TextView volver = findViewById(R.id.txtvolveralimento);
        volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(alimento.this, home.class);
                startActivityForResult(intencion, 0);
            }
        } );
    }
}
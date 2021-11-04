package com.misiontic.macrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_resultado );

        Button siguiente = findViewById(R.id.btncerrarresultado);
        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(resultado.this, home.class);
                startActivityForResult(intencion, 0);
            }

        } );

        TextView volver = findViewById(R.id.txtvolverrsultado);
        volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(resultado.this, objetivo.class);
                startActivityForResult(intencion, 0);
            }
        } );

    }
}
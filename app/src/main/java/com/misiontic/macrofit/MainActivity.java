package com.misiontic.macrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button ingresar = findViewById(R.id.btnIngresar);
        ingresar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

            Intent intencion = new Intent(MainActivity.this, home.class);
                startActivityForResult(intencion, 0);
        }

        } );

        TextView registrarse = findViewById(R.id.txtRegistrarse);
        registrarse.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent intencion = new Intent(MainActivity.this, informacionpersonal.class);
                    startActivityForResult(intencion, 0);
                }




        } );
    }



}
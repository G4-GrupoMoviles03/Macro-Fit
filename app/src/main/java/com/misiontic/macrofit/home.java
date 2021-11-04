package com.misiontic.macrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );

        Button salir = findViewById(R.id.btnSalir);
        salir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(home.this, MainActivity.class);
                startActivityForResult(intencion, 0);
            }

        } );

        TextView perfil = findViewById(R.id.txtperfilmenu);
        perfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(home.this, informacionpersonal.class);
                startActivityForResult(intencion, 0);
            }
        } );

        TextView alimento = findViewById(R.id.txtalimentomenu);
        alimento.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(home.this, alimento.class);
                startActivityForResult(intencion, 0);
            }
        } );

        TextView prepararcomida = findViewById(R.id.txtprepararcomida);
        prepararcomida.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(home.this, prepararcomida.class);
                startActivityForResult(intencion, 0);
            }
        } );

        TextView verperfil = findViewById(R.id.txtverperfil);
        verperfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencion = new Intent(home.this, resultado.class);
                startActivityForResult(intencion, 0);
            }
        } );

    }
}
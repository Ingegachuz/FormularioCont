package com.ingegachuz.formulariocontacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private EditText campoNombre, campoTelefono, campoEmail, campoDescrip;
    private Button miBoton;



   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        campoNombre = (EditText) findViewById(R.id.etNombre);
        campoTelefono =(EditText) findViewById(R.id.etTelefono);
        campoEmail =   (EditText) findViewById(R.id.etEmail);
        campoDescrip = (EditText) findViewById(R.id.etDescrip);
        miBoton =      (Button) findViewById(R.id.btnButton);


        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmacionDatos.class);
                intent.putExtra("nombre", campoNombre.getText() + "");
                intent.putExtra("telefono", campoTelefono.getText() + "");
                intent.putExtra("email", campoEmail.getText() + "");
                intent.putExtra("descripcion", campoDescrip.getText() + "");
                startActivity(intent);


            }
        });

       Bundle parametros = getIntent().getExtras();
       if(parametros != null) {
           String nombre = parametros.getString("NOMBRE");
           String fecha = parametros.getString("FECHA");
           String telefono = parametros.getString("TELEFONO");
           String email = parametros.getString("EMAIL");
           String desc = parametros.getString("DESC");
           campoNombre.setText(nombre);
           campoTelefono.setText(telefono);
           campoEmail.setText(email);
           campoDescrip.setText(desc);
       }
    }
    }










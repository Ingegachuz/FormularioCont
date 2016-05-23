package com.ingegachuz.formulariocontacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

  public class ConfirmacionDatos extends AppCompatActivity {

      private TextView tvNombre, tvTel, tvCorreo, tvDescripcion, tvFecha;
      private Button btnEditar;


      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_confirmacion_datos);
          editarDatos();

          tvNombre = (TextView) findViewById(R.id.tvNombre);
          tvTel = (TextView) findViewById(R.id.tvTel);
          tvCorreo = (TextView) findViewById(R.id.tvCorreo);
          tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
          tvFecha = (TextView) findViewById(R.id.tvFecha);

          String nombre = getIntent().getStringExtra("nombre");
          String telefono = getIntent().getStringExtra("telefono");
          String email = getIntent().getStringExtra("email");
          String descripcion = getIntent().getStringExtra("descripcion");
          String fecha = getIntent().getStringExtra("fecha");


          tvNombre.setText(nombre);
          tvTel.setText("Teléfono: " + telefono);
          tvCorreo.setText("Email: " + email);
          tvDescripcion.setText("Descripción: " + descripcion);
          tvFecha.setText("Fecha Nacimiento: " + fecha);

      }

      public void editarDatos() {
          btnEditar = (Button) findViewById(R.id.btnEditar);
          tvNombre = (TextView) findViewById(R.id.tvNombre);
          tvFecha = (TextView) findViewById(R.id.tvFecha);
          tvTel = (TextView) findViewById(R.id.tvTel);
          tvCorreo = (TextView) findViewById(R.id.tvCorreo);
          tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
          btnEditar.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  Intent i = new Intent(ConfirmacionDatos.this, MainActivity.class);
                  i.putExtra("NOMBRE", tvNombre.getText().toString());
                  i.putExtra("FECHA", tvFecha.getText().toString());
                  i.putExtra("TELEFONO", tvTel.getText().toString());
                  i.putExtra("EMAIL", tvCorreo.getText().toString());
                  i.putExtra("DESC", tvDescripcion.getText().toString());
                  startActivity(i);
              }
          });


      }
  }





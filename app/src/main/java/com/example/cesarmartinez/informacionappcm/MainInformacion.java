package com.example.cesarmartinez.informacionappcm;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainInformacion extends AppCompatActivity {

    TextView nombre;
    TextView apellido;
    TextView correo;
    TextView direccion;
    TextView telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_informacion);

        nombre = (TextView) findViewById(R.id.RNombre);
        apellido = (TextView) findViewById(R.id.RApellido);
        correo = (TextView) findViewById(R.id.REmail);
        direccion = (TextView) findViewById(R.id.RDireccion);
        telefono = (TextView) findViewById(R.id.RTelefono);


        Bundle bundle = getIntent().getExtras(); // Extrae la informacion

        if(bundle != null) {

            String Nombre = bundle.getString("Nombre").toString();
            String Apellido = bundle.getString("Apellido").toString();
            String Correo = bundle.getString("Correo Electronico").toString();
            String Direccion = bundle.getString("Direccion").toString();
            String Telefono = bundle.getString("Telefono").toString();

            nombre.setText(Nombre);
            apellido.setText(Apellido);
            correo.setText(Correo);
            direccion.setText(Direccion);
            telefono.setText(Telefono);

        }


    }
}

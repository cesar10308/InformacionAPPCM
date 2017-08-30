package com.example.cesarmartinez.informacionappcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;

public class DatosActivity extends AppCompatActivity {

    @BindView(R.id.txtNombre)
    EditText txtNombre;

    @BindView(R.id.txtApellido)
    EditText txtApellido;

    @BindView(R.id.txtEmail)
    EditText txtEmail;

    @BindView(R.id.txtDireccion)
    EditText txtDireccion;

    @BindView(R.id.txtNumero)
    EditText txtNumero;

    @BindView(R.id.btnEnviar)
    Button btnEnviar;

    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        enviar= (Button)findViewById(R.id.btnEnviar); // Registrar va a ser igual al boton que tiene como id btnRegistrar
        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtApellido = (EditText)findViewById(R.id.txtApellido);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtDireccion = (EditText)findViewById(R.id.txtDireccion);
        txtNumero = (EditText)findViewById(R.id.txtNumero);

        enviar.setOnClickListener(new View.OnClickListener() { // Registrar va a ser de tipo OnClick y se declara un nuevo OnClick
            @Override
            public void onClick(View view) { //Se declara el metodo onClick

                Intent registrar = new Intent(DatosActivity.this, MainInformacion.class); // Se declara un nuevo intent de nombre registrar el cual vamos a pasar de Login a Registrar

                //getIntent().putExtra("Nombre",txtNombre.getText().toString());
                //getIntent().putExtra("Apellido",txtApellido.getText().toString());
                //getIntent().putExtra("Correo Electronico",txtEmail.getText().toString());
                //getIntent().putExtra("Direccion",txtDireccion.getText().toString());
                //getIntent().putExtra("Numero",txtNumero.getText().toString());

                String Nombre = txtNombre.getText().toString();
                String Apellido = txtApellido.getText().toString();
                String Correo = txtEmail.getText().toString();
                String Direccion = txtDireccion.getText().toString();
                String Telefono = txtNumero.getText().toString();

                registrar.putExtra("Nombre",Nombre);
                registrar.putExtra("Apellido",Apellido);
                registrar.putExtra("Correo Electronico",Correo);
                registrar.putExtra("Direccion",Direccion);
                registrar.putExtra("Telefono",Telefono);

                startActivity(registrar); //Iniciamos la activity
            }
        });
    }
}

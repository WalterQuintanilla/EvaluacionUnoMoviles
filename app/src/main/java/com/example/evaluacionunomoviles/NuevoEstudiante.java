package com.example.evaluacionunomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.evaluacionunomoviles.MainActivity.TAG_MESSAGE;
import static com.example.evaluacionunomoviles.MainActivity.listaEstudiantes;

import Entidad.Estudiante;

public class NuevoEstudiante extends AppCompatActivity {

    EditText nombre;
    EditText codigo;
    EditText materia;
    EditText primerParcial;
    EditText segundoParcial;
    EditText tercerParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_estudiante);
        //Inicializamos las variables
        nombre=findViewById(R.id.edtNombre);
        codigo=findViewById(R.id.edtCodigo);
        materia=findViewById(R.id.edtMateria);
        primerParcial=findViewById(R.id.edtPrimerParcial);
        segundoParcial=findViewById(R.id.edtSegundoParcial);
        tercerParcial=findViewById(R.id.edtTercerParcial);

    }
    public void onClickGuardar(View v){
        Estudiante estu=new Estudiante();
        Double promedio=(Double.parseDouble(primerParcial.getText().toString()) * 0.3)+
                (Double.parseDouble(segundoParcial.getText().toString()) * 0.3)+
                (Double.parseDouble(tercerParcial.getText().toString()) * 0.4);
        estu.setId(listaEstudiantes.size()+1);
        estu.setNombre(nombre.getText().toString());
        estu.setCodigo(codigo.getText().toString());
        estu.setMateria(materia.getText().toString());
        estu.setPrimerParcial(Double.parseDouble(primerParcial.getText().toString()));
        estu.setSegundoParcial(Double.parseDouble(segundoParcial.getText().toString()));
        estu.setTercerParcial(Double.parseDouble(tercerParcial.getText().toString()));
        estu.setPromedio(promedio);

        listaEstudiantes.add(estu);

        Intent msj= new Intent();
        msj.putExtra(TAG_MESSAGE,"Estudiante Ingresado");
        setResult(RESULT_OK, msj);
        this.finish();

    }
}

package com.example.evaluacionunomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import Adaptador.AdaptadorEstuduantes;

import static com.example.evaluacionunomoviles.MainActivity.listaEstudiantes;
public class VerListaEstudiantes extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_lista_estudiantes);
        lista=findViewById(R.id.listadoEstudiante);
        lista.setAdapter(new AdaptadorEstuduantes(this,R.layout.modelo,listaEstudiantes));
    }
}

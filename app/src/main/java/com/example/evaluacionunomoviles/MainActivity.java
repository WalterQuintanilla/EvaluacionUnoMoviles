package com.example.evaluacionunomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Entidad.Estudiante;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static List<Estudiante> listaEstudiantes;
    public static final int id=1;
    public static final String TAG_MESSAGE= "msj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaEstudiantes=new ArrayList<>();
    }

    @Override
    public void onClick(View view) {
        Intent miIntent;
        switch (view.getId()) {
            case R.id.btnVerListaEstudiante:
                miIntent= new Intent(MainActivity.this, VerListaEstudiantes.class);
                startActivity(miIntent);
                break;

            case R.id.btnNuevoEstudiante:
                miIntent= new Intent(view.getContext(), com.example.evaluacionunomoviles.NuevoEstudiante.class);
                startActivityForResult(miIntent, id);
                break;

            case R.id.btnmisDatos:
                miIntent=new Intent(MainActivity.this, misDatos.class);
                startActivity(miIntent);

        }
    }
    public void onActivityResult(int RequestCode, int ResultCode, Intent datos){
        super.onActivityResult(RequestCode,ResultCode,datos);
        switch (RequestCode){
            case id:{
                if(ResultCode==RESULT_OK){
                    String mensaje=datos.getStringExtra(TAG_MESSAGE);
                    Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show();
                }
                break;
            }
        }
    }
}

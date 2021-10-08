package com.developer.johhns.json_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contrato>  A1 = new ArrayList<>();
    ArrayList<Contrato>  A2 = new ArrayList<>();
    String               cadenaJSON = "" ;
    RecyclerView         recyclerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poblarArreglo1() ;

        cadenaJSON = Util.convertirArratToJson( A1 ) ;

        A2 = Util.leerJSON( cadenaJSON ) ;

        recyclerView = findViewById( R.id.recView1 ) ;
        recyclerView.setAdapter( new Adaptador(A2) );
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

    }




    private void poblarArreglo1(){
        A1.add( new Contrato( 1 ,"Contrato 1" ) ) ;
        A1.add( new Contrato( 2 ,"Contrato 2" ) ) ;
        A1.add( new Contrato( 3 ,"Contrato 3" ) ) ;
        A1.add( new Contrato( 4 ,"Contrato 4" ) ) ;
        A1.add( new Contrato( 5 ,"Contrato 5" ) ) ;
    }

}
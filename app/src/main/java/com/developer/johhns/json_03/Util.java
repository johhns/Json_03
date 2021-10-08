package com.developer.johhns.json_03;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static String convertirArratToJson(ArrayList<Contrato>  arreglo){
        String resultado = "" ;
        try {
            JSONArray jsonArray = new JSONArray();
            for ( Contrato registro : arreglo ){
                JSONObject contratoObj = new JSONObject();
                contratoObj.put("codigo" , registro.getCodigo() ) ;
                contratoObj.put("nombre" , registro.getNombre() ) ;
                jsonArray.put( contratoObj ) ;
            }
            resultado = jsonArray.toString() ;
        } catch ( JSONException e){
            e.printStackTrace();
        }
        return resultado ;
    }

    public static ArrayList<Contrato> leerJSON( String cadena ){
        ArrayList<Contrato> contratos = new ArrayList<>() ;
        try {
            JSONArray  json_array = new JSONArray( cadena );
            for ( int i = 0 ; i < json_array.length() ; i++ ){
                JSONObject objecto = json_array.getJSONObject( i ) ;
                contratos.add( new Contrato( objecto.getInt("codigo") , objecto.getString("nombre") ) );
            }

        } catch ( JSONException e ) {
            e.printStackTrace();
        }
        return contratos ;
    }



}

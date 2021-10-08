package com.developer.johhns.json_03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador  extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    ArrayList<Contrato> contratos ;

    public Adaptador(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from( parent.getContext() ).inflate( R.layout.registro , null , false ) ;
        return new ViewHolder( vista ) ;
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {
       holder.codigo.setText( String.valueOf( contratos.get( position ).getCodigo() ) );
       holder.nombre.setText( contratos.get( position ).getNombre() );
    }

    @Override
    public int getItemCount() {
        return contratos.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView  codigo , nombre ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            codigo = itemView.findViewById(R.id.txtCodigo) ;
            nombre = itemView.findViewById(R.id.txtNombre) ;
        }
    }
}

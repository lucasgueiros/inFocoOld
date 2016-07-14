package br.edu.ifpe.garanhuns.infoco.views;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ifpe.garanhuns.infoco.R;
import br.edu.ifpe.garanhuns.infoco.dados.interfaces.RepositorioHorario;
import br.edu.ifpe.garanhuns.infoco.dominio.Horario;

/**
 * Created by lucas on 09/07/16.
 */
public class HorarioDeDisciplinaAdapter extends RecyclerView.Adapter {

    Horario [] horarios;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class HorarioViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        public HorarioViewHolder(View itemView, Horario horario) {
            super(itemView);
            this.horario = horario;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public HorarioDeDisciplinaAdapter(Horario[] horarios) {
        this.horarios = horarios;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        HorarioViewHolder vh = new HorarioViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(HorarioViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Horario horario = horarios[position];


    }

    @Override
    public int getItemCount() {
        return horarios.length;
    }
}

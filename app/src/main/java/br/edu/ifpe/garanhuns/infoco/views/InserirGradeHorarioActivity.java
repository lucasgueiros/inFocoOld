package br.edu.ifpe.garanhuns.infoco.views;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.edu.ifpe.garanhuns.infoco.R;
import br.edu.ifpe.garanhuns.infoco.dados.genericos.RepositorioMemoria;
import br.edu.ifpe.garanhuns.infoco.dados.implementacoes.RepositorioHorarioMemoria;
import br.edu.ifpe.garanhuns.infoco.dados.interfaces.RepositorioHorario;

public class InserirGradeHorarioActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RepositorioHorario  repositorioHorario = new RepositorioHorarioMemoria();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_grade_horario);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new HorarioDeDisciplinaAdapter(repositorioHorario);
        mRecyclerView.setAdapter(mAdapter);

    }
}

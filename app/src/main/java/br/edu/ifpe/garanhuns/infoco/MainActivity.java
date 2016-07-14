package br.edu.ifpe.garanhuns.infoco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.edu.ifpe.garanhuns.infoco.views.InserirGradeHorarioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView)  findViewById(R.id.BemVindoText);
        t.setText("Olá! Bem-vindo ao InFoco, o aplicativo focado nas suas necessidades como estudante do IF.");
    }

    public void inserirGradeHorario(View view) {
        startActivity(new Intent(this,InserirGradeHorarioActivity.class));
    }

}

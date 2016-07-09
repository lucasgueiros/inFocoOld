package br.edu.ifpe.garanhuns.infoco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView)  findViewById(R.id.BemBindoText);
        t.setText("Olá! Bem-vindo ao InFoco, o aplicativo focado nas suas necessidades como estudante do IF.");
    }
}

package com.cursoandroidalura.agenda1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
//    possui estados as activities, assim podemos acrescentar estados


    // toda a activity herdada
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        cria um pop que dura um tempo e desaparece mostrando uma mensagem
//        Toast.makeText(this, "Olá Android", Toast.LENGTH_LONG).show();

//        não é uma boa prática colocar muitas coisas dentro da activity porque sobrecarrega a view
//        TextView aluno = new TextView(this);
//        aluno.setText("Olá view");
//        setContentView(aluno);

        setContentView(R.layout.activity_main); // apresenta o layout criado na pasta res/layout, R é a

    }
}

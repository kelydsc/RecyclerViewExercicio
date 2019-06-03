package br.com.digitalhouse.digital.recyclerviewexercicio.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.digital.recyclerviewexercicio.R;
import br.com.digitalhouse.digital.recyclerviewexercicio.adapter.AlunosAdapter;
import br.com.digitalhouse.digital.recyclerviewexercicio.model.Alunos;

public class MainActivity extends AppCompatActivity {

    //atributos
    private RecyclerView recyclerViewAlunos;
    private AlunosAdapter alunosAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instância
        recyclerViewAlunos = findViewById(R.id.listaAlunosRecyclerView);

        //instancia da classe LinearLayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //Setar o layoutManager no recyclerView
        recyclerViewAlunos.setLayoutManager(layoutManager);

        //Inicialização da classe adapter
        alunosAdapter = new AlunosAdapter(listaDeAlunos());

        //Setar o adapter no recycler view
        recyclerViewAlunos.setAdapter(alunosAdapter);

    }

    private List<Alunos> listaDeAlunos() {

        List<Alunos> alunos = new ArrayList<>();

        alunos.add(new Alunos("Jéssica Milena", "Mobile Android",R.drawable.jessica));
        alunos.add(new Alunos("Fabio Tadashi", "Mobile Android",R.drawable.fabio));
        alunos.add(new Alunos("Guilherme Sartori", "Mobile Android",R.drawable.guilherme));
        alunos.add(new Alunos("Victor Caldas", "Mobile Android",R.drawable.victor));
        alunos.add(new Alunos("Tairo Roberto", "Mobile Android",R.drawable.tairo));

        return alunos;

    }
}

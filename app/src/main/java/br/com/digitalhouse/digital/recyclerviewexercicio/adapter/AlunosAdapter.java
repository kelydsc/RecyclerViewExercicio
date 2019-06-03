package br.com.digitalhouse.digital.recyclerviewexercicio.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.digital.recyclerviewexercicio.R;
import br.com.digitalhouse.digital.recyclerviewexercicio.model.Alunos;

public class AlunosAdapter extends RecyclerView.Adapter<AlunosAdapter.ViewHolder> {

    //atributos
    private List<Alunos> listAlunos;

    //construtor
    public AlunosAdapter(List<Alunos> listAlunos) {
        this.listAlunos = listAlunos;
    }

    //Infla o layout do item e retorna uma nova instancia do ViewHolder
    @NonNull
    @Override
    public AlunosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.layout_lista_item_aluno,viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlunosAdapter.ViewHolder viewHolder, int i) {

        //Criar uma nova instancia
        Alunos alunos = listAlunos.get(i);

        //adiciona o valor da instancia para ser atribuido no componente
        viewHolder.bind(alunos);

    }

    //Retorna o tamanho da lista
    @Override
    public int getItemCount() {

        return listAlunos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nomeAluno;
        private TextView cursoAluno;
        private ImageView imageAluno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeAluno = itemView.findViewById(R.id.txtNome);
            cursoAluno = itemView.findViewById(R.id.txtCurso);
            imageAluno = itemView.findViewById(R.id.circleImageViewAlunos);
        }

        public void bind(Alunos alunos) {
            nomeAluno.setText(alunos.getNome());
            cursoAluno.setText(alunos.getCurso());
            imageAluno.setImageResource(alunos.getImageAluno()); //recupera um id interno do Android que identifica a imagem
        }
    }

}

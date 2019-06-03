package br.com.digitalhouse.digital.recyclerviewexercicio.model;

import android.widget.ImageView;

public class Alunos {

    //atributos
    private String nome;
    private String curso;
    private int imageAluno; //imagem o android numera as imagens

    //construtor padrão
    public Alunos() {
    }

    //construtor especifico
    public Alunos(String nome, String curso, int imageAluno) {
        this.nome = nome;
        this.curso = curso;
        this.imageAluno = imageAluno;
    }

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getImageAluno() {
        return imageAluno;
    }

    public void setImageAluno(int imageAluno) {
        this.imageAluno = imageAluno;
    }


    //metodo
}

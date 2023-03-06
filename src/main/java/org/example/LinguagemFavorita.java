package org.example;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    String nome;
    int anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public LinguagemFavorita(String nome, String ide) {
        this.nome = nome;
        this.ide = ide;
    }

    public LinguagemFavorita(int anoDeCriacao, String ide) {
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public LinguagemFavorita(String nome, int anoDeCriacao) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
    }

    public LinguagemFavorita(String nome) {
        this.nome = nome;
    }

    public LinguagemFavorita() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }


    @Override
    public int compareTo(LinguagemFavorita o) {
        int nome = this.getNome().compareTo(o.getNome());
        return nome;
    }
}

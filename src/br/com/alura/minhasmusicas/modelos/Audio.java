package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReprudocoes;
    private int totalDeCurtidas;
    private int classificacao;

    public int getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReprudocoes() {
        return totalDeReprudocoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReprudocoes++;
    }
}

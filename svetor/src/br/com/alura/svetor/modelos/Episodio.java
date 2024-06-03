package br.com.alura.svetor.modelos;

import br.com.alura.svetor.calculos.Classificavel;

public abstract class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        // Verificando se o episódio é bem avaliado ou não com base no número total de visualizações
        if (totalVisualizacoes > 1000) { // Por exemplo, vamos considerar 1000 visualizações como critério de avaliação
            return 4; // Episódio bem avaliado
        } else {
            return 2; // Episódio com avaliação média
        }
    }

    public abstract void setClassificacaoIndicativa(int i);


}
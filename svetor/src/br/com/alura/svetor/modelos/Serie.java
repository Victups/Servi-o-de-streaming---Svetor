package br.com.alura.svetor.modelos;

import br.com.alura.svetor.calculos.Classificavel;
import br.com.alura.svetor.modelos.Titulo;

public class Serie extends  Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }



    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
    @Override
    public String toString() {
        return "Série: " + getNome() + " (Temporadas: " + temporadas + ")";
    }
}
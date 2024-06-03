package br.com.alura.svetor.Principal;

import br.com.alura.svetor.calculos.CalculadoraDeTempo;
import br.com.alura.svetor.calculos.FiltroRecomendacao;
import br.com.alura.svetor.modelos.Episodio;
import br.com.alura.svetor.modelos.Filme;
import br.com.alura.svetor.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando os filmes
        Filme spiderMilesAcrossVerse = new Filme("Spider-Man: Across the Spider-Verse", 2023);
        spiderMilesAcrossVerse.setDuracaoEmMinutos(140);
        spiderMilesAcrossVerse.setClassificacaoIndicativa(10);
        spiderMilesAcrossVerse.avalia(8);
        spiderMilesAcrossVerse.avalia(10);
        spiderMilesAcrossVerse.avalia(9);

        Filme avangersUltimate = new Filme("Avengers Endgame", 2019);
        avangersUltimate.setDuracaoEmMinutos(182);
        avangersUltimate.setIncluidoNoPlano(true);
        avangersUltimate.setClassificacaoIndicativa(12);
        avangersUltimate.avalia(9);

        Filme theMatrix = new Filme("The Matrix", 1999);
        theMatrix.setDuracaoEmMinutos(135);
        theMatrix.setIncluidoNoPlano(true);
        theMatrix.avalia(8);

        // Criando as séries
        Serie theBoys = new Serie("The Boys", 2021);
        theBoys.setClassificacaoIndicativa(18);
        theBoys.setTemporadas(3);
        theBoys.setEpisodiosPorTemporada(6);
        theBoys.setMinutosPorEpisodio(55);
        theBoys.avalia(7);

        Serie laCasaDePapel = new Serie("La Casa de Papel", 2017);
        laCasaDePapel.setIncluidoNoPlano(true);
        laCasaDePapel.setAtiva(true);
        laCasaDePapel.setTemporadas(5);
        laCasaDePapel.setEpisodiosPorTemporada(10);
        laCasaDePapel.setMinutosPorEpisodio(45);
        laCasaDePapel.avalia(8);

        // Calculando tempo total
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(avangersUltimate);
        calculadora.inclui(spiderMilesAcrossVerse);
        calculadora.inclui(theBoys);
        calculadora.inclui(theMatrix);
        calculadora.inclui(laCasaDePapel);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        // Filtrando recomendações
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(spiderMilesAcrossVerse);

        Episodio episodio = new Episodio() {
            @Override
            public void setClassificacaoIndicativa(int i) {
                // Implementação do método setClassificacaoIndicativa
            }
        };
        episodio.setNumero(1);
        episodio.setSerie(theBoys);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        // Criando e manipulando uma lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(spiderMilesAcrossVerse);
        listaDeFilmes.add(avangersUltimate);
        listaDeFilmes.add(theMatrix);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Lista de Filmes:");
        for (Filme filme : listaDeFilmes) {
            System.out.println(filme);
        }
    }
}

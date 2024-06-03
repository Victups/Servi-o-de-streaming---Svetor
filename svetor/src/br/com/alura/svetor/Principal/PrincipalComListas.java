package br.com.alura.svetor.Principal;

import br.com.alura.svetor.modelos.Filme;
import br.com.alura.svetor.modelos.Serie;
import br.com.alura.svetor.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        // Criação de objetos do tipo Filme e Série
        Filme spiderMilesAcrossVerse = new Filme("Spider-Man: Across the Spider-Verse", 2023);
        spiderMilesAcrossVerse.avalia(8);

        Filme avengersUltimate = new Filme("Avengers Endgame", 2019);
        avengersUltimate.avalia(9);

        Filme theMatrix = new Filme("The Matrix", 1999);
        theMatrix.avalia(7);

        Serie theBoys = new Serie("The Boys", 2021);
        theBoys.avalia(9);

        Serie laCasaDePapel = new Serie("La Casa de Papel", 2017);
        laCasaDePapel.avalia(6);

        Filme f1 = spiderMilesAcrossVerse;

        // Criação da lista de títulos
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(spiderMilesAcrossVerse);
        lista.add(avengersUltimate);
        lista.add(theMatrix);
        lista.add(theBoys);
        lista.add(laCasaDePapel);

        // Iteração sobre a lista e impressão dos nomes e classificações
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtitas = new ArrayList<>();
        buscaPorArtitas.add("Miles Morales");
        buscaPorArtitas.add("Karl Urban");
        System.out.println(buscaPorArtitas);

        Collections.sort(buscaPorArtitas);
        System.out.println("Depois da ordenacao");
        System.out.println(buscaPorArtitas);
        System.out.println("Lista de Titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.<Titulo, Integer>comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
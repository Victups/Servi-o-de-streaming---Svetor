package br.com.alura.svetor.calculos;

import br.com.alura.svetor.modelos.Titulo;

import java.util.ArrayList;

public class CalculadoraDeTempo {
    private ArrayList<Titulo> titulos = new ArrayList<>();

    public void inclui(Titulo titulo) {
        titulos.add(titulo);
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Titulo titulo : titulos) {
            tempoTotal += titulo.getDuracaoEmMinutos();
        }
        return tempoTotal;
    }
}

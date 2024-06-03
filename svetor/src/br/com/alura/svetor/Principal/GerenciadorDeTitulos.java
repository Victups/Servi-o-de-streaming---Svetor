package br.com.alura.svetor.Principal;

import br.com.alura.svetor.modelos.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GerenciadorDeTitulos {

    private final Gson gson;

    public GerenciadorDeTitulos() {
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public void salvarTitulosEmTexto(List<Titulo> titulos, String caminho) throws IOException {
        try (FileWriter escrita = new FileWriter(caminho)) {
            for (Titulo titulo : titulos) {
                escrita.write(titulo.toString() + "\n");
            }
            System.out.println("Filmes salvos no arquivo '" + caminho + "'.");
        }
    }

    public void salvarTitulosEmJson(List<Titulo> titulos, String caminho) throws IOException {
        try (FileWriter escritaJson = new FileWriter(caminho)) {
            escritaJson.write(gson.toJson(titulos));
            System.out.println("Filmes salvos no arquivo '" + caminho + "'.");
        }
    }
}

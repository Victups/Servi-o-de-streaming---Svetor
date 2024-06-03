package br.com.alura.svetor.Principal;

import br.com.alura.svetor.modelos.Titulo;
import br.com.alura.svetor.execao.ErrorDeConversaoDeAnoExecption;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBuscaJava {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        BuscaFilmes buscaFilmes = new BuscaFilmes();
        GerenciadorDeTitulos gerenciadorDeTitulos = new GerenciadorDeTitulos();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca (ou digite 'sair' para encerrar): ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Titulo meuTitulo = buscaFilmes.buscarFilme(busca);
                System.out.println("Titulo ja convertido");
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);
            } catch (ErrorDeConversaoDeAnoExecption e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro ao formatar um número: " + e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("A requisição foi interrompida: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Erro de IO: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Aconteceu algo errado :( Nosso time já está resolvendo...");
                e.printStackTrace();
            }
        }

        try {
            gerenciadorDeTitulos.salvarTitulosEmTexto(titulos, "filmes.txt");
            gerenciadorDeTitulos.salvarTitulosEmJson(titulos, "Filmes.json");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        System.out.println(titulos);
        System.out.println("Codigo funcionando !");
    }
}

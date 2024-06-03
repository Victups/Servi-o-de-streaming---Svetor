package br.com.alura.svetor.Principal;

import br.com.alura.svetor.execao.ErrorDeConversaoDeAnoExecption;
import br.com.alura.svetor.modelos.Titulo;
import br.com.alura.svetor.modelos.TituloOmdb;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class BuscaFilmes {

    private final Gson gson;

    public BuscaFilmes() {
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }

    public Titulo buscarFilme(String busca) throws IOException, InterruptedException, ErrorDeConversaoDeAnoExecption {
        String buscaCodec = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        String endereco = "https://www.omdbapi.com/?t=" + buscaCodec + "&apikey=e18ad14b";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        return new Titulo(meuTituloOmdb);
    }
}
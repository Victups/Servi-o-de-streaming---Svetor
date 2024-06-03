# Svetor - Gerenciador de Filmes e Séries

Este é um projeto Java que permite buscar, avaliar e gerenciar filmes e séries. Ele utiliza a API OMDB para buscar informações sobre filmes e séries e fornece funcionalidades para calcular o tempo total de visualização, filtrar recomendações e salvar dados em arquivos de texto e JSON.

## Funcionalidades

- **Busca de Filmes e Séries**: Realiza buscas na API OMDB e converte as informações retornadas em objetos Java.
- **Avaliação de Filmes e Séries**: Permite que os usuários avaliem filmes e séries.
- **Cálculo de Tempo Total**: Calcula o tempo total de visualização para uma lista de filmes e séries.
- **Filtragem de Recomendações**: Filtra filmes e séries com base em critérios de recomendação.
- **Persistência de Dados**: Salva os dados em arquivos de texto e JSON.

## Requisitos

- Java 11 ou superior
- [API OMDB](http://www.omdbapi.com/) (é necessário uma chave de API)
- Biblioteca [Gson](https://github.com/google/gson) para manipulação de JSON

## Estrutura do Projeto

```plaintext
src
└── br/com/alura/svetor
    ├── calculos
    │   ├── CalculadoraDeTempo.java
    │   ├── Classificavel.java
    │   └── FiltroRecomendacao.java
    ├── execao
    │   └── ErrorDeConversaoDeAnoExecption.java
    ├── modelos
    │   ├── Episodio.java
    │   ├── Filme.java
    │   ├── Serie.java
    │   ├── Titulo.java
    │   ├── TituloOmdb.java
    ├── Principal
    │   ├── BuscaFilmes.java
    │   ├── GerenciadorDeTitulos.java
    │   ├── Principal.java
    │   └── PrincipalComBuscaJava.java

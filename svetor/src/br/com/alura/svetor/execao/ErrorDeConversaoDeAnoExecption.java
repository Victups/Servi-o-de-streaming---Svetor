package br.com.alura.svetor.execao;

public class ErrorDeConversaoDeAnoExecption extends RuntimeException {
    private String mensagem;



    public ErrorDeConversaoDeAnoExecption(String s) {
    this.mensagem = mensagem;

    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}

package br.com.alura.adopet.api.excepetion;

public class ValidacaoExcepetion extends RuntimeException {

    public ValidacaoExcepetion(String message) {
        super(message);
    }
}

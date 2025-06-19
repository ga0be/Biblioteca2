package Exceptions.Livro;

public class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException() {
        super("Livro não encontrado!");
    }
}

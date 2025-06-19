package Exceptions.Conta;

public class ContaNaoExisteException extends Exception {
    public ContaNaoExisteException() {
        super("Item com código não foi encontrado.");
    }
}


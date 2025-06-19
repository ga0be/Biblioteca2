package Exceptions;

public class RepositorioCheioException extends Exception{
       public RepositorioCheioException() {
           super("Repositório está cheio. Não é possível cadastrar mais itens.");}
}


package Exceptions.Conta;

public class ContaJaExisteException extends Exception{
    public ContaJaExisteException(){
        super("Conta já existe no repositorio");
    }
}

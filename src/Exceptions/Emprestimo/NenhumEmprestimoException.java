package Exceptions.Emprestimo;

public class NenhumEmprestimoException extends Exception {
  public NenhumEmprestimoException(){
    super("Nenhum emprestimo encontrado!");
  }
}

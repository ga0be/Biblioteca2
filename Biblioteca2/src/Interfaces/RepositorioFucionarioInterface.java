package Interfaces;

import Exceptions.Conta.ContaJaExisteException;
import Exceptions.Conta.ContaNaoExisteException;
import Exceptions.RepositorioCheioException;
import Negocio.ClassesBasicas.Funcionario;

public interface RepositorioFucionarioInterface {

    public void adicionarFuncionario(Funcionario conta) throws RepositorioCheioException, ContaJaExisteException;

    public void removerFuncionario(int idFuncionario) throws ContaNaoExisteException;

    public Funcionario buscarFuncionario(int idFuncionario) throws ContaNaoExisteException;

    public void atualizarFuncionario(Funcionario conta) throws ContaNaoExisteException;


}

package Interfaces;

import Exceptions.Conta.ContaJaExisteException;
import Exceptions.Conta.ContaNaoExisteException;
import Exceptions.RepositorioCheioException;
import Negocio.ClassesBasicas.Cliente;

public interface RepositorioClienteInterface {

    public void adicionarCliente(Cliente cliente) throws RepositorioCheioException, ContaJaExisteException;

    public void atualizarCliente(Cliente conta) throws ContaNaoExisteException;

    public void removerCliente(int IdCliente) throws ContaNaoExisteException;

    public Cliente buscarCliente(int IdCliente) throws ContaNaoExisteException;
}

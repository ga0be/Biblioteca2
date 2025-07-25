package Negocio;

import Dados.RepositorioCliente;
import Exceptions.Conta.ContaJaExisteException;
import Exceptions.Conta.ContaNaoExisteException;
import Exceptions.RepositorioCheioException;
import Negocio.ClassesBasicas.Cliente;
import Negocio.ClassesBasicas.Livro;

import java.time.LocalDate;
import java.util.Arrays;

public class CadastroCliente {

    private RepositorioCliente repositorio;
    private int ultimoId;
    private static CadastroCliente Instancia;

    public CadastroCliente() {
        this.repositorio = repositorio;
        this.ultimoId = 0;
    }

    protected static CadastroCliente getInstancia() {
        if (Instancia == null) {
            Instancia = new CadastroCliente();
        }

        return Instancia;
    }

    public void cadastrarCliente(String nome, String cpf, String telefone, String endereco, String email)
        throws ContaJaExisteException, RepositorioCheioException{
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco, email, ultimoId + 1);
        ultimoId++;
        this.repositorio.adicionarCliente(cliente);
    }

    public void removerCliente(int id) throws ContaNaoExisteException{
        this.repositorio.removerCliente(id);
    }

    public Cliente buscarCliente(int id) throws ContaNaoExisteException{
        return this.repositorio.buscarCliente(id);
    }

    public void atualizarCliente(String nome, int idCliente, String cpf, String telefone, String endereco, String email) throws ContaNaoExisteException {

        Cliente auxCliente = this.repositorio.buscarCliente(idCliente);

        if (auxCliente != null) {
            Cliente cliente = new Cliente(nome, cpf, telefone, endereco, email, idCliente);
            repositorio.atualizarCliente(cliente);
        }
    }

    public String listarClientes(){
        return this.repositorio.toString();
    }
}



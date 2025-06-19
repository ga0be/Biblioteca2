package Negocio;

import Dados.RepositorioFuncionario;
import Exceptions.Conta.ContaJaExisteException;
import Exceptions.Conta.ContaNaoExisteException;
import Exceptions.RepositorioCheioException;
import Negocio.ClassesBasicas.Administrador;
import Negocio.ClassesBasicas.Atendente;
import Negocio.ClassesBasicas.Cliente;
import Negocio.ClassesBasicas.Funcionario;

public class CadastroFuncionario {

    private RepositorioFuncionario repositorio;
    private int ultimoId;
    private static CadastroFuncionario instancia;

    private CadastroFuncionario() {
        this.repositorio = RepositorioFuncionario.getInstance();
        this.ultimoId = 0;
    }

    protected static CadastroFuncionario getInstance(){
        if(instancia == null){
            instancia = new CadastroFuncionario();
        }
        return instancia;
    }

    public void cadastrarAtendente(String nome, String cargo, String login, String senha, String cpf, String turno, double remuneracao, double horas) throws
            ContaJaExisteException, RepositorioCheioException {

        Funcionario atendente = new Atendente(nome, cargo, login, senha, cpf, ultimoId + 1, turno, remuneracao, horas);
        this.ultimoId++;
        this.repositorio.adicionarFuncionario(atendente);
    }

    public void cadastrarAdministrador(String nome, String cargo, String login, String senha, String cpf, double salario) throws
            ContaJaExisteException, RepositorioCheioException{

        Funcionario administrador = new Administrador(nome, cargo, login, senha, cpf, ultimoId + 1, salario);
        this.ultimoId++;
        this.repositorio.adicionarFuncionario(administrador);
    }

    public void removerFuncionario(int funcionarioId) throws ContaNaoExisteException {
        repositorio.removerFuncionario(funcionarioId);
    }

    public Funcionario buscarFuncionario(int FuncionarioId) throws ContaNaoExisteException{
        return repositorio.buscarFuncionario(FuncionarioId);
    }

    public void atualizarFuncionario(int id) throws
            ContaNaoExisteException{

        Funcionario funcionario = repositorio.buscarFuncionario(id);



        if(funcionario != null) {
            if (funcionario.getAdministrador()) {
                Funcionario administrador = new Administrador(funcionario.setNome(nome), cpf, );
                administrador.setIdConta(id);
                repositorio.atualizarFuncionario(administrador);
            } else {
                Conta cliente = new Cliente(nome, cpf, telefone);
                cliente.setIdConta(id);
                repositorio.atualizarFuncionario(atendente);
            }
        }
    }

    public String listarContas(){
        return repositorio.toString();
    }
}

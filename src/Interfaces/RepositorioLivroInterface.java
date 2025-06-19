package Interfaces;

import Exceptions.Livro.LivroNaoEncontradoException;
import Exceptions.Livro.LivrojaExisteException;
import Exceptions.RepositorioCheioException;
import Negocio.ClassesBasicas.Livro;

public interface RepositorioLivroInterface {

    public Livro procurar(int IdLivro) throws LivroNaoEncontradoException;

    public void adicionar(Livro livro) throws RepositorioCheioException, LivrojaExisteException;

    public void remover(int IdLivro) throws LivroNaoEncontradoException;

    public void atualizarLivro(Livro livro) throws LivroNaoEncontradoException;
}

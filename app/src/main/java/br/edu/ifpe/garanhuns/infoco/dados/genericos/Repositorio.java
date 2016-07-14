/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpe.garanhuns.infoco.dados.genericos;

import java.util.List;

/**
 *
 * Essa classe serve para guarda objetos de um único tipo!
 * @author lucas
 * @param <Tipo> o tipo dos objetos que serão guardados.
 */
public interface Repositorio<Tipo extends Persistivel> {
    /**
     * Adiciona um objeto ao repositório. Caso o id dele já esteja definido, será substituído.
     * @param t um objeto para ser adicionado
     */
    public void adicionar(Tipo t);
    /**
     * Remove um objeto que já está no Repositório e que tem o id pedido.
     * 
     * @param id o id do objeto que será removido
     */
    public void remover(long id);
    /**
     * Remove o objeto t.
     * @param t
     */
    public void remover(Tipo t) ;
    /**
     * Atualiza as variáveis de instância do objeto que tem o mesmo id de T.
     * @param t uma versão mais atualizada de um objeto no repositório, mas com o mesmo id.
     */
    public void alterar(Tipo t);
    /**
     * Recupera um objeto já adicionado ao Repositório.
     * @param id o id do objeto a ser recuperado.
     * @return o objeto recuperado.
     */
    public Tipo recuperar(long id);
    /**
     * Ver se existe algum objeto com o id pedido no repositório. Desconsidera as outras variáveis de instância.
     * @param t o objeto
     * @return se o objeto está  ou não.
     */
    public boolean existe(Tipo t);
    /**
     * Ver se existe algum objeto com o id pedido no repositório.
     * @param id do objeto
     * @return se tem no repositório ou não.
     */
    public boolean existe(long id);
    /**
     * Recupera todos os objetos que estão no repositório.
     * @return uma coleção com todos os objetos do repositório.
     */
    public List<Tipo> recuperar();

    /**
     * Retorna o número de elementos
     * @return número de elementos
     */
    public int getQuantidade();
}

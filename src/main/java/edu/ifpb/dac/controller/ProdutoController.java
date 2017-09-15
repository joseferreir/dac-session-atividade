/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.controller;

import edu.ifpb.dac.entity.Produto;
import edu.ifpb.dac.servico.ProdutoService;
import edu.ifpb.dac.util.Mensagem;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jose2
 */
@Named
@RequestScoped
public class ProdutoController {

    @EJB
    private ProdutoService service;
    
    private Produto produto;
    @Inject
    private Mensagem mensagem;

    public ProdutoController() {
        this.produto = new Produto();
    }

    public String adicionar() {
        try {
            service.add(produto);
            mensagem.addMessage("ms", "Produto cadastrado com sucesso:");
            this.produto = new Produto();
        } catch (Exception e) {
            mensagem.addMessage("ms", "Produto não cadastrado:");
        }
        return null;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    

}

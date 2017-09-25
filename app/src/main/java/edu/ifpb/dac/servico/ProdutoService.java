/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.servico;

import edu.ifpb.dac.entity.Produto;
import java.util.List;

/**
 *
 * @author jose2
 */
public interface ProdutoService {

    void add(Produto produto);

    Produto find(int key);

    List<Produto> findAll();

    void remove(Produto produto);

    Produto update(Produto produto);
    
}

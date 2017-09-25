/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.servico;

import edu.ifpb.dac.entity.Produto;
import edu.ifpb.dac.repositorio.ProdutoRepositorio;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author jose2
 */
@Stateless
@Local(ProdutoService.class)
public class ProdutoServceImpl implements ProdutoService {
    @EJB
    private  ProdutoRepositorio repositorio;
    
    @Override
     public void add(Produto produto){
         repositorio.add(produto);
     }

    @Override
    public Produto  find(int key){
      return repositorio.find(key, Produto.class);
    }

    @Override
    public List<Produto> findAll(){
        return repositorio.findAll(Produto.class);
    }

    @Override
    public Produto update(Produto produto){
        return repositorio.update(produto);
    }

    @Override
    public void remove(Produto produto){
        repositorio.remove(produto);
        
    }
}

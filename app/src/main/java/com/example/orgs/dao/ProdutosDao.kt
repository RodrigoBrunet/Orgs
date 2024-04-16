package com.example.orgs.dao

import com.example.orgs.model.Produto

class ProdutosDao {

    fun add(produto: Produto){
        produtos.add(produto)
    }
    fun listarTodos() : List<Produto>{
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}
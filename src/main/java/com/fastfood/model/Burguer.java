package com.fastfood.model;

public class Burguer implements ItemCombo {

    private final String nome;
    private final double preco;

    public Burguer(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}

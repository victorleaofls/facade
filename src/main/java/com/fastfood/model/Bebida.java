package com.fastfood.model;

public class Bebida implements ItemCombo {

    private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
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

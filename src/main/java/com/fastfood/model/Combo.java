package com.fastfood.model;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    private final ItemCombo burguer;
    private final ItemCombo bebida;
    private final ItemCombo sobremesa;

    public Combo(ItemCombo bebida, ItemCombo burguer, ItemCombo sobremesa) {
        this.bebida = bebida;
        this.burguer = burguer;
        this.sobremesa = sobremesa;
    }

    //fiz uma lista porque só assim para
    // retornar todos os itens em um Getter só
    public List<ItemCombo> getItens() {
        List<ItemCombo> itens = new ArrayList<>();
        itens.add(burguer);
        itens.add(bebida);
        itens.add(sobremesa);
        return itens;
    }

    public double getPrecoTotal(){
        return burguer.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }

}

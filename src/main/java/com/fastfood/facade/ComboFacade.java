package com.fastfood.facade;

import com.fastfood.model.Bebida;
import com.fastfood.model.Burguer;
import com.fastfood.model.Combo;
import com.fastfood.model.ItemCombo;
import com.fastfood.model.Sobremesa;

public class ComboFacade {
    private Combo comboAtual;

    public Combo criarCombo(int numeroCombo) {
        switch (numeroCombo) {
            case 1 -> comboAtual = new Combo(
                    new Burguer("X-raton", 15.0),
                    new Bebida("Xereta Cola", 3.50),
                    new Sobremesa("Sorvete Kisuco", 5.0)
                );
            case 2 -> comboAtual = new Combo(
                    new Burguer("X-frangalhos", 12.0),
                    new Bebida("Maracujina", 2.50),
                    new Sobremesa("Brownie duro", 2.0)
                );
            default -> {
                System.out.println("Combo não encontrado.");
                comboAtual = null;
            }
        }
        return comboAtual;
    }

    public void exibirItens() {
        if (comboAtual != null) {
            for (ItemCombo item : comboAtual.getItens()) {
                System.out.println(item.getNome() + " - R$ " + item.getPreco());
            }
        } else {
            System.out.println("Nenhum combo selecionado.");
        }
    }

    public double getPrecoTotal() {
        if (comboAtual != null) {
            return comboAtual.getPrecoTotal();
        } else {
            return 0.0;
        }
    }
}

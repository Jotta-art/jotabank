package br.com.jotabank.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Conta> lista = new ArrayList<>();

    static {
        Conta c1 = new Conta();
        c1.setNomeDoTitular("joao");
        c1.setCpf("1111111111");
        c1.setTelefone("22222222222");
        Conta c2 = new Conta();
        c2.setNomeDoTitular("gabi");
        c2.setCpf("1111111111");
        c2.setTelefone("22222222222");
        lista.add(c1);
        lista.add(c2);
    }

    public void adiciona(Conta conta) {
        lista.add(conta);
        System.out.println("Método adiciona funciona!");
    }

    public List<Conta> getContas() {
        return Banco.lista;
    }
}

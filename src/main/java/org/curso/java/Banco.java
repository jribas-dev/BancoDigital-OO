package org.curso.java;

import java.util.*;

public class Banco {

    private String nome;
    private final List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }

    public void imprimirContas() {
        System.out.println("BANCO: " + this.getNome());
        System.out.println("=============================");
        for (Conta conta: this.getContas()) {
            System.out.println("Tipo Conta: " + conta.getClass());
            System.out.println("Nro. Conta: " + conta.numero);
        }
        System.out.println("=============================");
        System.out.println(" ");
    }

}
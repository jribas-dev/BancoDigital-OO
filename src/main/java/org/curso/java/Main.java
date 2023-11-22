package org.curso.java;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("BANCO DIGITAL");

        Cliente jribas = new Cliente();
        jribas.setNome("João Ribas");

        Conta cc = new ContaCorrente(jribas);
        Conta poupanca = new ContaPoupanca(jribas);

        banco.setContas(cc);
        banco.setContas(poupanca);
        banco.imprimirContas();

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
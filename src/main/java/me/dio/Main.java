package me.dio;

public class Main {

    public static final String NOME_CLIENTE = "Venilton";

    public static void main(String[] args) {
        Cliente venilton = Cliente
                .builder()
                .nome(NOME_CLIENTE)
                .build();

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
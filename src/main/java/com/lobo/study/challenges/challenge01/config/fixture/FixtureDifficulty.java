package com.lobo.study.challenges.challenge01.config.fixture;


public enum FixtureDifficulty {

    LIGHT(10, 1_000),
    MEDIUM(100, 10_000),
    HEAVY(5, 1_000_000);

    private final int quantidadeClientes;
    private final int transacoesPorCliente;

    FixtureDifficulty(int quantidadeClientes, int transacoesPorCliente) {
        this.quantidadeClientes = quantidadeClientes;
        this.transacoesPorCliente = transacoesPorCliente;
    }

    public int getQuantidadeClientes() {
        return quantidadeClientes;
    }

    public int getTransacoesPorCliente() {
        return transacoesPorCliente;
    }

}

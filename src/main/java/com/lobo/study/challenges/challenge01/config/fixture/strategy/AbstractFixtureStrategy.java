package com.lobo.study.challenges.challenge01.config.fixture.strategy;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.fixture.FixtureStrategy;
import com.lobo.study.challenges.challenge01.config.model.Cliente;
import com.lobo.study.challenges.challenge01.config.model.Transacao;
import com.lobo.study.challenges.challenge01.config.repository.ClienteRepository;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFixtureStrategy implements FixtureStrategy {

    private final ClienteRepository clienteRepository;

    private final Faker faker = new Faker();

    protected AbstractFixtureStrategy(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    protected void configuraCenarioTesteFixture() {
        FixtureDifficulty difficulty = getDifficulty();

        for (int i = 0; i < difficulty.getQuantidadeClientes(); i++) {

            Cliente cliente = new Cliente();
            cliente.setNome(faker.name().fullName());

            List<Transacao> transacoes = new ArrayList<>(
                    difficulty.getTransacoesPorCliente()
            );

            for (int j = 0; j < difficulty.getTransacoesPorCliente(); j++) {

                Transacao transacao = new Transacao();
                transacao.setValor(faker.number().randomDouble(2, 1, 10_000));

                transacao.setCliente(cliente);
                transacoes.add(transacao);
            }

            cliente.setTransacoes(transacoes);

            clienteRepository.save(cliente);
        }
    }

}

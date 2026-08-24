package com.lobo.study.challenges.challenge01.config.fixture.strategy;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.fixture.FixtureStrategy;
import com.lobo.study.challenges.challenge01.config.model.Cliente;
import com.lobo.study.challenges.challenge01.config.model.Transacao;
import com.lobo.study.challenges.challenge01.config.repository.ClienteRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LightFixtureStrategy implements FixtureStrategy {

    private final ClienteRepository clienteRepository;

    private final Faker faker = new Faker();

    @Autowired
    public LightFixtureStrategy(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public FixtureDifficulty getDifficulty() {
        return FixtureDifficulty.LIGHT;
    }

    @Override
    public void execute() {
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

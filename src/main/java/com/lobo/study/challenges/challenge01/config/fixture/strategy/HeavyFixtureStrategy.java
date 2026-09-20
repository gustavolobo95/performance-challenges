package com.lobo.study.challenges.challenge01.config.fixture.strategy;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HeavyFixtureStrategy extends AbstractFixtureStrategy {

    @Override
    public FixtureDifficulty getDifficulty() {
        return FixtureDifficulty.HEAVY;
    }

    @Autowired
    public HeavyFixtureStrategy(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }

    @Override
    public void execute() {
        configuraCenarioTesteFixture();
    }
}

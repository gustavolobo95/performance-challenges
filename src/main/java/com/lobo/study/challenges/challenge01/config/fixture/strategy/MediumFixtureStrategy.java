package com.lobo.study.challenges.challenge01.config.fixture.strategy;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MediumFixtureStrategy extends AbstractFixtureStrategy {

    @Autowired
    protected MediumFixtureStrategy(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }

    @Override
    public FixtureDifficulty getDifficulty() {
        return FixtureDifficulty.MEDIUM;
    }

    @Override
    public void execute() {
        configuraCenarioTesteFixture();
    }
}

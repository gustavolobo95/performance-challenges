package com.lobo.study.challenges.challenge01.config.fixture.strategy;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LightFixtureStrategy extends AbstractFixtureStrategy {

    @Autowired
    protected LightFixtureStrategy(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }

    @Override
    public FixtureDifficulty getDifficulty() {
        return FixtureDifficulty.LIGHT;
    }

    @Override
    public void execute() {
        configuraCenarioTesteFixture();
    }

}

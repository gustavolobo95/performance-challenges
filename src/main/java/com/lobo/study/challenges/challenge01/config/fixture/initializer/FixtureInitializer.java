package com.lobo.study.challenges.challenge01.config.fixture.initializer;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.fixture.FixtureStrategy;
import com.lobo.study.challenges.challenge01.config.fixture.resolver.FixtureStrategyResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FixtureInitializer implements ApplicationRunner{

    @Value("${challenge.fixture.difficulty}")
    private String difficulty;

    @Autowired
    private final FixtureStrategyResolver resolver;

    public FixtureInitializer(FixtureStrategyResolver resolver) {
        this.resolver = resolver;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FixtureDifficulty fixtureDifficulty = FixtureDifficulty.valueOf(difficulty.toUpperCase());

        FixtureStrategy strategy = resolver.resolve(fixtureDifficulty);

        strategy.execute();
    }
}

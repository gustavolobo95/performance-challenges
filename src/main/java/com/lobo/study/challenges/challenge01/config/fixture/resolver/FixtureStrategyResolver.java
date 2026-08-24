package com.lobo.study.challenges.challenge01.config.fixture.resolver;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.fixture.FixtureStrategy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class FixtureStrategyResolver {

    private final Map<FixtureDifficulty, FixtureStrategy> strategies;

    public FixtureStrategyResolver(List<FixtureStrategy> strategies) {
        this.strategies = strategies.stream()
                .collect(Collectors.toMap(
                        FixtureStrategy::getDifficulty,
                        Function.identity()
                ));
    }

    public FixtureStrategy resolve(FixtureDifficulty difficulty) {
        FixtureStrategy strategy = strategies.get(difficulty);

        if(Objects.isNull(strategy)) {
            throw new IllegalArgumentException("Nenhuma strategy encontrada para " + difficulty);
        }

        return strategy;
    }

}

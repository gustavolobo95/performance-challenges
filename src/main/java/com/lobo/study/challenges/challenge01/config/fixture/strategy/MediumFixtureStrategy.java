package com.lobo.study.challenges.challenge01.config.fixture.strategy;

import com.lobo.study.challenges.challenge01.config.fixture.FixtureDifficulty;
import com.lobo.study.challenges.challenge01.config.fixture.FixtureStrategy;

public class MediumFixtureStrategy implements FixtureStrategy {

    @Override
    public FixtureDifficulty getDifficulty() {
        return FixtureDifficulty.MEDIUM;
    }

    @Override
    public void execute() {

    }
}

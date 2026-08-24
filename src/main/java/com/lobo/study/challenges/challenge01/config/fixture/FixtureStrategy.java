package com.lobo.study.challenges.challenge01.config.fixture;

public interface FixtureStrategy {

    FixtureDifficulty getDifficulty();

    void execute();

}

package com.javacodegeeks.nio.heartbeat.runner;

import com.javacodegeeks.nio.heartbeat.Constants;
import com.javacodegeeks.nio.heartbeat.Mode;

public final class Runner {

    private Runner() {
        throw new IllegalStateException(Constants.INSTANTIATION_NOT_ALLOWED);
    }

    public static void main(final String... args) {
        CLIConfigurator.configure(args).ifPresent(cliConfig -> Mode.valueOf(cliConfig.getMode()).execute(cliConfig));
    }
}

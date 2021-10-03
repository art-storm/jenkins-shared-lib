#!/usr/bin/env groovy

def call(branch = 'dev') {
    def env = "dev"
    if (branch == 'release') {
        env = "staging"
    }

    return env
}

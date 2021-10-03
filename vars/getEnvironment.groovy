#!/usr/bin/env groovy

def getEnvironment(branch = 'dev') {
    def env = "dev"
    if (branch == 'release') {
        env = "staging"
    }

    return env
}

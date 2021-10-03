#!/usr/bin/env groovy

def call(branch = 'dev') {
    def imagename = "crappjavatest/dev-app-java"
    if (branch == 'release') {
        imagename = "crappjavatest/rc-app-java"
    }

    return imagename
}

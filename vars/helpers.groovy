#!/usr/bin/env groovy

def getImageName(branch = 'dev') {
    def imagename = "crappjavatest/dev-app-java"
    if (branch == 'release') {
        imagename = "crappjavatest/rc-app-java"
    }

    return imagename
}

def getEnvironment(branch = 'dev') {
    def env = "dev"
    if (branch == 'release') {
        env = "staging"
    }

    return env
}

def execTerraform(command) {
    withCredentials([azureServicePrincipal(
            credentialsId: 'azure-service-principle',
            subscriptionIdVariable: 'ARM_SUBSCRIPTION_ID',
            clientIdVariable: 'ARM_CLIENT_ID',
            clientSecretVariable: 'ARM_CLIENT_SECRET',
            tenantIdVariable: 'ARM_TENANT_ID'
    )])
            {
                sh command
            }
}

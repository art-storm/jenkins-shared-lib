#!/usr/bin/env groovy

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

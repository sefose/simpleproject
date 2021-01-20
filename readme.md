# Deployment infos

## Changes to be made to make it work in your environment

- In mysql-deployment.yaml and pv-deployment.yaml change storageClassName to fit your needs
- In frontend-deployment.yaml change API-URL to fit your backend

# Spinup

- create pv with pv-deployment.yaml
- start mongodb with helm and example-values.yaml
- start all deployments in kubernetes-deployments folder
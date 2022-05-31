# Clients

This repository is used by microservices as a separate dependency. Those microservices use it by downloading this repository from a remote Maven repository located at https://repo.repsy.io/mvn/maciek/ships-microservices, which is managed by Maciej Blok. For that reason, after every change made in this repository it should be redeployed to that Maven repository - otherwise those changes will not be visible for dependant microservices.

This repository is deployed to the Maven repository according to the following instructions: https://github.com/ciechanowiec/parent_pom

# HARBOR
A Microservice in Micronaut

## Running

```shell

gradle run
gradle run --continuous

```

---

### Development Notes

```shell

Install SDKMAN
curl -s https://get.sdkman.io | bash

sdk install java
sdk install gradle
sdk install micronaut

mn create-app harbor -i --test=spock

gradle run
gradle dockerBuild
gradle nativeImage

---


@JdbcRepository

Declarative Rest Client

```
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

Micronaut

- AOT
- Fast startup time
- Low Memory Footprint
- No Reflections
- DI
- AOP
- Features
  - Micronaut Data
  - hibernate-jpa
  - jib
  - micronaut-management
  - micronaut-openapi

---


@JdbcRepository

Declarative Rest Client

application-test.yml



Ref:
- https://www.youtube.com/watch?v=S5yfTfPeue8


```
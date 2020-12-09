# HARBOR
A Microservice in Micronaut

## Running

```shell

./gradlew run
./gradlew run --continuous

```

---

### Development Notes

```shell

Install SDKMAN
curl -s https://get.sdkman.io | bash

sdk install java
sdk install gradle
sdk install micronaut

mn create-app harbor -i --test=junit

gradle run
gradle dockerBuild
gradle nativeImage

gradle clean run

---

Micronaut

- AOT
- Fast startup time
- Low Memory Footprint
- No Reflections
- DI
- AOP
- Features
  - Micronaut Data-processor,jdbc}
  - hibernate-jpa
  - jib
  - micronaut-management
  - micronaut-openapi

---

@Entity
@Id
@GeneratedValue


@JdbcRepository, {CrudRepository<>,PageableRepository<>}

Declarative Rest Client
Declarative Crud Repository

application-test.yml

Annotation Configuration

@Inject
EmbeddedServer server //refers to the server that was started up for this test suite

@Inject
ApplicationContext context

GraalVM

Ref:
- https://www.youtube.com/watch?v=S5yfTfPeue8
- https://github.com/asc-lab/micronaut-microservices-poc
- https://alvarosanchez.github.io/micronaut-workshop/
- https://mfarache.github.io/mfarache/Building-microservices-Micronoaut/

```
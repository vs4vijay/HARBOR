# HARBOR
A Microservice in Micronaut

## Running

```shell

# Run application
./gradlew run

# Run application in watching mode
./gradlew run --continuous

# Package application
./gradlew assemble

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
mn create-controller SpaceX
mn create-bean SpaceXService
mn create-client SpaceX

gradle run
gradle jib
gradle dockerBuild
gradle dockerBuildNative
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
  - Micronaut Data-{processor,jdbc}
  - Micronaut Security-{annotations,jwt} 
  - jib
  - config-consul
  - micronaut-discovery-client
  - micronaut-openapi
  - micronaut-jdbc-hikari
  - micronaut-hibernate-jpa
  - micronaut-liquibase
  - micronaut-graal
  - micronaut-management
  - micrometer-atlas
  - micronaut-tracing
  - micronaut-kubernetes-discovery-client
- Microservice design patterns - Service Discovery, Circuit Breaker
- Scaffolding
- Cache
- Default Login and Logout Handler
- Various auth and ecurity mechanisms - https://guides.micronaut.io/micronaut-security-jwt/guide/index.html
- Support for ScheduledJob
- Configuration

---

@Entity
@Id
@GeneratedValue


@JdbcRepository, {CrudRepository<>,PageableRepository<>}

Declarative Rest Client
Declarative Crud Repository
Client-side Load Balancing

application-test.yml

Annotation Configuration

Management Endpoints
/beans
/health
/metrics
/info

@Inject
EmbeddedServer server //refers to the server that was started up for this test suite

@Inject
ApplicationContext context

GraalVM

<logger name="io.micronaut.http.client" level="TRACE"/>

try (ApplicationContext context = ApplicationContext.run()) { 
    MyBean myBean = context.getBean(MyBean.class); 
    // do something with your bean
}
Environment environment = applicationContext.getEnvironment();
final BeanContext context = BeanContext.run();

Map<String, Person> inMemoryDatastore = new ConcurrentHashMap<>();

Operations and Fallback

Lombok - https://docs.micronaut.io/2.2.0/guide/index.html#lombok

Ref:
- https://www.youtube.com/watch?v=S5yfTfPeue8
- https://github.com/asc-lab/micronaut-microservices-poc
- https://alvarosanchez.github.io/micronaut-workshop/
- https://mfarache.github.io/mfarache/Building-microservices-Micronoaut/

```
# PoC of Zipkin

## Modules
1. zipkin-server
2. zipkin-trace-generator
3. zipkin-trace-generator-complex

### zipkin-server module
#### How to run?
##### Storage In memory:
```
java -jar zipkin-server-0.0.1-SNAPSHOT.jar
```

##### Storage in elasticsearch:
```
java -jar zipkin-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=elasticsearch
```

### zipkin-trace-generator module
#### How to run?
```
java -jar zipkin-trace-generator-0.0.1-SNAPSHOT.jar
```
### zipkin-trace-generator-complex module
#### How to run?
```
java -jar zipkin-trace-generator-complex-0.0.1-SNAPSHOT.jar
```
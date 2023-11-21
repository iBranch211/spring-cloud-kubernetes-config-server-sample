# Spring Cloud Kubernetes Config Server Sample
 Sample Application using Spring Boot & Spring Cloud

## Prerequisites

* Java 17
* Maven 3.x

## Build

You can install the dependencies and build by typing the following command

```sh
mvn clean install
```

## Deployment Kubernetes

```sh
kubectl apply -f configmap.yaml
```

```sh
kubectl apply -f spring-cloud-kubernetes-configserver.yaml
```

Then, you can run the app as follows:

```
$ java -jar target/spring-cloud-kubernetes-config-server-sample-0.0.1-SNAPSHOT.jar
```

You can test the property values by typing the following command

curl --location 'http://localhost:8080/api/contact-info'


incoming response payload

```
{
    "message": "Welcome to EazyBank account related local APIs ",
    "contactDetails": {
        "email": "john@eazybank.com",
        "name": "John Doe - Developer"
    },
    "onCallSupport": [
        "(555) 555-1234",
        "(555) 523-1345"
    ]
}
```
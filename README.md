
# [JAVA] Microservice with Netflix OSS, Apache kafka and SpringBoot 

Build a simple application sending email using MessageBroker Apache kafka 


# Introduction 👋

Here is my source code java for application send email to new user register. I used spring ecosystem, Netflix OSS, discovery Eureka server, Apache Kafka and Spring Cloud Gateway. 

## Tech Stack

- Java 17
- SpringBoot 3
- Spring Cloud Gateway
- Eureka Server
- Netflix OSS
- Kafka 3.6.0

## RoadMap

![App Screenshot](https://dreamix.eu/wp-content/uploads/2023/09/Building-microservices-with-Netflix-OSS-Apache-kafka-and-Spring-Boot.png)






## API Reference

#### RegisterUser

```http
  POST /api/ms-user/register
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
| `name`      | `string` | **Required**. Name is an email address|
| `password`      | `string` | **Required**. password is optional|




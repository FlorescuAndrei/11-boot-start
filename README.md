# 11-boot-start
Spring Boot Learning Project.  
Basic steps:  
 - REST endpoint for simple messages;  
 - Spring Boot Actuator – give info about application with endpoints:   /actuator/info, etc.     
 - Spring Boot Security, default username = user, default password is generated in console/ this can be overwritten in application properties.  
 - application.properties file included; edit property for Spring boot actuator and other examples.
 - Spring Boot Dev Tools – to automaticly reload application when changes are made.

Dependencyes: Web, DevTools, Actuator, Security.    

Configuration: Java config - Application.java, @SpringBootApplication (=  @EnableAutoConfiguration, @ComponnentScanning, @Configration)

To run the app: Application.java -> run as java application

[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)

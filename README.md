# 11-boot-start
Spring Boot Learning Project. 
Basic steps:  
  - REST endpoint for simple messages;  
  - Actuator;   
  - Security;  
  - application.properties 

Dependencyes: Web, DevTools, Actuator, Security

Learning notes:  

https://start.spring.io --> generate project -->import maven project


Spring Boot Dev Tools – to reload application when we make changes in development process  

Spring Boot Actuator – give info about application with endpoints:   /actuator/info, etc.  

Spring Boot Security, default username = user, default password is generated in console/ this can be overridden in application properties


@SpringBootApplication = @EnableAutoConfiguration + @ComponentScan + @Configuration.    
  
Do not use the src/main/webapp directory if your application is packaged as a jar, it works only as war.  


[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)

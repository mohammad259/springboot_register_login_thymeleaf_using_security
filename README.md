# springboot_login_thymeleaf_using_security

just create a database using mysql workbench

likewise

create database springboot;
use springboot;

No need to create a table, we can create using java configuration and properties of hibernate. 
create a project(name myspring-using-security-thymeleaf) from eclipse using spring starter project

after creating project 

go to project open src/java/resoure folder

you will see application.properties file open it 
add these below properties

#Manually Changing tomcat server port number
server.port=9090

## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.driver-class-name= com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/springboot?useSSL=false
spring.datasource.username = root
spring.datasource.password = mohammad

## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

## For Logging
logging.level.org.hibernate.SQL= DEBUG
logging.level.org.hibernate.type= TRACE





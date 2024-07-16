![banner](img/banner.png)

# Challenge-Literalura
Challenge Oracle/Alura Back-end

## Objetivo: 

Desarrollar un Catálogo de Libros que ofrezca interacción textual (vía consola) con los usuarios, proporcionando al menos 5 opciones de interacción. Los libros se buscarán a través de la API [Gutendex](https://gutendex.com) la cual es una JSON web API del projecto Gutenberg.

## Tecnologias utilizadas

- Java JDK: versión: 17 en adelante 

- Maven: versión 4 en adelante
- Lombok: version 1.18.24

- Spring: versión 3.2.3 - https://start.spring.io/

- Postgres: versión 14 en adelante - 

- IDE (Entorno de desenvolvimento integrado) IntelliJ IDEA- opcional -


Configuración al crear el proyecto en Spring Initializr:

- Java (versión 17 en adelante)

- Maven (Initializr utiliza la versión 4)

- Spring Boot (versión 3.2.3)

- Proyecto en JAR


Dependencias para agregar al crear el proyecto en Spring Initializr:

- Spring Data JPA

- Postgres Driver
- lombok 


## Cómo probar esta API


Modificar el archivo: [application.properties](./literalura/src/main/resources/application.properties) reemplazando las varibles DB_NAME, DB_USER, DB_PASSWORD por el nombre de una base de datos creada, el nombre de usuario y contraseña respectivamente o declarado las variables de entorno de su sistema operativo, luego ejecutar el archivo LiteraluraApplication.java.




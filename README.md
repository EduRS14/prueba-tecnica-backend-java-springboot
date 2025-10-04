# Backend de la Prueba Técnica

### Desarrollador: **Eduardo Rivas**

El presente proyecto representa el backend de una aplicación. Está desarrollada
usando las tecnologías Java 21, Spring Boot 3.5.6, y las siguientes dependencias:
- Mapper
- Lombok
- JWT
- Spring Web
- Spring Data JPA
- Spring Boot DevTools
- Spring Security
- PostgreSQL Driver

La aplicación hace uso de una conexión a una base de datos PostgreSQL, para lo cual
los parámetros específicos de aquella base de datos que debe estar creada (y las 
credenciales del usuario) están presentes en el archivo **application.properties**.

Este backend permite el uso de dos endpoints:
- GET/ bus: Recupera una lista de objetos con características principales de un bus
  en el caso planteado.
- GET/ bus/id: En base a un id, recupera un objeto con todas las características de
  un bus en el caso planteado.

El proyecto queda listo para la implementación de sistemas de inicio y sesión, al 
tener archivos ya establecidos para manejo de JWT y seguridad.

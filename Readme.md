# Seccion 2
## Introduccion

Spring es un framework que nos permite agilizar las aplicaciones de Java Empresariales. Una de sus grandes ventajas es que el FW avanza rapidamente, evolucionando por su propia cuenta

- Springboot: Permite crear aplicaciones Java de forma muy simple
- SpringCloud: permite crear aplicaciones para la nube
- Spring Cloud Data Flow: Permite comunicar de mejor manera aplicaciones que usan microservicios

![img.png](img.png)

El FW de Spring se compone de un stack de tecnologias.

### Servlet
- Utiliza el patron de diseño MVC para la parte Web 
- Permite crear aplicaciones de tipo REST para comunicarse con clientes web (Aungular, JS, react, etc)
- Su capa de datos utiliza tecnologias como JDBC, JPA y NoSQL
- Tambien permite el uso de SPring security para manejar la seguridad de las aplicaciones web
- Utiliza Servlet API y sus componentes como servlets, filters, listeners, etc

### Reactive
- Utiliza contenedores de tipo Servlet pero integra la programacion reactive
- La seguridad tambien es de tipo reactive con Spring WebFlux
- Su capa de datos tambien es reactivo como BD de tipo Mongo, Cassandra, Redis, etc

## Springboot
- Con springboot ya no es necesario configurar las apps con sus archivos xml, pues con Spring Initializer se pueden generar aplicaciones de forma sencilla agregando los componentes que necesitemos
- Simplifica la seguridad y se pueden agregar embebed runtime supports como Tomcat, Jetty, Undertow
- Trabaja con cualquier IDE como IntelliJ, Eclipse, netBeans, etc

![img_1.png](img_1.png)

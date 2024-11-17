# Seccion 7
## Validacion con Spring

### Modelo - Persona
- Las validaciones de Spring se pueden llevar a cabo mediante anotacion a nivel de campo
- En caso de requerir la librria de:
  - `<dependency><groupId>org.springframework.boot</groupId><artifactId>spring-boot-starter-validation</artifactId></dependency>`
- Para `Strings`, `@NotEmpty` permite validar que un campo no venga vacio ni sea nulo
- Para el campo emial, podemos usar `@Email` que tambien valdia la estructura de la cadena

![img_3.png](img_3.png)

### Vista - modificat.html
- En el formulario, es necesario agregar la informacion en caso de que haya un error de validacion
- Para validar agregamos `th:if="${#fields.hasErrors('nombre')}"`:
  - `th:if`: componente de thymeleaf para hacer validaciones
  - `#fields`: wildcard para referenciar los campos
  - `.hasErrors('nombre')`: funcion que valida si hay errores sobre algun campo
- Para desplegar mensaje de error usamos `th:errors="*{nombre}"`
  - componente de thymeleaf para acceder a los errores de un campo en particular

### Controlador - /guardar
- En el controlador, en el path de guardar, debemos esdpecificar que el modelo persona se debe validar
- Para ello debemos agregar `@Valid` antes del objeto persona que se pasa como argumento
- Tambien se debe pasar como argumento el objeto `Errors` para saber si se ha recibio algun error del formulario
- Finalmente debemos validar la existencia de errores y retornar la vista de `modificar` en caso de que los haya 

![img.png](img.png)

- En caso de haber un error en un campo, se desplegara el erro en el formulario

![img_1.png](img_1.png)

- Solo hasta llenar la informacion nos permitira guardar
- El telefono no es requerido, por lo que no validara el contenido de ese campo

![img_2.png](img_2.png)




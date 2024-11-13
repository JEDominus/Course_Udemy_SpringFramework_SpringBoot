# Seccion 3
## Hola Mundo con Thymeleaf y Spring MVC

### Aplicacion MVC
- En esta seccion vamos a utilizar la tecnologia de thymeleaf para la presentacion de la aplicacion
- Se requiere cambiar el controlador de `@RestController` a `@Controller`.
- Estas 2 anotaciones se configurand e manera similar, por lo que no es necesario cambiar la anotacion `@GetMapping`
- En esta ocasion, el metodo del controlador en lugar de regresar un string, va a regresar el nombre de la pagina que se va a desplegar en el navegador
- El controlador ya maneja la tecnologia de servlet, por lo que no es necesario que la clase extienda de `HttpServlet`

### Thymeleaf
- Esta tecnologia maneja paginas en formato `html`, no `jsp`, por lo que hemos de crear el archivo `index.html`
- En el controlador, solo se regresa el nombre del archivo sin la extension `.html`
- El archivo debe ser creado en el paquete de `resources/templates` como archivo `html` con el nombre que el controlador retorna: `index`
- Con esto, ya podemos ejecutar la aplicacion y ver la pagina con el archivo html referenciado

![img.png](img.png)

### Informacion dinamica con Thymeleaf
- Para poder manejar informacion dinamica en nuestra pagina html con thymeleaf es necesario configurar el archivo html
- Sobre la etiqueta html, hay que agregar: `xmlns:th="http://www.thymeleaf.org"`
- `xmlns`: xml namespace
- `th`: prefijo de las etiquetas de thymeleaf 
- Para confirmar que esta configuracion es correcta, se ha agregado en un etiqueta de parrafo, el atributo `th:text` y el texto que queremos desplegar en el componente de tipo texto

![img_1.png](img_1.png)

- Error encontrado: No usar espacios dentro del valor `text` del componente `th`, marcara error de parseo

### Extras
- Se ha quitado la informacion de Spring de los logs usando `spring.main.banner-mode = off` en el archivo `application.properties`
- Se ha quitado el cache de thymeleaf usando `spring.thymeleaf.cache = false` en el archivo `application.properties`
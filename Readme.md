# Seccion 5
## Manejo Transaccional

### Capa de Servicio
- Crearemos una capa de servicio entre la capa de datos y la capa de presentacion
- Para ello crearemos una interfaz y una implementacion para `Persona`
- En nuestra interfaz `PersonaService` agregaremos los metodos que queramos implementar mas delante
- De momento vamos a agregar los siguientes:
- `listarPersonas`, que devuelve una lista de personas
- `guardarPersona`, que recibe un objetod e tipo persona y lo guarda en la abse de datos
- `eliminarPersona`, que recibe la persona a eliminar
- `encontrarPersona`, que sirve para encontrar una persona en especifico
- Ahora se requiere de la implementaciond e esta interfaz en nuestra clase de servicio `PersonaServiceImpl`

### Implementacion
- Ahora basta con llamar desde nuestra capa de servicio `PersonaServiceImpl` a nuestro repositorio con los metodo rpedefinidos por jpa
- En el caso de `findAll`, hay que castear el return a un tipo `List...` ya que originalmente retorna un `Iterable...`
- En el caso de `findById`, dado que retorna un `optional` hay agregar alguna otra accion por si no lo encuentra, en este caso `null`
- Para `save` y `delete` se puede hacer la llamada directa sin ningun problema

### Transacciones - Spring Transactional
- Cuando estamos en la capa de datos, se maneja el concepto de `Transacciones`
- Cualquier operacion que se haga en la base de datos:
  - En caso de fallar, se ejecuta un `rollback`
  - En caso de ser exitoso, se hace un `commit`
- Dado que un mismo servicio puede manejar varias llamadas a varias clases DAO, es necesario anotar los metodos como `@Transactional`
- Existen diferentes tipos de transaccion segun la operacion que estamos realizando

### Tipos de Transacciones
- `@Transactional(readOnly = true)` para `findAll` y `findById` ya que solo leen de la base de datos
- `@Transactional` para `save` y `delete` dado que modificara la base de datos y es necesario hacer `commit` o `rollback`

### Controlador
- En el controlador se injecta la capa de servicio con el nombre de la interfaz `PersonaService` y no el de la implementacion `PersonaServiceImpl`
- **Spring en el controlador va a buscar el tipo del servicio (que es la interface `PersonaService`) y por otro una instancia de la implementacion de esa interface que sea marcado con la anotacion `@Service` (`PersonaServiceImpl`)**
- Esto permite cambiar la implementacion sin cambiar el codigo del controlador dado que esta apuntando a la interface y no a la implementacion directamente
- En la siguiente leccion,s e implementara el resto de operacion, aunque de momento, ya podemos ver la lista de personas en la base de datos 

![img.png](img.png)
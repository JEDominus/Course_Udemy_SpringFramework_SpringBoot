# Seccion 6
## CRUD Eliminar

### Vista - index.html
- Comenzamos por agregar una nueva columna en la tabla para pdoer eliminar un registro
- `<a th:href="@{/eliminar/} + ${persona.persona_id}">Eliminar</a>`
  - `@{/eliminar/}` es el path de nuestro controlador
  - `+ ${persona.persona_id}` es el `pathVariable` que señala que `Persona` vamos a eliminar
- Por lo tanto al controlador le debe llegar por ejemplo un `/eliminar/1`
- Podemos observar que el nuevo campo editar ya se encuentra en la tabla



### Controlador - /eliminar/{personaId}
- Agregamos una operacion de tipo GET similar a la de editar `/eliminar/{personaId}`
- Pasamos un objeto de tipo `Persona` como atributo
- Llamamos  a nuestro servicio con su metodo `eliminarPersona`
- Dinalmente hacemos un redirect a `/`
- Vamos a eliinar el ultimo registro de nuestra tabla: 

![img.png](img.png)

- Confirmamos en consola que se hay realizado un delete

![img_1.png](img_1.png)

- Y finalmente observamos nuestra tabla actualizada

![img_2.png](img_2.png)

### Delete con queryParam - Vista
- Anteriormente utilizamos `pathVariables` para pasar el id de la persona desde el FE con `/eliminar/{personaId}`
- A continuacion la diferencia en sintaxis:
  - `pathVarioable`: `th:href="@{/eliminar/} + ${persona.personaId}"`
    - URL: `/eliminar/1`
  - `queryParam`: `th:href="@{/eliminar(${persona.personaId})}"`
    - URL: `/eliminar?personaId=1`

### Delete con queryParam - Controlador
- Del lado del controlador, a la hora de cambiar a `queryParam`, solo hay que eliminar el `pathVariable` del endpoint
- Pasando de esto: `/eliminar/{personaId}` a esto: `/eliminar`
- Spring en automatico setea el id recibido como parametro en el objeto compartido
- Podemos observar como funciona la eliminacion del ultimo registro

![img_3.png](img_3.png)

- Se ejecuta el delte 

![img_4.png](img_4.png)

- Se elimina de la lista 

![img_5.png](img_5.png)


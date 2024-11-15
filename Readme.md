# Seccion 3
## Iterar listas en Thymeleaf

### Creacion de una lista de personas
- Para esto se requiere la creacion de mas objetos de tipo persona ya gregarlos en un `ArrayList`
- Se ha creado un servicio que se encargue de crear personas y regrese la lista de las personas
- Este service debe ser anotado con `@Service` para que el `ComponentScan` del contenedor lo agregue al contexto
- Ahora solo debemos agregar esta lista al modelo

### Vista
- Del lado de Thymeleaf, utilizaremos `th:each="persona : ${personas}` para iterar los objetos de la lista
- donde `persona` es el elemento actual iterado y `${personas}` el objeto que agregamos en el controlador
- Una vez iterada la lista, podemos observar los valores en la vista

![img.png](img.png)

### Validacion Thymeleaf
- Se agrego la validacion de la lista de personas para que muestre la tabla solamente si no es nula y contiene elementos
- Para esto utilizamos `th:if="${...condicion...}"`
- Un div para mostrar la tabla si la listano es nula ni esta vacia y otro que muestre un mensaje si la lista es nula o vacio
- Se ha nulificado la lista y podemos ver el mensaje en la pagina correctamente

![img_1.png](img_1.png)


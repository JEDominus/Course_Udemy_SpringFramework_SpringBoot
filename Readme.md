# Seccion 6
## CRUD Agregar

### Vista (index.html)
- Comenzamos por agregar `<a th:href="@{/agregar}">Agregar Persona</a>`
  - `<a...>Agregar Persona</a>` es la etiqueta utilizada para links
  - `th:href=""` el componente de thymeleaf para la referencia del link
  - `@{/agrega}` el path del controlador que maneja esa operacion
- Podemos observar que ya se encuentra la opcion en nuestra pagina

![img.png](img.png)

### Controlador - /agregar
- Se debe agregar el path de `/agregar` al controlador de tipo GET
- Podemos crear la persona en el metodo o tambien pedirle a spring que lo genere
- Para generarlo, solo agregamos un nuevo argumento de tipo `Persona` en el metodo de agregar
- Al generar este objeto con `spring factory`, ya esta al alcance del objeto `request`
- Este metodo solo retorna la vista `modificar (modificar.html)` ya que realizara ambas operaciones

### modificar.html
- Configuramos este nuevo template con el namespace de thymeleaf y agregamos los elementos html que queramos en la pagina
- Comenzando por un link que nos permita regresar a la pagina de inicio: `<a th:href="@{/}">Inicio</a>`
- Comprobamos que funcione presionando los links en ambas pagina

![img_1.png](img_1.png)

![img_2.png](img_2.png)

- Ahora agregamos el formulario

### Formulario (modificar.html)
- Utilizando `th:action="@{/guardar}" method="POST"` definimos el tipo de operacion y el endpoint al que va a llamar
- El endpoint `/agregar` esta asociado con un objeto de tipo `Persona`. Entonces basta con utilziar `th:object="${persona}"` para referenciar al objeto persona al que esta asociado el endpoint
- Agregamos los inputs para cada campo
  - Utilizamos `th:field="*{nombre}"` para asociar cada campo con la propiedad del objeto persona
- Ahora si inspeccionamos el input en el navegador, podemos observar que la etiqueta ha asociado el nombre con el campo `persona.nombre`. Lo podemos ver mediante el campo `id="nombre"`

![img_3.png](img_3.png)

- Esta asociacion se encarga de hacerla thymelead y spring. El atributo `id` hace referencia a la propiedad del objeto asociado, `persona`" en este caso
- Finalmente hemos agregado el resto de campos y comprobamos que se hayan referenciado correctamente con cada campo del tipo `Person`a mediante el atributo `id`

![img_4.png](img_4.png)

### Controlador - /guardar
- Ahora solo falta agregar el endpoint `/guardar` para que el formulario funcione dado que esta referenciado en la vista mas no se ha creado en el controlador
- en esta ocasion, el formulario es de tipo `post` por lo que utilizaremos `@PostMapping`
- Agregamos como argumento nuestro objeto de tipo `Persona` que ya contiene toda la informacion que hemos agregado
- Despues llamamos a nuestro servicio para que ejecute el `save`
- Por ultimo, retornamos un `redirect:/` para redireccionar a la pagina de inicio
- Con esto hemos completado el fluejo para agregar personas:

![img_5.png](img_5.png)

- Este registro se agrega a la base de datos, misma de donde se lee para la tabla

![img_7.png](img_7.png)

![img_6.png](img_6.png)


### Extras
- El Id autogenerado de la tabla `Persona` puede saltarse i.e 1 -> 5 si hubo 3 registros intermedios que se eleiminaron
- Con `ALTER TABLE persona AUTO_INCREMENT = 1`, seteamos el valor inicial del id siguiente registro en 1
  - Si este ya se encuentra ocupado, seguira buscando hasta encontrar el siguiente numero disponible
  - Por lo que nuestro registro numero 6, ahora tendra el id 2 


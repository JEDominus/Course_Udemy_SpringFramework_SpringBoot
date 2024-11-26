# Seccion 12
## Aplicacion final

### Vista general
- Login

![img_20.png](img_20.png)

- Incio

![img_22.png](img_22.png)

- Crear cliente

![img_23.png](img_23.png)![img_24.png](img_24.png)

- Lista de clientes

![img_25.png](img_25.png)

- Editar cliente

![img_26.png](img_26.png)

________________________________

### Librerias Bootstrap, FontAwesome y WebJar
- `Bootstrap`: Mejoras visuales de elementos html
- `FontAwesome`: Iconografia
- `WebJar`: contiene librerias como FontAwesome, JQuery, etc
  - Es necesario agregarla si es que vamos a agregar bootstrap y fontawsome de la siguiente manera

![img.png](img.png)

### Agregar librerias a las plantillas HTML
- Las librerias de mejopras visuales deben de incluirse dentro de etiquetas `link` y especificando la ruta de la libreria
  - En este caso, `Bootstrap` y `font-awesome`
- Por otro lado, es necesario agregar librerias de `JavaScript` para el buen manejo de las librerias visuales
- Estas van dentro de una etiqueta `script`
  - Agregaremos `JQuery`, `Popper` y `Bootstrap` de JS
- Ahora debemos especificar que nuestro elemento `head` sea un fragmento de thymeleaf para que los demas html compartan esta configuracion

![img_1.png](img_1.png)

- Finalmente incrustamos la configuracion del head en las demas plantillas html

![img_2.png](img_2.png)

- Una vez configurado, podremos ver que la fuente de nuestras pantallas ha cambiado, dado que esta es una caracteristica de bootstrap y demuestra que se ha implementado correctamente

![img_3.png](img_3.png)

- En caso de haber errores con la carga de los scripts, es posible tener que agregar los permisos a SpringSecurity para acceder a esos recursos:

![img_4.png](img_4.png)

### Barra de navegacion
- Vamos a modificar la etiqueta `header` de la `plantilla.html`
  - `<nav class="navbar navbar-expand-sm navbar-dark bg-dark p-0"></nav>`
  - todas als configuraciones de `class` pueden consultarse en el sitio oficial de bootstrap
- Bootstrap maneja el concepto `mobile-first`
  - Esto indica que siempre ajustara sus componentes para que sean utilizados en dispositivos moviles, y despues a navegadores mas grandes
- Se ha agregado un navbar
  - Este navbar contiene un ancla a nuestra pagina de inicio `/`
  - Tambien contiene un boton `toggler` que permite mostrar el menu colapsable en celulares
  - el `span` contiene el icono del menu colapsable
- En el siguiente contenedor se contendra el menu desplegable, por lo que hay que referenciar el id del boton que lo despliega `navbarCollapse`
- La segunda lista de la barra solo se muestra si se encuentra autenticado el usuario
  - Para ello se utiliza la etiqueta de spring security
- Configuracion final del header

![img_5.png](img_5.png)

- Vista en resolucion de ordenador 

![img_6.png](img_6.png)

- Menu desplegable en version movil

![img_7.png](img_7.png)
![img_8.png](img_8.png)

### Header (nav arte 2) y Footer 
- Se ha agregado en el header la parte del titulo con la siguiente configuracion:

![img_9.png](img_9.png)

![img_10.png](img_10.png)

- Para el footer agregaremos clases de bootstrap para cambiar su apariencia 

![img_11.png](img_11.png)

![img_12.png](img_12.png)

### Pagina de login
- Ademas de las plantillas de navbar, header y footer, se han hecho las siguiente mejoras al login 

![img_14.png](img_14.png)

![img_13.png](img_13.png)

### Modificacion de tabla Persona (campo Saldo)
- Hemos agregado una nueva columna  ala entidad de persona para saber cuanto saldo debe

![img_17.png](img_17.png)

- Por lo tanto hay que agregarlo en la entidad `Persona.java`
- Se agrega la anotacion `@NotNull` dado que no es un string

![img_18.png](img_18.png)

### Listado de personas - Agregar persona
- Mantendremos el header y el footer
- Pero vamos a agregar una plantilla para
  - Seccion de botones de agregar
  - Manejo de agregar
  - listar clientes
- Crearemos la plantilla `botonesAgregar.html` en `layout`

![img_15.png](img_15.png)

![img_16.png](img_16.png)

### Listado de personas - Listado clientes
- Ir a listadoClientes.html para mas detalles

![img_19.png](img_19.png)


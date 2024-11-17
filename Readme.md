# Seccion 9
## Manejo de mensajes con Spring

### Objetivo
- Permite almacenar cadenas de texto en un archgivo de propiedades para que las vistas puedan leerlas sin tener que contener los valores en los archivos html
- mas delante, esto nos permitira manejar diferentes idiomas de esas cadenas y cambiar el idioma de todo el sitio facilmente

### Estructura
- Este archivo de propiedad se encuentra al mismo nivel que el applciation.properties
- Creamos un nuevo archivo de propiedades llamado `messages.properties`
- Ahora solo debemos agregar todos los textos que tenemos en nuestra vista dentro de ese archivo, tales como:
  - `Nombre`, `Apelli`, `Control de Clientes`, `Todos los derechos reservados`, etc
- Estos mensajes se definen como propiedad con la notacion del punto, por ejemplo:

![img.png](img.png)

### Referencia en vistas
- Dentro del componente `th:test` solo hay que referenciar con `"#{plantilla.titulo}"`
- Esto en automatico ira al archivo de propiedades y leera el valor del texto

![img_1.png](img_1.png)

- Existe una sintaxys alternativa para fragmentos de texto cuando no se requiera conbinar con otro texto
- Por ejemplo, en el pie de pagina, si quiero conservar el nombre pero agregar el texto del archivo de propiedades, se utiliza la anotacion de doble corchete:
  - `[[#{plantilla.pie-pagina}]]`

![img_2.png](img_2.png)

- Con esto podemos observar que ya se encuentran los mensajes del archivo en la plantilla
- Y dado que la plantilla esta en diferentes vistas, el texto se ha actualizado en todas ellas

![img_3.png](img_3.png)

- En casod e que alguna propiedad este mal referenciada o no exista, se desplegara de esta forma: 

![img_4.png](img_4.png)

### Validaciones
- Tambien se pueden eprsonalizar los mensajes de las validaciones del formulario

![img_5.png](img_5.png)

- Ahora nuestros mensajes de validacion se muestran de la siguiente manera

![img_6.png](img_6.png)

- Curiosamente no se requierio definir el mensaje para la validacion de `email invalido` en la vitsa `modificar.html`

![img_7.png](img_7.png)

- Solo basto con definirlo en el archivo de mensajes y en automatico lo detecto para ese error
- Esto se debe a que como hemos definido el nombre con el mismo de la anotacion `NotEmpty` o `Email` en automatico lo toma como su valor de validacion


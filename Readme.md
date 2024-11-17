# Seccion 8
## Plantillas Thymelead

### Objetivo
- Las plantillas de Thymeleaf nos evita tener que estar repitiendo codigo en cada una de las vistas
  - Por ejemplo, si agregamos un `footer`, el tener que codificarlo en `index.html` y en `modificar.html`

### Plantillas
- Sobre la carpeta de `templates`, agregaremos una nueva llamada `layout`
- Luego crearemos un nuevo archivo html llamado `plantilla`
- Configuramos la plantilla con el namespace:
  - Thymeleaf: `xmlns:th="http://www.thymeleaf.org"`
  - W3: `xmlns="http://www.w3.org/1999/xhtml"`
    - Este nos permitira evitar los errores que aparecen en el archivo html
- Como esta plantilla se va a reutilizar en index y en modificar, vamos a divirila en varias secciones

### Configuracion - header
- Para configurar un header como reutilizable para otras paginas debemos de hacer lo siguiente
- Dentro del componente a reutilizar, agregamos `th:fragment="headerPerron"`. entre comillas el nombre
- Ahora ya podemos comenzar a construir ese compoennte con lo que deseemos

![img.png](img.png)

### Reutilizacion - index.html
- Ahora solo debemos referenciar el fragmento que hemos creadod e la siguiente forma: `<header th:replace="layout/plantilla :: headerPerron"></header>`
  - `header` es el componente que definimos en la plantilla
  - `th:replace` componente de thyme leaf para referenciar el fragmento
  - `layout/plantilla` la ruta de la plantilla que contiene el fragmento
  - `:: headerPerron` el nombre del fragmento que queremos reutilizar

![img_1.png](img_1.png)

- Con esto podemos observar que el ehader  de la plantilla ya aparece en amabas vistas

![img_2.png](img_2.png)

![img_3.png](img_3.png)

### Plantilla - footer
- Podemos definir un footer dentro del mismo layout `plantilla` siempre y cuando lo configuremos de la misma forma, como un fragmento

![img_4.png](img_4.png)

![img_5.png](img_5.png)

- Con esto podemos observar el nuevo fragmento de la plantilla en ambas paginas

![img_6.png](img_6.png)

![img_7.png](img_7.png)

### Conlusion
- Se pueden crear diferentes plantillas con diferentes fragmentos cada uno
- Cada plantilla puede tener mas de un fragmento reutilziable
- Los fragmentos se peuden llamar por separado en diferentes vistas para no tener que repetir codigo HTML






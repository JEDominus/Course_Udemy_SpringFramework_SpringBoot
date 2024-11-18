# Seccion 9
## Internacionalizacion

### Configuracion
- Lo primero es configurar el listener que trae spring
- Para ello vamos a crear una clase llamada `WebConfig` en el paquete `web` y la anotamos con `@Config`
  - Esta ultima para que Spring `ComponentScan` lo detecte y lo agregue al contenedor
- Esta clase debe imnplementar `WebMvcConfigurer`, la cual trae varios metodos por default, por ejemplo, `addInterceptors()`
  - Necesitamos este interceptor para la configuracion de la internacionalizacion

### WebConfig - LocaleResolver
- `@Bean` permite definir un metodo para crear una instancia de un objeto
  - La anotacion tambien aydua a agregar ese objeto al contenedor de spring
- Creamos un metodo que retorne un `LocaleResolver`, se encargara de resolver el idioma local
  - instanciamos un objeto de tipo `SessionLocaleResolver` de la liobreria `i18n`
    - `i18n` se refiere a que hay 18 cracteres entre la `i` y la `n` de `internationalization`,
- Despues usando `slr.setDefaultLocale(new Locale("es"));` establecemos el idioma por default
- Finalmente retornamos el objeto para que se agregue al contexto

### WebConfig - Creacion Interceptor
- Creamos otro brean de tipo `LocaleChangeInetrceptor`
- Este nos permitira cambiar el lenguaje de forma dinamica
- Para estoy hay que definir el parametro que nos permitira cambiar de lenguaje
  - Mediante `lci.setParamName("lang");` ya podemos referenciar `lang` en las URLs y cambiar su lenguaje con eso

### Prefijos de lenguaje de internacionalizacion
- `en` - English
- `de` - German
- `fr` - French
- `ru` - Russian
- `ja` - Japanese
- `zh` - Chinese
- `ar` - Arabic

### WebConfig - Sobreescritura de Interceptor
- Finalmente se debe de sobreescribir el interceptor de spring con el nuevo que hemos creado
- Para ello, crearemos un nuevo metodo `void` que reciba un `InterceptorRegistry` (registro de interceptor)
- Mediante el metodo `addInterceptor()` mandamos llamar el metodo bean que acabamos de crear
  - `registry.addInterceptor(localeChangeInterceptor());`
- Hasta aqui termina la configuracion

### Nuevos idiomas
- Para tener mas idiomas necesitamos registrar otros archivos de propiedades
- Vamos a duplicar el archivo `messages.properties` agregando al final `_en` y `_es`
  - Esto eprmitira definir que un archivo manej mensajes en español y otro en ingles
- Ahora solo falta modificar los valores de las etiquetas del archivo en ingles `messages_en.properties`

### Configuracion en la vista
- En el componente del footer, vamos a agregar 2 links para cambiar de idioma dinamicamente
- Este nos regresara al home pero en el nuevo idioma

![img.png](img.png)

- Ahora ya podemos cambiar entre lenguajes

![img_1.png](img_1.png)

![img_2.png](img_2.png)

- Agregando ams archivos de propiedades, podemos agregar mas idiomas
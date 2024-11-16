# Seccion 4
## Conexion BD con IDE

### IntelliJ IDEA Ultimate
- Desde la pestaña de `Database`, seleccionamos `+` - `DataSource` y buscamos `MySQL`

![img.png](img.png)

- Configuramos el usuario y contraseña
- Agregamos los siguientes parametros a la URL de la DB `?useSSL=false&useTimezone=true&serverTimezone=UTC`
- Es probable que se requiera descar el driver de SQL
- Hacemos un test de conexion y finalizamos

![img_2.png](img_2.png)

- Una vez agregada la Base de datos, seleccionamos el schema

![img_3.png](img_3.png)

- Y ahora ya podemos comenzar a hacer consultas

![img_4.png](img_4.png)
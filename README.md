# INSTRUCCION DEL PROYECTO CRUD

## Descargar el proyecto en spring initializr
[spring initializr](https://start.spring.io/)

Una vez estemos en la pagina de spring, procedemos a configurar el proyecto.
1. Project: Usamos Maven
2. Language: Seleccionamos Java
3. Spring Boot: Seleccionamos la version 3.4.0
4. Configuramos el Project Metadata

    4.1. Se configura con los nombres que necesitemos para el proyecto

        En el Group, ponemos el nombre de MiPrimerCrud

        En el Artifact ponemos MiPrimerCrud

        En el Package name ponemos CRUD

    4.2 Packagin: Seleccionamos Jar

    4.3 Elegimos la version de java: Seleccionamos 17

Importante, poner las dependencias necesarias: 
1. Spring web
2. Thymeleaf
3. MySQL Driver
4. Spring Data JPA

Después de poner las configuraciones necesarias para las dependencias. Procedemos a crear la base de datos. Para esto utilizaremos MySQL con MySQL Workbench.
Se puede descargar en la pagina de MySQL.
Para esto vamos a community downloads. 

[MySQL](https://dev.mysql.com/downloads/)

Seleccionamos MySQL Workbench y MySQL Installer for Windows.

Llamaremos a la base de datos 'Musica'. Las columnas de la tabla seran creada mediente codigo. 

Es importante conocer el username y el password de la base de datos, el usuario por defecto es root, sin embargo la contraseña la creamos al momento de instalr MySQL. 
En puerto por defecto para SQL es el puerto 3306. Es importante para poder conectar el proyecto con la base de datos.

Vamos a nuestro editar de preferencia, en este caso usamos Visual Studio Code, pero se puede usar cualquier IDE. 
Copias el archivo en VSC y descargamos las extenciones necesarias para ejecutar el proyecto spring-boot.

1. Spring Initializr Java Support.
2. Spring Boot Dashboard.
3. Spring Boot Tools.
4. Spring Boot Extension Pack.

En la parte de la izquierda podemos ver que nos aparece el boton de Spring boot. Le damos clic y nos lleva al apartado de Spring Boot Dashboard.
En la parte de APPS encontramos nuestro proyecto 'Mi_Proyecto_Crud', para correr el proyecto le damos clic al botón de play. Se ejecutara el 
proyecto. Para poder visualizar el proyecto vamos a nuestro navegador, ponemos en la barra de busqueda la sigueinte URL 'localhost:8080/listar'.
Es importante mencionar que el puerto por defecto de Spring boot es 8080. 

### Usar las funciones CRUD del proyecto.

Las funciones principales de un son:
1. CREATE.
2. READ.
3. UPDATE.
4. DELATE.

Para poder usar el CREATE usamos el boton Agregar, nos llevara a un formulario. Ingresamos los datos corresponiente y le damos en guardar.
Se mostrara el nuevo registro en la tabla y en la base de datos. 
Para poder usar el UPDATE usamos el boton editar, nos llevare nuevamente al formulario, cambiamos los valores por los nuevos valores 
y le damos en guardar. Guardara los cambios y mostrara la tabla con el registro modificado.
Para poder usar el DELATE usamos el boton eliminar. Nos mostrara un mensaje emergente, confirmamos la peticion con el boton 'OK', y se mostrara
otra ventana emergente que nos dira 'Registro eliminado exitosamente'.





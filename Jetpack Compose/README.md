# Jetpack Compose

Kit de herramientas moderno para crear IUs de Android.

Con Compose es posible compilar la IU a partir de la definicion de un conjunto de funciones, llamadas funciones de componibilidad, las cuales toman datos y describen elementos de la IU.

### Funciones de componibilidad

Componentes basicos de una IU en Compose. Las funciones de componibilidad cumplen con lo siguiente:

- Describen alguna parte de la IU
- No tienen retorno
- Toman informacion y generan lo que se muestra en pantalla

### Anotaciones

Las anotaciones son una forma de adjuntar informacion adicional al codigo, la cual ayuda a herramientas como el compilador de Jetpack Compose a comprender el codigo de la aplicacion.

- Se agrega un prefijo al nombre (la anotacion) con el caracter `@` al comienzo de la declaracion en la que se hara la anotacion. Se pueden anotar diferentes elementos del codigo como funciones, propiedades y clases.

#### Funcion con anotaciones

    @Composable
    fun Greeting(name: String)

    - @ :: Prefijo
    - Composable :: Anotacion
    - fun Greeting(name: String) :: Declaracion de la funcion

#### Anotaciones con parametros

Los parametros proporcionan informacion adicional a las herramientas que las procesan.

    @Preview(background = true)

El parametro `background` pasado a la anotacion @Preview añade un color de fondo solido a la previsualizacion del componente en la interfaz de Android Studio.

Las anotaciones pueden contener varios parametros

    @Preview(
        name = "My Name",
        background = true
    )

### Ejemplo de una funcion de componibilidad

Las funciones de componibilidad tienen la anotacion `@Composable`. La anotacion le informa al compilador de Compose que esta funcion esta diseñada para convertir datos en IU.

    @Composable
    fun Greeting(name: String) {
        Text(text = name)
    }

El fragmento de codigo anterior es un ejemplo de una funcion componibilidad, a la cual se le pasan datos mediante un parametro, posteriormente usa dichos datos para renderizar un elemento de texto en la pantalla.

Las funciones de componibilidad pueden llamar a otras funciones del mismo tipo.

    @Preview(background = true)
    @Composable
    fun GreetingPreview(name: String) {
        Greeting(name)
    }

El fragmento de codigo anterior define una funcion de componibilidad de vista previa. La funcion invoca a la funcion de componibilidad `@Greeting`

#### Nombres de las funciones de componibilidad

Las funciones de Compose que no tienen retorno y llevan la anotacion `@Composable` deben tener un nombre con la primera letra en mayuscula (PascalCase).

### Panel de diseño

Android Studio permite obtener una vista previa de las funciones de componibilidad, sin la necesidad de configurar un emulador o de utilizar un dispositivo fisico.

Esta previsualizacion se puede obtener desde el panel `Design` del IDE.
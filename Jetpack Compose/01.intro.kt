// Nombre de la aplicacion
package com.example.greetingcard

class MainActivity : ComponentActivity() {
    /**
     * La funcion onCreate() es el punto de entrada de la aplicacion
     * y es desde donde se llama a otras funciones para compilar la interfaz del usuario.
     *
     * En los programas de Kotlin la funcion main() es el lugar especifico en el codigo
     * en el que se incia el compilador. En las apps de Android onCreate() realiza esa tarea.
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * La funcion setContent() dentro de la funcion onCreate() se usa para definir el diseño
         * mediante funciones que admiten composicion.
         *
         * Dentro de setContent() se pueden llamar a todas las funciones marcadas
         * con la notacion @Composable.
         *
         * La notacion del composable le indica al compilador de Kotlin que Jetpack Compose
         * usa esta funcion para generar la IU.
         * */
        setContent {
            GreetingCardTheme {
                /**
                 * Un Surface es un contenedor que representa una seccion de la IU
                 * en la que se puede modificar el aspecto como el borde o el color de fondo
                 * */
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Martin")
                }
            }
        }
    }
}

/**
 * La funcion Greeting() corresponde a la componabilidad.
 *
 * Una funcion de componibilidad toma alguna entrada y genera lo que se muestra en pantalla.
 *
 * Los nombres de las funciones @Composable inician con mayuscula.
 * */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    /**
     * La combinacion de teclas Alt + Enter permite rodear un elemento con una Surface.
     * De las opciones desplegadas se selecciona Surround with widget y posteriormente
     * Surround with Container.
     *
     * El contenedor predeterminado que se dara sera Box, pero este puede ser reemplazadado
     * por otro contenedor, por ejemplo Surface.
     *
     * El contenedor Surface tiene un parametro color (color = Color.<color_name>)
     * */
    Surface(color = Color.Green) {

        /**
         * Modifier se utiliza para aumentar o decorar un elemento que admite composicion.
         *
         * Por ejemplo la funcion Modifier.padding() permite agregar espacio alrededor de un elemento
         * */
        Text(
            text = "Hi, my name is $name!",
            modifier = Modifier
                .padding(24.dp)
        )
    }
}

/**
 * La funcion GreetingPreview() es una funcion que permite ver como se ve la aplicacion
 * sin tener que compilarla completamente.
 *
 * Para que una funcion sea de vista previa, se debe agregar la notacion @Preview().
 *
 * La notacion @Preview() recibe un parametro llamado showBackground. Si este parametro
 * se establece como verdadero se agregara un fondo a la vista previa de la aplicacion.
 * */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Martin")
    }
}

/**
 * Comandos basicos
 *
 * - Realizar una importacion (Alt + Enter)
 * - Ordenar las importaciones (Ctrl + Alt + Enter)
 * */
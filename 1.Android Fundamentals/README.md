## Estructura de archivos en Android

#### app > kotlin+java > com.example.<app_name>

Dentro de este paquete se encuentra el archivo `MainActivity.kt`, en el cual por defecto se ubica la logica utilizada para interactuar con la interfaz del usuario.

#### app > res

Este directorio contiene los recursos (imagenes, strings, etc.) que se podran utilizar en la aplicacion.

- drawable :: Imagenes
- layout :: Archivos XML utilizados para la maquetacion de la aplicacion
- mipmap :: Iconos
- values
    - colors :: Colores que se podran utilizar en la aplicacion
    - strings :: Texto que podra ser reutilizado para mostrarse en multiples lugares de la aplicacion
- themes :: Temas que se podran utilizar en la aplicacion
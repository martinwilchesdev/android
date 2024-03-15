# XML

XML (lenguaje de marcado extensible) es una forma de describir lso datos mediante un documento basado en texto.

La flexibilidad y extensibilidad de XML permite definir diseños de la IU de aplicaciones de Android.

La IU de de una aplicacion de Android se compila como una jerarquia de contencion de componentes (widgets).

Jerarquia de contencion de una aplicacion para Android.

    -| ViewGroup
        -| ViewGroup
            -| View
            -| View
            -| View
        -| View
        -| View

La jerarquia de la IU visible se basa en la contencion, es decir, un componente tiene 1 o mas componentes dentro de el.

A menudo se utilizan los terminos superior y secundario, siendo los ViewGroups las vistas superiores quienes contienen las vistas secundarias, las cuales a su vez pueden contener otras vistas secundarias.

    -| ContstraintLayout (Parent)
        -| TextView (Child)

Cada elemento de la IU esta representado por un elemento XML en el archivo de formato XML. Cada elemento comienza y termina con una etiqueta, y cada etiqueta comienza con un `<` y termina con un `>`.

Los elementos XML pueden tener atributos

    <ConstraintLayout>
        <TextView
            text="Hello World">
        </TextView>
    </ConstraintLayout>

### Propiedades

Cada elemento de la IU puede recibir propiedades, las cuales pueden modificar el comportamiento y la visibilidad den la interfaz grafica con la que interectuara el usuario.

    <TextView
        android:background="@android:color/holo_purple"
    />

En el fragmento de codigo anterior, la propiedad `background` es utilizada para modificar el color de fondo del elemento `TextView`.

### Conectar el codigo con los componentes de la IU

Para acceder a un componente de la IU se utiliza el archivo `R.java`

    // MainActivity.kt

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_layout)

        button = findViewById(R.id.main_button)
        button.text = "Login"
        button.setTextColor(Color.GREEN)
    }

- Dentro de la funcion onCreate() se define un metodo setContentView(), el cual recibe como parametro el layout que se mostrara al iniciar la aplicacion.
- Se define una variable `button`, a la cual se le asignara un valor de manera posterior. Esta variable es de tipo `Button` y se le asignara el boton que contenga el id `main_button`.
- El metodo `findViewById()` recibe como parametro el id del elemento de la interfaz que sera asignado a la variable button.
- Esta variable tiene acceso a diversas propiedades que permiten manipular el elemento de la interfaz al que referencian.
# XML

XML (lenguaje de marcado extensible) es una forma de describir lso datos mediante un documento basado en texto.

La flexibilidad y extensibilidad de XML permite definir diseños de la IU de aplicaciones de Android.

La IU de de una aplicacion de Android se compila como una jerarquia de contencion de componentes (widgets).

    -| ViewGroup
        -| ViewGroup
            -| View
            -| View
            -| View
        -| View
        -| View
        
    ** Jerarquia de contencion de una aplicacion para Android

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


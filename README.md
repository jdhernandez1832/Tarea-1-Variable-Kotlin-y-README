
# Ejemplo de Código en Kotlin: Variables, Constantes y Manejo de Nulos
###Julian Hernandez 2902081
Este proyecto demuestra el uso de variables normales, constantes y variables opcionales (que pueden ser nulas) en Kotlin. Además, incluye ejemplos de cómo manejar valores nulos de manera segura.

## Estructura del Código

El archivo de código principal contiene las siguientes funciones:

1. `main()`: Llama a las funciones `VariableNormal()`, `Constante()`, y `Opcional()`.
2. `VariableNormal()`: Demuestra el uso de una variable mutable.
3. `Constante()`: Demuestra el uso de una constante.
4. `Opcional()`: Demuestra el uso de una variable que puede ser nula.
5. `nulos()`: Demuestra cómo manejar valores nulos en Kotlin.

## Funciones

### main()

```kotlin
fun main() {
    VariableNormal()
    Constante()
    Opcional()
}
```

Llama a las funciones que demuestran diferentes tipos de variables y su manejo.

### VariableNormal()

```kotlin
fun VariableNormal() {
    var NormalVar = "Hello, world!"
    println(NormalVar)
}
```

Declara y utiliza una variable mutable (`var`). En este ejemplo, la variable `NormalVar` se inicializa con el valor "Hello, world!" y luego se imprime.

### Constante()

```kotlin
fun Constante() {
    val ConstantVar = 3.14
    println(ConstantVar)
}
```

Declara y utiliza una constante (`val`). En este ejemplo, la constante `ConstantVar` se inicializa con el valor `3.14` y luego se imprime.

### Opcional()

```kotlin
fun Opcional() {
    var VarOptional: String? = "Carlos"
    print(VarOptional)
    VarOptional = null
    print(VarOptional)
}
```

Declara y utiliza una variable que puede ser nula (`String?`). Inicialmente, `VarOptional` se establece en "Carlos" y luego se imprime. Después, se asigna un valor nulo a `VarOptional` y se imprime nuevamente.

### nulos()

```kotlin
fun nulos() {
    // Declaración de una variable que puede ser nula
    var nombre: String? = "Juan"
    
    // Uso seguro del operador "?."
    println("El nombre tiene ${nombre?.length} caracteres")

    // Asignar un valor nulo a la variable
    nombre = null

    // Uso del operador "?:"
    println("El nombre tiene ${nombre?.length ?: "desconocido"} caracteres")

    // Uso del operador "!!" (esto lanzará una excepción si el valor es nulo)
    try {
        println("El nombre tiene ${nombre!!.length} caracteres")
    } catch (e: NullPointerException) {
        println("Error: el nombre es nulo")
    }
}
```

Esta función demuestra cómo manejar valores nulos en Kotlin:
- Utiliza el operador de llamada segura `?.` para acceder de manera segura a la longitud de la cadena.
- Utiliza el operador Elvis `?:` para proporcionar un valor por defecto cuando la variable es nula.
- Utiliza el operador de aserción no nula `!!` para lanzar una excepción si la variable es nula.

## Ejecución

Para ejecutar este código, simplemente copia y pega todo el código en tu entorno de desarrollo de Kotlin y ejecuta la función `main()`. Verás las salidas correspondientes en la consola.

fun main() {
	VariableNormal()
    Constante()
    Opcional()
    Nulos()
}

fun VariableNormal(){
    var NormalVar = "Hello, world!"
    println(NormalVar)
}
fun Constante(){
    val ConstantVar = 3.14
    println(ConstantVar) 
}
fun Opcional(){
    var VarOptional: String? = "Carlos "
    print(VarOptional)
    VarOptional = null
    print(VarOptional)
}
fun Nulos(){
    var nombre: String? = "Juan"

    println("El nombre tiene ${nombre?.length} caracteres")

    nombre = null

    println("El nombre tiene ${nombre?.length ?: "desconocido"} caracteres")

    try {
        println("El nombre tiene ${nombre!!.length} caracteres")
    } catch (e: NullPointerException) {
        println("Error: el nombre es nulo")
    }
}
package EJ_U3

fun pedir_dato(clave: String, mensaje: String, diccionario: MutableMap<String, String>) {
    print(mensaje)
    val dato = readLine()?.trim() ?: ""
    diccionario[clave] = dato
    println("\nInformación actualizada: $diccionario\n")
}

fun main() {
    val diccionario = mutableMapOf<String, String>()

    println("\n-- INTRODUCE TUS DATOS PERSONALES --")

    pedir_dato("nombre", "Introduce el nombre: ", diccionario)
    pedir_dato("edad", "Introduce la edad: ", diccionario)
    pedir_dato("sexo", "Introduce el sexo (M/F): ", diccionario)
    pedir_dato("telefono", "Introduce el teléfono: ", diccionario)
    pedir_dato("correo", "Introduce el correo electrónico: ", diccionario)

    println("\nGracias por introducir tus datos.")
}


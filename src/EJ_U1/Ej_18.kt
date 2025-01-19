package EJ_U1

fun main() {
    println("Introduce tu nombre completo (por ejemplo: 'Fran Letrán Gastón'): ")
    val nombre_completo = readLine()

    if (!nombre_completo.isNullOrEmpty()) {
        val nombre_mayusculas = nombre_completo.uppercase()
        val nombre_minusculas = nombre_completo.lowercase()
        val nombre_primeras = nombre_completo.split(" ").joinToString(" ") { it.capitalize() }

        println("Tu nombre en mayúsculas es así: $nombre_mayusculas")
        println("Tu nombre en minúsculas es así: $nombre_minusculas")
        println("Tu nombre con solo las primeras letras en mayúsculas es así: $nombre_primeras")
    } else {
        println("No has introducido un nombre válido.")
    }
}

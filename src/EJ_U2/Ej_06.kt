package EJ_U2

fun main() {

    var continuar = true
    while (continuar) {
        println("Introduce tu nombre: ")
        val nombre = readLine()!!.trim()

        if (nombre.isEmpty()) {
            println("El nombre no puede estar vacío. Intenta de nuevo.")
            continuar = true
        }

        println("Introduce tu sexo (M para mujer, H para hombre): ")
        val sexo = readLine()!!.trim().uppercase()

        if (sexo != "M" && sexo != "H") {
            println("Sexo no válido. Debes introducir M para mujer o H para hombre.")
            continuar = true
        }

        val primerCaracterNombre = nombre.firstOrNull()?.uppercase() ?: continue

        if (sexo == "M" && primerCaracterNombre < "M") {
            println("Te corresponde el grupo A.")
        } else if (sexo == "H" && primerCaracterNombre > "N") {
            println("Te corresponde el grupo A.")
        } else {
            println("Te corresponde el grupo B.")
        }

        continuar = false
    }
}


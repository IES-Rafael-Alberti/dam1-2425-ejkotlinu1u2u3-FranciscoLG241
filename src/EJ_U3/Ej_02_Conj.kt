package EJ_U3

fun obtener_alumnos(estado: String): Set<String> {
    val alumnos = mutableSetOf<String>()

    var continuar = true
    while (continuar) {
        print("Introduce el nombre de un alumno de $estado (o 'x' para terminar): ")
        val nombre = readLine()?.trim() ?: ""

        if (nombre.lowercase() == "x") {
            continuar = false
        }

        if (nombre.isNotEmpty()) {
            alumnos.add(nombre)
        }
    }

    return alumnos
}

fun mostrar_resultados(primaria: Set<String>, secundaria: Set<String>) {
    val todosLosAlumnos = primaria.union(secundaria)
    println("\nTodos los alumnos (sin repeticiones):")
    println(todosLosAlumnos)

    val repetidos = primaria.intersect(secundaria)
    println("\nNombres que se repiten entre primaria y secundaria:")
    println(repetidos)

    val primariaNoRepetidos = primaria.subtract(secundaria)
    println("\nNombres de primaria que no se repiten en secundaria:")
    println(primariaNoRepetidos)

    val todosEnSecundaria = primaria.all { it in secundaria }
    if (todosEnSecundaria) {
        println("\nTodos los nombres de primaria están incluidos en secundaria.")
    } else {
        println("\nNo todos los nombres de primaria están incluidos en secundaria.")
    }
}

fun main() {
    println("Introduce los alumnos de primaria:")
    val primaria = obtener_alumnos("primaria")

    println("\nIntroduce los alumnos de secundaria:")
    val secundaria = obtener_alumnos("secundaria")

    mostrar_resultados(primaria, secundaria)
}

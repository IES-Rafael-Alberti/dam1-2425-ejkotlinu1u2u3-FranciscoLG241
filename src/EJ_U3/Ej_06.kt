package EJ_U3

fun main() {
    val asignaturas = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val asignaturasAprobadas = mutableListOf<String>()


    for (asignatura in asignaturas.toList()) {
        print("¿Qué nota has sacado en $asignatura? (Introduce un número): ")
        val nota = readLine()?.toDoubleOrNull()

        if (nota != null) {
            if (nota >= 5.0) {
                asignaturasAprobadas.add(asignatura)
            }
        } else {
            println("Por favor, introduce una nota válida.")
        }
    }


    asignaturas.removeAll(asignaturasAprobadas)


    println("\nAsignaturas que tienes que repetir:")
    if (asignaturas.isNotEmpty()) {
        println(asignaturas.joinToString(", "))
    } else {
        println("¡Felicidades, has aprobado todas las asignaturas!")
    }
}
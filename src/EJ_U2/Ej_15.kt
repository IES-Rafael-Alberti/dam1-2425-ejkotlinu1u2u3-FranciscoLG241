package EJ_U2

fun main() {
    var sumaPositivos = 0

    println("Ingresa números enteros (ingresa 0 para terminar):")
    var continuar = true
    while (continuar) {
        val numero = readLine()?.toIntOrNull()

        if (numero == null) {
            println("Por favor, ingresa un número válido.")
            continue
        }

        if (numero == 0) {
            continuar = false
        } else if (numero > 0) {
            sumaPositivos += numero
        }
    }

    println("La sumatoria de todos los números positivos ingresados es: $sumaPositivos")
}



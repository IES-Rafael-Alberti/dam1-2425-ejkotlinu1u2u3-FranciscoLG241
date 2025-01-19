package EJ_U1


fun main() {
    var continuar = true

    while (continuar) {
        println("Introduce una temperatura en Grados Celsius (por ejemplo: 32ºC):")
        val temperatura_celsius = readLine()

        if (temperatura_celsius != null && temperatura_celsius.endsWith("ºC")) {
            val numero = temperatura_celsius.dropLast(2).toIntOrNull()

            if (numero != null) {
                val temperatura_fahrenheit = (numero * 9 / 5) + 32
                println("La temperatura que has introducido en Fahrenheit es de: $temperatura_fahrenheit ºF")
                continuar = false
            } else {
                println("El valor numérico no es válido. Intenta de nuevo.")
            }
        } else {
            println("No has introducido el número como te he indicado. Inténtalo de nuevo.")
            println("Formato incorrecto. Asegúrate de incluir 'ºC' al final, por ejemplo: 32ºC.")
        }
    }
}


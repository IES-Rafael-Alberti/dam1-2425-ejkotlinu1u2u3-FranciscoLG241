package EJ_U2

fun pedir_numero(mensaje: String): Double {
    var numero: Double
    while (true) {
        println(mensaje)
        val entrada = readLine()
        if (entrada != null && entrada.toDoubleOrNull() != null) {
            numero = entrada.toDouble()
            break
        } else {
            println("Error: Debes introducir un número válido.")
        }
    }
    return numero
}

fun main() {

    val numero1 = pedir_numero("Introduce el primer número (dividendo): ")

    val numero2 = pedir_numero("Introduce el segundo número (divisor): ")

    if (numero2 == 0.0) {
        println("Error: No se puede dividir por cero.")
    } else {
        val resultado = numero1 / numero2
        println("El resultado de la división es: $resultado")
    }
}


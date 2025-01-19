package EJ_U2

fun suma_digitos(numero: String): Int {
    var suma = 0
    for (digito in numero) {
        suma += digito.digitToInt()
    }
    return suma
}

fun main() {
    var cantidadPares = 0

    while (true) {
        println("Introduce un número entero positivo (-1 para terminar):")
        val numero = readLine()

        if (numero == "-1") {
            break
        }

        if (numero != null && numero.all { it.isDigit() }) {
            val resultado = suma_digitos(numero)
            println("La suma de los dígitos es: $resultado")

            if (numero.toInt() % 2 == 0) {
                cantidadPares++
            }
        } else {
            println("Por favor, introduce un número entero positivo válido.")
        }
    }

    println("Se ingresaron $cantidadPares números pares.")
}


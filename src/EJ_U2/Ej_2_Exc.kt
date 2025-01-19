package EJ_U2

fun main() {
    while (true) {
        try {
            print("Ingrese un número entero positivo: ")
            val numero = readLine()?.toIntOrNull()

            if (numero == null || numero <= 0) {
                println("Por favor, ingrese un número entero positivo.")
                continue
            }

            var resultado = ""

            for (i in 1..numero) {
                if (i % 2 != 0) {
                    resultado += "$i, "
                }
            }

            if (resultado.isNotEmpty()) {
                resultado = resultado.dropLast(2)
            }

            println("Números impares desde 1 hasta $numero: $resultado")
            break

        } catch (e: NumberFormatException) {
            println("Entrada inválida. Por favor, ingrese un número entero positivo.")
        }
    }
}

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

            var cuenta_atrás = ""

            for (i in numero downTo 0) {
                cuenta_atrás += "$i, "
            }

            if (cuenta_atrás.isNotEmpty()) {
                cuenta_atrás = cuenta_atrás.dropLast(2)
            }

            println("Cuenta atrás desde $numero hasta 0: $cuenta_atrás")
            break

        } catch (e: NumberFormatException) {
            println("Entrada inválida. Por favor, ingrese un número entero positivo.")
        }
    }
}

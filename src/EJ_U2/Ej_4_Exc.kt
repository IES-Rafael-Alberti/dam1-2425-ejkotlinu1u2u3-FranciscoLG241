package EJ_U2

fun main() {
    try {
        print("Ingrese un número entero: ")
        val numero = readLine()?.toIntOrNull()

        if (numero == null) {
            throw NumberFormatException("La entrada no es correcta.")
        }

        println("Has ingresado el número: $numero")

    } catch (e: NumberFormatException) {
        println("La entrada no es correcta.")
        throw e
    }
}

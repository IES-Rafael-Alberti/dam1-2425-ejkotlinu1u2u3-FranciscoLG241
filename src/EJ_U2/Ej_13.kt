package EJ_U2

fun main() {
    println("Escribe algo (escribe 'salir' para terminar):")
    var continuar = true
    while (continuar) {
        val entrada = readLine()?.lowercase()

        if (entrada == "salir") {
            println("Programa terminado.")
            continuar = false
        } else {
            println("Eco: $entrada")
        }
    }
}

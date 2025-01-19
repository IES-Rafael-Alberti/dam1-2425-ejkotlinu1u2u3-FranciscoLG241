package EJ_U2

fun main() {
    var continuar = true
    while (continuar) {
        println("Introduce tu puntuación (Solo puede ser de '0.0', '0.4', '0.6' o superior): ")
        try {
            val puntuacion = readLine()!!.toDouble()

            when {
                puntuacion == 0.0 -> {
                    println("Debido a tu puntuación, consideramos que tu nivel es inaceptable")
                    continuar = false
                }
                puntuacion == 0.4 -> {
                    println("Debido a tu puntuación, consideramos que tu nivel es aceptable")
                    continuar = false
                }
                puntuacion >= 0.6 -> {
                    println("¡ENHORABUENA!, debido a tus grandes esfuerzos has conseguido un nivel meritorio")
                    continuar = false
                }
                else -> {
                    println("Debes introducir uno de los valores permitidos")
                }
            }
        } catch (e: NumberFormatException) {
            println("Error: Debes introducir un número válido.")
        }
    }
}




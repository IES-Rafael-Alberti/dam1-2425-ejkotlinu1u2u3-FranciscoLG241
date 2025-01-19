package EJ_U1

fun pedir_frase(): String {
    while (true) {
        println("Introduce una frase (debe tener más de una palabra): ")
        val frase = readLine()!!
        if (frase.trim().split(" ").size > 1) {
            return frase
        } else {
            println("La entrada no es válida. Debe contener más de una palabra. Inténtalo de nuevo.")
        }
    }
}

fun pedir_letra(): String {
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    while (true) {
        println("Ahora introduce una vocal: ")
        val vocal = readLine()!!
        if (vocal.length == 1 && vocal[0] in vocales) {
            return vocal
        } else {
            println("Lo que has introducido no es una vocal válida. Inténtalo de nuevo.")
        }
    }
}

fun main() {

    val frase = pedir_frase()
    val vocal = pedir_letra()

    val vocalMayuscula = vocal[0].uppercaseChar()
    val fraseModificada = frase.replace(vocal[0], vocalMayuscula)
    println("Frase modificada: $fraseModificada")
}


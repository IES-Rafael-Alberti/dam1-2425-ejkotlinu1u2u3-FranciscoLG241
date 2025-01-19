package EJ_U3

fun main() {

    val diccionario = mutableMapOf<String, String>()

    println("Introduce las traducciones en el formato palabra:traducción (separadas por dos puntos, por ejemplo: casa:house, perro:dog):")
    val input = readLine() ?: ""

    val pares = input.split(",")
    for (par in pares) {
        val partes = par.split(":")
        if (partes.size == 2) {
            diccionario[partes[0].trim()] = partes[1].trim()
        }
    }


    println("Introduce una frase en español para traducir:")
    val frase = readLine() ?: ""


    val palabras = frase.split(" ")
    val traduccion = palabras.joinToString(" ") { palabra ->
        diccionario[palabra] ?: palabra
    }

    println("Traducción: $traduccion")
}


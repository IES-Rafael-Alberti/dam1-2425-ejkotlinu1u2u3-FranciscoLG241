package EJ_U3


fun comprobarVocal(palabra: String) {

    var contadorA = 0
    var contadorE = 0
    var contadorI = 0
    var contadorO = 0
    var contadorU = 0


    for (letra in palabra) {
        when (letra) {
            'a' -> contadorA++
            'e' -> contadorE++
            'i' -> contadorI++
            'o' -> contadorO++
            'u' -> contadorU++
        }
    }


    println("Hay de esta vocal 'a' esta cantidad de veces: $contadorA")

    println("Hay de esta vocal 'e' esta cantidad de veces: $contadorE")

    println("Hay de esta vocal 'i' esta cantidad de veces: $contadorI")

    println("Hay de esta vocal 'o' esta cantidad de veces: $contadorO")

    println("Hay de esta vocal 'u' esta cantidad de veces: $contadorU")
}

fun main() {
    print("Introduce una palabra para saber el número de vocales que tiene de cada una: ")
    val palabra = readLine()?.trim()?.toLowerCase() ?: ""

    comprobarVocal(palabra)
}


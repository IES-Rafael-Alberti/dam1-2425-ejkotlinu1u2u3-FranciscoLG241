package EJ_U2

fun main() {
    print("Ingrese una frase: ")
    val frase = readLine() ?: ""

    val palabras = frase.split(" ")

    if (palabras.isEmpty()) {
        println("No se ingresaron palabras.")
        return
    }

    var palabra_mas_larga = ""

    for (palabra in palabras) {
        if (palabra.length > palabra_mas_larga.length) {
            palabra_mas_larga = palabra
        }
    }

    val cantidad_palabras = palabras.size

    println("La cantidad de palabras en la frase es: $cantidad_palabras")
    println("La palabra más larga es: '$palabra_mas_larga'")
}

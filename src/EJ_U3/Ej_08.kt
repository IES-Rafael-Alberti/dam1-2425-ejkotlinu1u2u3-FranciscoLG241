package EJ_U3

fun main() {
    print("Introduce una palabra: ")
    val palabra = readLine()?.trim() ?: ""

    if (palabra == palabra.reversed()) {
        println("La palabra '$palabra' es un palíndromo.")
    } else {
        println("La palabra '$palabra' no es un palíndromo.")
    }
}

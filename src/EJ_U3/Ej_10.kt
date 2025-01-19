package EJ_U3

fun mostrarNumero() {
    val precios = arrayListOf(50, 75, 46, 22, 80, 65, 8)

    precios.sort()
    println("El número menor de la lista será: ${precios[0]}")
    println("El número mayor de la lista será: ${precios[precios.size - 1]}")
}

fun main() {
    println("\n ---AHORA PODREMOS VER LOS NÚMEROS---")
    mostrarNumero()
}

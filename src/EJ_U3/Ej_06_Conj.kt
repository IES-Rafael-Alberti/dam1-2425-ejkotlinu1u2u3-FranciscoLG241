package EJ_U3

fun main() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    val alfabeto = ('a'..'z').toSet()

    val consonantes = alfabeto - vocales
    println("Consonantes: $consonantes")

    val letras_comunes = vocales.intersect(consonantes)
    println("Letras comunes entre vocales y consonantes: $letras_comunes")
}

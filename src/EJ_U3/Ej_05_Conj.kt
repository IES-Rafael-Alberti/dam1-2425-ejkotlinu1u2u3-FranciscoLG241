package EJ_U3

fun main() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }.toSet()
    println("Números pares: $pares")

    val triples = numeros.filter { it % 3 == 0 }.toSet()
    println("Múltiplos de tres: $triples")

    val pares_triples = pares.intersect(triples)
    println("Intersección de pares y múltiplos de tres: $pares_triples")
}

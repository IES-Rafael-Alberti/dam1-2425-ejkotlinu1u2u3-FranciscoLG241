package EJ_U3

fun conjunto_potencia(s: Set<String>): Set<Set<String>> {
    val potencia = mutableSetOf<Set<String>>()
    potencia.add(emptySet())

    for (elemento in s) {
        val nuevosSubconjuntos = mutableSetOf<Set<String>>()
        for (subconjunto in potencia) {
            nuevosSubconjuntos.add(subconjunto + elemento)
        }
        potencia.addAll(nuevosSubconjuntos)
    }

    return potencia
}

fun main() {
    println("--- CÁLCULO DEL CONJUNTO POTENCIA ---")
    print("Introduce los elementos del conjunto separados por comas: ")
    val entrada = readLine()?.split(",")?.map { it.trim() }?.toSet() ?: emptySet()

    println("\nConjunto original: $entrada")
    val resultado = conjunto_potencia(entrada)

    println("\nConjunto potencia:")
    for (subconjunto in resultado) {
        println(subconjunto)
    }
}

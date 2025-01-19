package EJ_U3

fun main() {
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")


    val set_frutas1 = frutas1.toSet()
    val set_frutas2 = frutas2.toSet()


    val frutas_comunes = set_frutas1.intersect(set_frutas2)
    println("Frutas comunes entre set_frutas1 y set_frutas2: $frutas_comunes")


    val frutas_solo_en_frutas1 = set_frutas1.subtract(set_frutas2)
    println("Frutas que están en frutas1 pero no en frutas2: $frutas_solo_en_frutas1")


    val frutas_solo_en_frutas2 = set_frutas2.subtract(set_frutas1)
    println("Frutas que están en frutas2 pero no en frutas1: $frutas_solo_en_frutas2")
}

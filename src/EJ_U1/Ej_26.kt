package EJ_U1


fun main() {
    println("Introduce los productos de la cesta de la compra, separados por comas (por ejemplo: manzanas, pan, leche):")
    val productos = readLine()!!

    val lista_de_productos = productos.split(",").map { it.trim() }

    println("Los productos en tu cesta son:")
    for (producto in lista_de_productos) {
        println(producto)
    }
}

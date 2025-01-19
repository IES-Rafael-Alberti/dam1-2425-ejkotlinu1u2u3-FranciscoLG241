package EJ_U3

fun main() {

    val cesta = mutableMapOf<String, Double>()

    println("Introduce los artículos y sus precios para añadir a la cesta.")
    println("** Presiona 'ENTER' sin escribir nada para finalizar. **")

    var continuar = true
    while (continuar) {
        print("Introduce el nombre del artículo: ")
        val articulo = readLine()?.trim() ?: ""

        if (articulo.isEmpty()) {
            continuar = false
        }

        print("Introduce el precio del artículo '$articulo': ")
        val precio = readLine()?.toDoubleOrNull()

        if (precio == null || precio < 0) {
            println("Por favor, introduce un precio válido.")
            continue
        }

        cesta[articulo] = precio
    }


    println("\n--- Cesta de la compra ---")
    println("Artículo\tPrecio")

    var total = 0.0
    for ((articulo, precio) in cesta) {
        println("$articulo\t\t${precio}€")
        total += precio
    }

    println("\nTotal\t\t${total}€")
}




package EJ_U1

fun main() {
    println("Introduce el nombre del producto: ")
    val nombre_producto = readLine()!!

    println("Introduce el precio unitario del producto (con dos decimales): ")
    val precio_unitario = readLine()!!.toDouble()

    println("Introduce el número de unidades: ")
    val unidades = readLine()!!.toInt()

    val coste_total = precio_unitario * unidades

    println("Producto: $nombre_producto")
    println("Precio unitario: ${"%,6.2f".format(precio_unitario)} €")
    println("Número de unidades: ${"%03d".format(unidades)}")
    println("Coste total: ${"%,8.2f".format(coste_total)} €")
}

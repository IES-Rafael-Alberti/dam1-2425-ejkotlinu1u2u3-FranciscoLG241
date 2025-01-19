package EJ_U1

fun main() {

    var continuar = true
    while (continuar) {
        println("Introduce el precio del producto en euros (con dos decimales, por ejemplo, 12.34): ")
        val precio = readLine()!!

        if (!precio.matches(Regex("\\d+\\.\\d{2}"))) {
            println("El precio introducido no tiene un formato válido. Debe tener dos decimales (por ejemplo, 12.34).")
            continuar = true

        } else {
            val partes = precio.split(".")
            val euros = partes[0].toInt()
            val centimos = partes[1].toInt()

            println("El precio del producto es:")
            println("Euros: $euros")
            println("Céntimos: $centimos")
            continuar = false
        }
    }
}



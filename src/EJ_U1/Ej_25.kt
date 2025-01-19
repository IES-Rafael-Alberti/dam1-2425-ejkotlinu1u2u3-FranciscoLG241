package EJ_U1

fun main() {

    var continuar = true
    while (continuar) {
        println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa (ejemplo: 1/1/2000 o 01/01/2000):")
        val fecha = readLine()!!

        if (fecha.matches(Regex("\\d{1,2}/\\d{1,2}/\\d{4}"))) {
            val partes = fecha.split("/")
            val dia = partes[0].toInt()
            val mes = partes[1].toInt()
            val anio = partes[2].toInt()

            println("Fecha de nacimiento:")
            println("Día: $dia")
            println("Mes: $mes")
            println("Año: $anio")
            continuar = false

        } else {
            println("La fecha introducida no tiene un formato válido. Usa el formato dd/mm/aaaa.")
            continuar = true
        }
    }
}


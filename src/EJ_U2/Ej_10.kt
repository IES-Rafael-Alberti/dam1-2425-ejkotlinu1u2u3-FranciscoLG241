package EJ_U2

fun main() {

        println("--Bienvenido a la Pizzería Bella Napoli--")
        println("¿Desea una pizza vegetariana? (Escriba 'sí' o 'no'):")
        val tipoPizza = readLine()?.lowercase()

        val base_pizza = listOf("mozzarella", "tomate")
        val ingredientes_vegetarianos = listOf("pimiento", "tofu")
        val ingredientes_no_vegetarianos = listOf("peperoni", "jamón", "salmón")

        if (tipoPizza == "sí") {
            println("Ha elegido una pizza vegetariana.")
            println("Ingredientes disponibles:")
            ingredientes_vegetarianos.forEachIndexed { index, ingrediente ->
                println("${index + 1}. $ingrediente")
            }

            println("Elija un ingrediente (introduzca el número correspondiente):")
            val opcion = readLine()?.toIntOrNull()

            if (opcion in 1..ingredientes_vegetarianos.size) {
                val ingredienteElegido = ingredientes_vegetarianos[opcion!! - 1]
                val ingredientesFinales = base_pizza + ingredienteElegido
                println("Su pizza es vegetariana y lleva: ${ingredientesFinales.joinToString(", ")}.")
            } else {
                println("Opción inválida.")
            }

        } else if (tipoPizza == "no") {
            println("Ha elegido una pizza no vegetariana.")
            println("Ingredientes disponibles:")
            ingredientes_no_vegetarianos.forEachIndexed { index, ingrediente ->
                println("${index + 1}. $ingrediente")
            }

            println("Elija un ingrediente (introduzca el número correspondiente):")
            val opcion = readLine()?.toIntOrNull()

            if (opcion in 1..ingredientes_no_vegetarianos.size) {
                val ingredienteElegido = ingredientes_no_vegetarianos[opcion!! - 1]
                val ingredientesFinales = base_pizza + ingredienteElegido
                println("Su pizza no es vegetariana y lleva: ${ingredientesFinales.joinToString(", ")}.")
            } else {
                println("Opción inválida.")
            }

        } else {
            println("Debe elegir 'sí' o 'no'.")
        }
    }







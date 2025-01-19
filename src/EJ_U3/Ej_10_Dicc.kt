package EJ_U3

fun mostrarMenu() {
    println("\n---BIENVENIDO A LA EMPRESA---")
    println("1.- Añadir cliente")
    println("2.- Eliminar cliente")
    println("3.- Mostrar cliente")
    println("4.- Listar todos los clientes")
    println("5.- Listar clientes preferentes")
    println("6.- Terminar")
}

fun opcionUno() {
    println("Introduce el NIF del cliente: ")
    val nif = readLine() ?: ""
    println("Introduce el nombre del cliente: ")
    val nombre = readLine() ?: ""
    println("Introduce la dirección del cliente: ")
    val direccion = readLine() ?: ""
    println("Introduce el número de teléfono del cliente: ")
    val telefono = readLine() ?: ""
    println("Introduce el correo del cliente: ")
    val correo = readLine() ?: ""
    println("¿Es cliente preferente? (si/no): ")
    val preferente = (readLine() ?: "").toLowerCase() == "si"

    clientes[nif] = Cliente(nombre, direccion, telefono, correo, preferente)
    println("Cliente $nombre añadido exitosamente.")
    esperarContinuar()
}

fun opcionDos() {
    println("Introduce el NIF del cliente a eliminar: ")
    val nif = readLine() ?: ""

    if (clientes.containsKey(nif)) {
        clientes.remove(nif)
        println("Cliente con NIF $nif eliminado.")
    } else {
        println("No se ha encontrado un cliente con ese NIF.")
    }
    esperarContinuar()
}

fun opcionTres() {
    println("Introduce el NIF del cliente a mostrar: ")
    val nif = readLine() ?: ""

    if (clientes.containsKey(nif)) {
        val cliente = clientes[nif]!!
        println("\nDatos del cliente con NIF: '$nif':")
        println("Nombre: ${cliente.nombre}")
        println("Dirección: ${cliente.direccion}")
        println("Teléfono: ${cliente.telefono}")
        println("Correo: ${cliente.correo}")
        println("Preferente: ${if (cliente.preferente) "Sí" else "No"}")
    } else {
        println("No se ha encontrado un cliente con ese NIF.")
    }
    esperarContinuar()
}

fun opcionCuatro() {
    if (clientes.isNotEmpty()) {
        println("\nLista de todos los clientes: ")
        for ((nif, cliente) in clientes) {
            println("NIF: $nif, Nombre: ${cliente.nombre}")
        }
    } else {
        println("No hay clientes registrados.")
    }
    esperarContinuar()
}

fun opcionCinco() {
    val preferentes = clientes.values.filter { it.preferente }

    if (preferentes.isNotEmpty()) {
        println("\nLista de clientes preferentes: ")
        for (cliente in preferentes) {
            println("NIF: ${cliente.nombre}, Nombre: ${cliente.nombre}")
        }
    } else {
        println("No hay clientes preferentes registrados.")
    }
    esperarContinuar()
}



fun esperarContinuar() {
    println("\nPresiona Enter para continuar...")
    readLine()
}

data class Cliente(val nombre: String, val direccion: String, val telefono: String, val correo: String, val preferente: Boolean)

val clientes = mutableMapOf<String, Cliente>()

fun main() {
    var continuar = true

    while (continuar) {
        mostrarMenu()
        println("Seleccione una de las opciones disponibles: ")
        val opcion = readLine()?.toIntOrNull() ?: -1

        when (opcion) {
            1 -> opcionUno()
            2 -> opcionDos()
            3 -> opcionTres()
            4 -> opcionCuatro()
            5 -> opcionCinco()
            6 -> {
                println("\n--- Programa terminado ---")
                continuar = false
            }
            else -> println("Opción no válida. Por favor, elige una opción válida.")
        }
    }
}



package EJ_U2

fun mostrar_menu() {
    println("\nMenu")
    println("1.- Comenzar programa")
    println("2.- Imprimir listado")
    println("3.- Finalizar programa")
}

fun main() {
    while (true) {
        mostrar_menu()

        print("Seleccione una de las opciones (1, 2, 3): ")
        val seleccion = readLine()

        when (seleccion) {
            "1" -> println("Has comenzado el programa.")
            "2" -> println("Imprimiendo listado...")
            "3" -> {
                println("Finalizando el programa. ¡Adiós!")
                break
            }
            else -> println("Opción incorrecta. Por favor, elige 1, 2 o 3.")
        }
    }
}

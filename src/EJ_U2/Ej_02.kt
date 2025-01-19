package EJ_U2

fun main() {

    var continuar = true
    while (continuar) {
        val contraseña_guardada = "contraseña"

        println("Introduzca la contraseña: ")
        val contraseña_introducida = readLine()!!

        if (contraseña_guardada.equals(contraseña_introducida, ignoreCase = true)) {
            println("Has introducido la contraseña correctamente")
            continuar = false
        } else {
            println("**ERROR**, la contraseña no es la correcta")
            continuar = true

        }
    }
}
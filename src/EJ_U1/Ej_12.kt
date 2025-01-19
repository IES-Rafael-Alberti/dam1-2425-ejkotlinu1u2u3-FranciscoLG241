package EJ_U1

import kotlin.math.pow

fun main(){

    var continuar = true
    while (continuar){
        println("Introduce tu peso en kilogramos ('kg'): ")
        var peso = readLine()?.toDoubleOrNull()

        if (peso == null || peso <= 0){
            println("**ERROR**, el peso no puede ser un valor nulo ni menor o igual que 0")
            continuar = true

        }else if (peso != null || peso > 0){
            println("Ahora introduzca su altura en metros ('m'): ")
            var altura = readLine()?.toDoubleOrNull()

            if (altura == null || altura <= 0){
                println("**ERROR**, la altura no puede ser un valor nulo ni menor o igual que 0")
                continuar = true
            }else if (altura != null || altura > 0){
                val indice_masa = peso / altura.pow(2)
                println("Tu indice de masa corporal es de: $indice_masa")
                continuar = false
            }


        }
    }
}

class Tiempo(var hora: Int = 0, var minuto: Int = 0, var segundo: Int = 0) {
    override fun toString(): String {
        return "${hora}h, ${minuto}m y ${segundo}s"
    }
}

fun main() {

    var hora: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0
    var continuar: Boolean = true

    var tiempo1 = Tiempo(hora,minutos,segundos)


    println("Introduce hora, minutos y segundos. (Si no quieres introducir minutos o segundos puedes presionar enter)")

    print("Hora: ")
    hora = readLine()?.toInt()!!

    print("Minutos: ")

    try {
        minutos = readLine()?.toInt()!!
    }
    catch (e: java.lang.NumberFormatException) {
        tiempo1 = Tiempo(hora)
        println(tiempo1)
        continuar = false
    }

    if (continuar==true){
        print("Segundos: ")
        try {
            segundos = readLine()?.toInt()!!
        }
        catch (e: java.lang.NumberFormatException) {
            tiempo1 = Tiempo(hora,minutos)
            println(tiempo1)
            continuar = false
        }

    }

    if(continuar==true){
        tiempo1 = Tiempo(hora,minutos,segundos)
        println(tiempo1)
    }


}
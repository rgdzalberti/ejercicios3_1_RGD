class Tiempo(var hora: Int = 0, var minuto: Int = 0, var segundo: Int = 0) {
    override fun toString(): String {
        return "${hora}h, ${minuto}m y ${segundo}s"
    }
}

fun main() {

    var hora: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0


    println("Introduce hora, minutos y segundos. (Puedes introducir solo hora y minutos o hora)")


    var tiempo1 = Tiempo(readLine()!!.toInt(),{} readLine()!!.toInt(), readLine()!!.toInt())

    println(tiempo1)


}

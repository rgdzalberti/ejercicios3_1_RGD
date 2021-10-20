var x: String = ""
var y: Int = 0
var encendido : Boolean = false




fun inputString(): String{

    try {
        x = readLine().toString()
    } catch (e: java.lang.NullPointerException) {
        println("Por favor, introduce un input válido")
    }

    return x
}

fun inputInt(): Int{

    try {
        y = readLine()?.toInt()!!
    } catch (e: java.lang.NumberFormatException) {
        println("Por favor, introduce un input válido")
    }

    return y
}


class coche(var Marca: String, var Modelo: String, var Color: String, var velocidadMax: Int) {


    init
    {   require(velocidadMax in 10..250) { "Velocidad invalida." }
    }

    fun encender(){

        if(encendido==false){
            encendido = true
            println("Se ha encendido el motor")
        }
        else{
            println("El motor ya está encendido")
        }

    }

    fun apagar(){
        if (encendido == false){
            println("El motor ya está apagado")
        }
        else{
            encendido = false
            println("El motor se ha apagado")
        }
    }

}


fun main() {

    var marca: String = ""
    var modelo: String = ""
    var color: String = ""
    var velocidadmax: Int = 0

    println("Introduce los siguientes datos: ")

    print("¿Cual es la marca del coche?: ")
    marca = inputString()
    print("¿Cual el modelo del coche?: ")
    modelo = inputString()
    print("¿Cual es el color del coche?: ")
    color = inputString()
    print("¿Cual es la velocidad máxima?: ")
    velocidadmax = inputInt()

    println("$marca, $modelo, $color, $velocidadmax")


    var datosCoche = coche(marca, modelo, color, velocidadmax)

}
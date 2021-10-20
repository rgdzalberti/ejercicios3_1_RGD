//Ejercicio por Ricardo Gallego Domínguez



class Rectangulo(var Base: Int, var Altura: Int) {

    fun calcularArea() = Base * Altura

    fun calcularPerimetro() = Base * 2 + Altura * 2

}


fun main() {

    var rectangulo1 = Rectangulo(100,50)
    var rectangulo2 = Rectangulo(75,20)
    var rectangulo3 = Rectangulo(200,120)


    println("El área del primer rectangulo es ${rectangulo1.calcularArea()}")
    println("El área del segundo rectangulo es ${rectangulo2.calcularArea()}")
    println("El área del tercer rectangulo es ${rectangulo3.calcularArea()}")
    println("El perimetro del primer rectangulo es ${rectangulo1.calcularPerimetro()}")
    println("El perimetro del segundo rectangulo es ${rectangulo2.calcularPerimetro()}")
    println("El perimetro del tercer rectangulo es ${rectangulo3.calcularPerimetro()}")
}
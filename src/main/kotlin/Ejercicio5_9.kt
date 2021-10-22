import java.util.Vector
var consultaSaldo: Double = 0.0
var x: Double = 0.0

class Cuenta(var numeroCuenta: Int,var saldoDisponible: Double = 0.0){

    fun consultarSaldo(){
        print("El saldo actual es $saldoDisponible")
    }
    fun recibirAbono(cantidad: Double, from: Int = 0){
        saldoDisponible = saldoDisponible + cantidad

    }
    fun realizarPago(cantidad: Double, to: Int = 0, from: Int = 0){
        saldoDisponible = saldoDisponible - cantidad


        if (from==numeroCuenta && to==48459270){
            x = cantidad
        }
        if(from==48459270 && to==numeroCuenta){
            x = cantidad
        }
    }
    fun cargarClass(){
        consultaSaldo = saldoDisponible
    }

}

class Persona(var DNI: String, var vector: Vector<String> = Vector<String>()) {


    fun añadirCuentas() {

        var contadorVector: Int = 0
        var numeroCuenta = 0
        var bucle = 1

        println("Por favor, introduce número de cuenta")
        numeroCuenta = readLine()?.toInt()!!

        while (bucle == 1) {
            //Si tuviese que manejar una base de datos grande en este if meteria un array con todos los números de cuentas, pero como son solo dos
            //lo he hecho de esta manera simple.
            //Se puede añadir varias veces el mismo número de cuenta para que no haya que crear varios objetos (Está hecho a posta)
            if (numeroCuenta == 13933779 || numeroCuenta == 48459270) {
                bucle = 0
            } else {
                println("Ese número de cuenta no es correcto, por favor añade uno correcto")
                numeroCuenta = readLine()?.toInt()!!
            }
        }
        if (contadorVector != 3) {
            vector.addElement(numeroCuenta.toString())
            println("Cuenta añadida")
            println("Cuentas = " + vector)
            contadorVector++
        } else {
            println("El vector ha alcanzado su máximo límite")
        }

        println("¿Añadir más cuentas? Si = 1, No = 0")

        var comprobador = readLine()?.toInt()
        while (comprobador != 0) {
            when (comprobador) {
                0 -> {
                    comprobador = 0
                }
                1 -> {

                    bucle = 1
                    println("Por favor, introduce un número de cuenta")
                    numeroCuenta = readLine()?.toInt()!!

                    while (bucle == 1) {
                        if (numeroCuenta == 13933779 || numeroCuenta == 48459270) {
                            bucle = 0
                        } else {
                            println("Ese número de cuenta no es correcto, por favor añade uno correcto")
                            numeroCuenta = readLine()?.toInt()!!
                        }
                    }


                    if (contadorVector != 3) {
                        vector.addElement(numeroCuenta.toString())
                        println("Cuenta añadida")
                        println("Cuentas = " + vector)
                        contadorVector++

                        println("¿Añadir más cuentas? Si = 1, No = 0")
                        comprobador = readLine()?.toInt()
                    } else {
                        println("El vector ha alcanzado su máximo límite")
                        comprobador = 0
                    }

                }
            }
        }
    }

    fun moroso(cuenta1: Cuenta,cuenta2: Cuenta) {

        var numCuenta1: Int = vector.get(0).toInt()
        var numCuenta2: Int = vector.get(1).toInt()
        var numCuenta3: Int = 0

        try {
            var numCuenta3: Int = vector.get(2).toInt()
        }
        catch (e:java.lang.ArrayIndexOutOfBoundsException ){
            //Si llega aqui significa que no hay un valor 3 en el array y por lo tanto no es necesario comparar este valor

        }



        cuenta1.cargarClass()
        var saldo1: Double = consultaSaldo
        cuenta2.cargarClass()
        var saldo2: Double = consultaSaldo

        if (cuenta1.numeroCuenta == numCuenta1 || cuenta1.numeroCuenta == numCuenta2 || cuenta1.numeroCuenta == numCuenta3 )
        {
           if (saldo1<0.0){
               println("Morosidad detectada")
            }
        }

        if (cuenta2.numeroCuenta == numCuenta2 || cuenta1.numeroCuenta == numCuenta1 || cuenta1.numeroCuenta == numCuenta3)
        {
            if (saldo2<0.0){
                println("Morosidad detectada")
            }
        }


    }
}


    fun main(args: Array<String>) {

        var persona = Persona("69698176B")

        var cuenta1 = Cuenta(13933779, 0.00)
        var cuenta2 = Cuenta(48459270, 700.00)

        //Si se va a usar la función persona.añadirCuentas() se tiene que usar uno de los números  de arriba para que el programa continue
        //Los números son 13933779 y 48459270

        persona.añadirCuentas()
        cuenta1.recibirAbono(1100.0)
        cuenta2.realizarPago(750.0)
        //Si la persona no es morosa no hay ningún output
        println("")
        persona.moroso(cuenta1,cuenta2)
        println("")
        cuenta1.realizarPago(100.0,48459270,13933779)
        cuenta1.consultarSaldo()
        println("")
        cuenta2.recibirAbono(x)
        cuenta2.consultarSaldo()


    }

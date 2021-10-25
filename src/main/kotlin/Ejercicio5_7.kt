
class Coche(var color: String, var marca: String, modelo: String,var caballos: Int,var puertas: Int,var matricula: String, ){
    var modelo : String = modelo.uppercase()
    set(value){
        field = value.uppercase()
    }

    override fun toString(): String {
        return "Coche $marca $modelo de color $color y $puertas puertas tiene $caballos caballos y $matricula de matricula"
    }
}

fun main(){

    var coche1 = Coche("Rojo", "Opel","Corsa",100,4,"2010KFC")
    var coche2 = Coche("Negro", "Citroen","HQ",150,4,"2012MAC")
    var coche3 = Coche("Blanco", "Ferrari","R8",170,2,"2014BUR")

    println(coche1)
    println(coche2)
    println(coche3)
    
    coche1.color = "Verde"
    coche2.color = "Azul Bogabante"
    coche3.color = "Naranja mandarina"

    println("")
    println("Cambios fueron realizados")
    println("")

    println(coche1)
    println(coche2)
    println(coche3)
}


/*
Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, 
el número de caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como los 
métodos estándar: ¿getters, setters? y toString.
En el programa principal, instancia varios coches, muestra su información, cambia el color a 
algunos de ellos y vuelve a mostrarlos por pantalla.

 */
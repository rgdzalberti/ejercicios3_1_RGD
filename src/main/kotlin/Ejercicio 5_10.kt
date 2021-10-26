var arrayTitulo: Array<String?> = arrayOfNulls(9)
var arrayAutor: Array<String?> = arrayOfNulls(9)
var arrayNumpag: IntArray = IntArray(9)
var arrayCalificacion: IntArray = IntArray(9)


var z : Int = 0
var y: Int = 0
var checkArray: Int = 0

fun findIndex(arr: IntArray, item: Int): Int {
    return arr.indexOf(item)
}

class Libro(var titulo: String, var autor: String, var numeroPaginas: Int, var calificacion: Int){
    fun modificarTitulo(){

        println("")
        println("¿De que libro quieres cambiar el título? (Introduce el número identificador a la izquierda del título)")

        var continuar: Boolean = true
        var x: Int = 0
        var identificador: Int = 0

        println("")

        while (continuar==true){

            while (x!=9){
                print(x)
                print(" ")
                print(arrayTitulo[x] + ", escrito por ")
                print(arrayAutor[x] + " con ")
                print(arrayNumpag[x])
                print(" páginas y de nota ")
                print(arrayCalificacion[x])
                x++
                println("")

            }

            identificador = readLine()?.toInt()!!
            println("Introduce el nuevo autor")
            arrayTitulo[identificador] = readLine().toString()
            continuar=false

        }

    }
    fun modificarAutor(){
        println("")
        println("¿De que libro quieres cambiar el autor? (Introduce el número identificador a la izquierda del título)")

        var continuar: Boolean = true
        var x: Int = 0
        var identificador: Int = 0

        println("")

        while (continuar==true){

            while (x!=9){
                print(x)
                print(" ")
                print(arrayTitulo[x] + ", escrito por ")
                print(arrayAutor[x] + " con ")
                print(arrayNumpag[x])
                print(" páginas y de nota ")
                print(arrayCalificacion[x])
                x++
                println("")

            }

            identificador = readLine()?.toInt()!!
            println("Introduce el nuevo autor")
            arrayAutor[identificador] = readLine().toString()
            continuar=false

        }
    }
    fun modificarNumeroPaginas(){
        println("")
        println("¿De que libro quieres cambiar el número de páginas? (Introduce el número identificador a la izquierda del título)")

        var continuar: Boolean = true
        var x: Int = 0
        var identificador: Int = 0

        println("")

        while (continuar==true){

            while (x!=9){
                print(x)
                print(" ")
                print(arrayTitulo[x] + ", escrito por ")
                print(arrayAutor[x] + " con ")
                print(arrayNumpag[x])
                print(" páginas y de nota ")
                print(arrayCalificacion[x])
                x++
                println("")

            }

            identificador = readLine()?.toInt()!!
            println("Introduce el nuevo número de páginas")
            arrayNumpag[identificador] = readLine()?.toInt()!!
            continuar=false

        }
    }
    fun modificarCalificacion(){


        println("")
        println("¿De que libro quieres cambiar el la calificación? (Introduce el número identificador a la izquierda del título)")

        var continuar: Boolean = true
        var continuar2: Boolean = true
        var x: Int = 0
        var identificador: Int = 0

        println("")

        while (continuar==true){

            while (x!=9){
                print(x)
                print(" ")
                print(arrayTitulo[x] + ", escrito por ")
                print(arrayAutor[x] + " con ")
                print(arrayNumpag[x])
                print(" páginas y de nota ")
                print(arrayCalificacion[x])
                x++
                println("")

            }

            identificador = readLine()?.toInt()!!
            println("Introduce la nueva calificación")
            while (continuar==true) {
                arrayCalificacion[identificador] = readLine()?.toInt()!!
                if (arrayCalificacion[identificador] in 0..10){
                    continuar2==false
                    continuar=false
                }
                else{
                    println("Parámetro incorrecto. Solo puedes introducir un número entre 0 y 10")
                }
            }

        }

    }
}

class ConjuntoLibros() {

    fun añadirLibro(){

        var continuar: Boolean = true
        var continuar2: Boolean = true
        var calificacion: Int = 0



        while (continuar==true){

            if (checkArray==9){
                continuar==false
                println("La lista de libros está llena")
            }

            else
            {
                print("Introduce el título del libro: ")
                var titulo = readLine().toString()
                print("Introduce el autor del libro: ")
                var autor = readLine().toString()
                print("Introduce el número de páginas con el que cuenta el libro: ")
                var numpag: Int = readLine()?.toInt()!!
                print("Introduce la calificación para el libro: ")

                while (continuar2==true) {
                    calificacion = readLine()?.toInt()!!
                    if (calificacion in 0..10){
                        continuar2=false
                        continuar=false
                    }
                    else{
                        println("Parámetro incorrecto. Solo puedes introducir un número entre 0 y 10")
                    }
                }

                arrayTitulo[z] = titulo
                arrayAutor[z] = autor
                arrayNumpag[z] = numpag
                arrayCalificacion[z] = calificacion
                    z++
                checkArray++



            }

        }

    }
    fun eliminarLibro(){

        println("")
        println("¿Que libro quieres eliminar? (Introduce el número identificador a la izquierda del título)")

        var continuar: Boolean = true
        var x: Int = 0
        var identificador: Int = 0

        println("")

        while (continuar==true) {

            while (x != 9) {
                print(x)
                print(" ")
                print(arrayTitulo[x] + ", escrito por ")
                print(arrayAutor[x] + " con ")
                print(arrayNumpag[x])
                print(" páginas y de nota ")
                print(arrayNumpag[x])
                x++
                println("")

            }

            identificador = readLine()?.toInt()!!
            arrayTitulo[identificador] = null
            arrayAutor[identificador] = null
            arrayNumpag[identificador] = 0
            arrayCalificacion[identificador] = 0
            println("Libro eliminado")
            continuar = false
        }
    }
    fun mayorCalificacion()
    {
        var arrayCalificacionCHECK: IntArray = arrayCalificacion

        var largest = 0
        var aaa = 0


        while (aaa != 9) {
            largest = 0
            for (num in arrayCalificacionCHECK) {
                if (largest < num)
                    largest = num
            }


            var posicion = findIndex(arrayCalificacionCHECK, largest)

            print(arrayTitulo[posicion])
            print(" con una nota de ")
            print(arrayCalificacionCHECK[posicion])
            println("")

            arrayCalificacionCHECK[posicion] = 0
            aaa++

        }

        }
    fun menorCalificacion()
    {
        var arrayCalificacionCHECK: IntArray = arrayCalificacion

        var shortest = 0
        var aaa = 0


        while (aaa != 9) {
            shortest = 0
            for (num in arrayCalificacionCHECK) {
                if (shortest > num)
                    shortest = num
            }


            var posicion = findIndex(arrayCalificacionCHECK, shortest)

            print(arrayTitulo[posicion])
            print(" con una nota de ")
            print(arrayCalificacionCHECK[posicion])
            println("")

            arrayCalificacionCHECK[posicion] = 0
            aaa++

        }
    }
    fun mostrarConjunto(){

        var continuar : Boolean = true

        while (continuar==true)
        {
            try {
            println("")
            print(arrayTitulo[y] + ", escrito por " + arrayAutor[y] + " con " + arrayNumpag[y] + (" páginas y una nota de ") + arrayCalificacion[y])
            y++
            }
            catch(e: java.lang.ArrayIndexOutOfBoundsException){
                continuar=false
            }

            if (y==9)
            {
                continuar = false
            }

        }

    }

}

fun main(){

    var libro1 = Libro("El Árbol de la ciencia","José Panema",324, 8)
    var libro2 = Libro("Mein Kampf","Hitler",501, 6)
    var conjuntolibros = ConjuntoLibros()

    //Crear dos libros (Los he hecho con inputs)
    conjuntolibros.añadirLibro()
    conjuntolibros.añadirLibro()

    conjuntolibros.eliminarLibro()
    conjuntolibros.eliminarLibro()

    conjuntolibros.añadirLibro()
    conjuntolibros.mostrarConjunto()




}


/*
Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo).
Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor
y menor calificación y, por último, mostrar un contenido de todo el conjunto.

En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor)
hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.

 */
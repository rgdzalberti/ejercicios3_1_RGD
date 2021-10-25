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
        titulo = readLine().toString()
    }
    fun modificarAutor(){
        autor = readLine().toString()
    }
    fun modificarNumeroPaginas(){
        numeroPaginas = readLine()?.toInt()!!
    }
    fun modificarCalificacion(){
        var continuar: Boolean = true
        while (continuar==true) {
            calificacion = readLine()?.toInt()!!
            if (calificacion in 0..10){
                continuar==false
            }
            else{
                println("Parámetro incorrecto. Solo puedes introducir un número entre 0 y 10")
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
        //por titulo o autor
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
            print(arrayTitulo[y] + "," + arrayAutor[y] + "," + arrayNumpag[y] + (",") + arrayCalificacion[y])
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

    println("Empieza el programa")
    conjuntolibros.añadirLibro()
    println("")
    conjuntolibros.añadirLibro()
    //conjuntolibros.mostrarConjunto()
    conjuntolibros.menorCalificacion()

}

/*
Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo).
Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor
y menor calificación y, por último, mostrar un contenido de todo el conjunto.

En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor)
hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.

 */
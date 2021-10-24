var arrayTitulo: Array<String?> = arrayOfNulls(9)
var arrayAutor: Array<String?> = arrayOfNulls(9)
var arrayNumpag: Array<Int> = arrayOf(9)
var arrayCalificacion: Array<Int> = arrayOf(9)



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
        var checkArray: Int = 0
        var calificacion: Int = 0

        var x : Int = 0


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
                        continuar==false
                    }
                    else{
                        println("Parámetro incorrecto. Solo puedes introducir un número entre 0 y 10")
                    }
                }

                arrayTitulo[x] = titulo
                arrayAutor[x] = autor
                arrayNumpag[x] = numpag
                arrayCalificacion[x] = calificacion
                    x++
                checkArray++



            }

        }

    }
    fun eliminarLibro(){
        //por titulo o autor
    }
    fun mayorCalificacion(){}
    fun menorCalificacion(){}
    fun mostrarConjunto(){

        var continuar : Boolean = true
        var x: Int = 0

        while (continuar==true)
        {
            println("//Quitar este comentario")
            print(arrayTitulo[x] + ",")
            print(arrayAutor[x] + ",")
            print(arrayNumpag[x])
            print(",")
            print(arrayCalificacion[x])
            x++

            if (x==9)
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
    conjuntolibros.mostrarConjunto()

}

/*
Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo).
Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor
y menor calificación y, por último, mostrar un contenido de todo el conjunto.

En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor)
hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.

 */
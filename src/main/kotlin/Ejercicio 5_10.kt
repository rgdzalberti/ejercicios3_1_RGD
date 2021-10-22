
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

class ConjuntoLibros(var vector: Int = 5){
    fun añadirLibro(){

    }
    fun eliminarLibro(){
        //por titulo o autor
    }
    fun mayorCalificacion(){}
    fun menorCalificacion(){}
    fun mostrarConjunto(){}

}

fun main(){

    var libro1 = Libro("El Árbol de la ciencia","José Panema",324, 8)
    var libro2 = Libro("Mein Kampf","Hitler",501, 6)

}
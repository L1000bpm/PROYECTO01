import kotlin.math.pow

fun main(){

    var nombre : String = "Leonardo"
    var apellido : String = "Fuentes"

    println("Me llamo ${nombre.uppercase()} ${apellido.lowercase()}")

    val dia : Int = 1
    val mes : Int = 7
    
    println("Mi Cumpleaños es: $dia/$mes")

    println(2+2)
    println(2-2)
    println(2/2)
    println(2%2)
    println(2*2)
    println(4.0.pow(2))

    var isTrue : Boolean = true
    var isFalse : Boolean = false

    println(isTrue && isFalse)
    println(isTrue || isFalse)
    println(!isTrue)

    helloworld()
    var number : Int = dobleNumero(10)

    println(number)
    println(dobleNumero(20))

    imprimirComidaFavorita()
    imprimirComidaFavorita("Leonardo", "Pollo a la brasa")

}

fun helloworld(){
    println("Hello World")
}

fun dobleNumero(n : Int) : Int{
    return n * 2
}

fun imprimirComidaFavorita(nombre : String = "Anonimo", comida : String = "Pizza") : Unit{
    println("$nombre, tu comida favorita es $comida")
}
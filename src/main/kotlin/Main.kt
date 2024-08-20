//Lucas Rodriguez España

fun main() {
    raiz()
    division(12.0,3.0)
    multi (4.0,5.0)
    suma()
    resta()
    saludo()
    cuadrado()
    println("La raiz del numero $n1 es : ${raiz()}")
    println("El cuadrado es : ${cuadrado()}")

    var estado = true

    while(estado){
        println("""
            
        """.trimIndent())
    }





}
fun suma (){
    var n1 = 12
    var n2 = 6
    println("La suma de los numeros $n1 y $n2 es ${(n1+n2)}")
}

fun resta (){
    var n1 = 12
    var n2 = 6
    println("La resta de los numeros $n1 y $n2 es ${(n1-n2)}")
}

var n1 = 12
var n2 =6
fun raiz (): Double {
    return Math.sqrt(n1.toDouble())
}

fun saludo (){
    println("Seleccione una opcion:")
}
fun cuadrado(): Double{
    return Math.pow(10.0,2.0)
}

fun division (numero1:Double, numero2:Double){
    var div =numero1/numero2
    println("La division es ${div}")

}
fun multi (n1:Double, n2:Double): Double {
    return (n1*n2)
    println("La multiplicacion es ${multi(n1, n2)}")
}



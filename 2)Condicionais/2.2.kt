//2.2. Leia um valor e diga se ele é positivo, negativo ou zero.

package `2)Condicionais`

fun main() {

    println("Digite um valor? ")
    var num = readln().toInt()

    if( num > 0){
        println("número positivo")
    } else if (num < 0){
        println("Número negativo")
    } else {
        println("Número igual a zero")
    }
}
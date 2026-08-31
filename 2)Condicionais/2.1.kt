// 2.1. Leia dois números e mostre o maior deles.

package `2)Condicionais`

fun main() {

    print("Informe o primeiro número: ")
    var num1 = readln().toInt()

    print("Informe o primeiro número: ")
    var num2 = readln().toInt()

    if (num1 > num2){
        println("O $num1 é maior que o $num2")
    } else {
        println("O $num2 é maior que o $num1")
    }
}
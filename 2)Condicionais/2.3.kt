//2.3. Leia 3 valores diferentes e mostre o maior.

package `2)Condicionais`

fun main() {

    println("Digite o primeiro número? ")
    var n1 = readln().toInt()

    println("Digite o primeiro número? ")
    var n2 = readln().toInt()

    println("Digite o primeiro número? ")
    var n3 = readln().toInt()

    if ( n1 > n2 && n1 > n3){
        println("O $n1 é o maior número")
    } else if (n2 > n1 && n2 > n3){
        println("O $n2 é o maior número")
    } else {
        println("O $n3 é o maior número")
    }
}
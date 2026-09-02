//3.1. Crie uma bomba-relógio com contagem regressiva de 30 até 0 e, ao final, escreva EXPLOSÃO.

package `3)Laços_de_Repetição`

import kotlin.concurrent.thread

fun main() {

    var contador = 30

    while (contador >= 1) {
        println(contador)
        Thread.sleep(1000)
        contador--
    }
    println("EXPLOSÃO")
}
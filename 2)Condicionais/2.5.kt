//2.5. Leia 6 valores, exiba todos e calcule a média aritmética.

package `2)Condicionais`

fun main() {

    val valores = Array(6) {0.0}
    var soma = 0.0

    for (i in 0 until 6){
        print("Digite o ${i + 1}º valor: ")
        valores[i] = readln().toDouble()

        soma += valores[i]
    }

    println("Valores digitados: ")
    for (i in 0 until 6){
        println(valores[i])
    }

    var media = soma / 6
    println("Média aritmética: $media")
}
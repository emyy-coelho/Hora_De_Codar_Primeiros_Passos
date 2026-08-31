//2.7. Leia 6 números. Some apenas os valores menores que 72. Exiba a soma e todos os valores informados.

package `2)Condicionais`

fun main() {

    val valores = Array(size = 6) {0.0}
    var soma = 0.0

    for (i in 0 until 6) {
        print("Digite o ${i+1}º valor: ")
        valores[i] = readln().toDouble()

        if (valores[i] < 72){
            soma += valores[i]
        }
    }
    println("Valores informados: ${valores.contentToString()}")
    println("Soma dos valores menores que 72: $soma")

}

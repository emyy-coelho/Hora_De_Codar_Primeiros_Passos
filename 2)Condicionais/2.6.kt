// 2.6. Leia 4 valores diferentes e informe apenas o primeiro, o último e o maior deles.

package `2)Condicionais`

fun main() {

    val valores = Array(4) {0.0}

    for (i in 0 until 4){
        print("Digite o ${i+1}º valor: ")
        valores[i] = readln().toDouble()
    }

    val primeiro_valor = valores[0]
    println("Primeiro valor digitado: ${primeiro_valor} ")

    val ultimo_valor = valores[3]
    println("Ultima valor digitado: ${ultimo_valor} ")

    val maior_valor = valores.max()
    println("Maior valor digitado: ${maior_valor} ")
}
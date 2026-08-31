//2.9. Leia o ano de nascimento e informe se a pessoa pode votar no ano atual (sem considerar o mês).

package `2)Condicionais`

fun main() {

    val ano_atual = 2026

    println("Digite seu ano de nascimento: ")
    var ano_nasc = readln().toInt()

    var idade = ano_atual - ano_nasc
    if ( idade >= 16) {
        println("Você pode votar")
    } else {
        println("Você nao pode votar")
    }
}
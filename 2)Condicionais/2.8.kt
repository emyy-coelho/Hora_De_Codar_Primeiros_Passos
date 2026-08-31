//2.8. Leia 4 números, aceitando apenas valores maiores que 0 e menores que 10. Calcule a média e:
//- se média > 5, exiba "Você passou no teste";
//- caso contrário, exiba "Tente novamente".

package `2)Condicionais`

fun main() {

    val valores = Array(size = 4){0.0}
    var soma = 0.0
    var media = 0.0


    for (i in 0 until 4) {
        do {
            print("Digite o ${i + 1}º valor: ")
            valores[i] = readln().toDouble()

            if (valores[i] <= 0 || valores[i] >= 10) {
                println("Valores incorretos. Digite novamente:  ")
            }
        } while (valores[i] <= 0 || valores[i] >= 10)
            soma += valores[i]
    }

    media = soma / 4

    println("Soma dos valores: $soma")
    println("Média: $media")

    if(media > 5){
        println("Você passou no teste")
    } else {
        println("Tente novamente")
    }





}

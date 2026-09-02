//3.2. Leia dois valores. Enquanto o segundo valor for menor ou igual a zero, peça novamente esse mesmo valor. Ao final, mostre a divisão do primeiro pelo segundo

package `3)Laços_de_Repetição`

fun main() {

    var divisao = 0.0

    print("Digite o primeiro número: ")
    var num1 = readln().toDouble()

    print("Digite o segundo número: ")
    var num2 = readln().toDouble()

    while (num2 <= 0){
       print("Digite o segundo novamente: ")
       num2 = readln().toDouble()
    }

    divisao = (num1 / num2)
    print("A divisão de $num1 por $num2 = $divisao ")

}
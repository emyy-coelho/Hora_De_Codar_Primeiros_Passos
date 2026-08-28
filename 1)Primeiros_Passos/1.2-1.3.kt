//1.2. Peça ao usuário que informe o nome e exiba a mensagem: Olá, [NomeDoUsuario].
//1.3. Peça ao usuário nome e idade e exiba: Olá, [NomeDoUsuario], sua idade é [idade].

package `1)Primeiros_Passos`// 1.2 e 1.3

fun main() {

    print("Digite seu nome: ")
    var nome = readln()

    print("Digite sua idade: ")
    var idade = readln().toInt()

    print("Olá, $nome, sua idade é $idade")
}
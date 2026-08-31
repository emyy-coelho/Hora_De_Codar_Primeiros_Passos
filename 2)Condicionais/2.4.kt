//2.4. Leia 3 valores diferentes e mostre a soma dos 2 maiores.

package `2)Condicionais`

fun main() {

    print("Digite o primeiro número? ")
    var n1 = readln().toInt()

    print("Digite o primeiro número? ")
    var n2 = readln().toInt()

    print("Digite o primeiro número? ")
    var n3 = readln().toInt()

  if ( n1 < n2 && n1 < n3){
      var soma = n2 + n3
      print("Soma = $soma")
  } else if (n2 < n1 && n2 < n3){
      var soma = n1 + n3
      print("Soma = $soma")
  } else {
      var soma = n1 + n2
      print("Soma = $soma")
  }
}
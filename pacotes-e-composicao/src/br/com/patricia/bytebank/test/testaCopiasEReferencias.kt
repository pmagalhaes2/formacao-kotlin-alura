import br.com.patricia.bytebank.model.ContaCorrente

fun testaCopiasEReferencias() {
    //tipos por valor - copia o valor em espaços de memórias diferentes
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("$numeroX")
    println("$numeroY")

    //tipos por referência - apontam para o mesmo endereço de memória
    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaCorrente("Maria", 1003)

    println("`heranca-polimorfismo-interface`.src.br.com.patricia.bytebank.model.Conta João: ${contaJoao.titular}")
    println("`heranca-polimorfismo-interface`.src.br.com.patricia.bytebank.model.Conta Maria: ${contaMaria.titular}")
}
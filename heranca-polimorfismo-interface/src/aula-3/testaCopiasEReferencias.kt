package `aula-3`

fun testaCopiasEReferencias() {
    //tipos por valor - copia o valor em espaços de memórias diferentes
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("$numeroX")
    println("$numeroY")

    //tipos por referência - apontam para o mesmo endereço de memória
    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("`heranca-polimorfismo-interface`.src.Conta João: ${contaJoao.titular}")
    println("`heranca-polimorfismo-interface`.src.Conta Maria: ${contaMaria.titular}")
}
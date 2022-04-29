import br.com.patricia.bytebank.model.Cliente
import br.com.patricia.bytebank.model.ContaCorrente

fun testaCopiasEReferencias() {
    //tipos por valor - copia o valor em espaços de memórias diferentes
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("$numeroX")
    println("$numeroY")

    //tipos por referência - apontam para o mesmo endereço de memória
    val joao = Cliente(nome = "João", cpf = "", senha = 457)
    val contaJoao = ContaCorrente(joao, 1002)
    val maria = Cliente(nome = "João", cpf = "", senha = 789)
    var contaMaria = ContaCorrente(maria, 1003)

    println("`heranca-polimorfismo-interface`.src.br.com.patricia.bytebank.model.Conta João: ${contaJoao.titular}")
    println("`heranca-polimorfismo-interface`.src.br.com.patricia.bytebank.model.Conta Maria: ${contaMaria.titular}")
}
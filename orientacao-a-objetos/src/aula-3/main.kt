package `aula-3`

fun main() {
    println("Bem vindo ao Bytebank!")

    val contaPatricia = Conta()
    contaPatricia.titular = "Patricia"
    contaPatricia.nroConta = 1000
    contaPatricia.saldoConta = 450.0

    println("Titular da conta: ${contaPatricia.titular}")
    println("Número da conta: ${contaPatricia.nroConta}")
    println("Saldo da conta: ${contaPatricia.saldoConta}")
    println("")

    val contaPriscila = Conta()
    contaPriscila.titular = "Priscila"
    contaPriscila.nroConta = 1001
    contaPriscila.saldoConta = 200.0

    println("Titular da conta: ${contaPriscila.titular}")
    println("Número da conta: ${contaPriscila.nroConta}")
    println("Saldo da conta: ${contaPriscila.saldoConta}")
    println("")

    println("Depositando na conta da Patricia...")
    deposita(contaPatricia, 50.0)
    println("Saldo após depósito: ${contaPatricia.saldoConta}")
    println("")

    println("Depositando na conta da Priscila...")
    deposita(contaPriscila, 150.0)
    println("Saldo após depósito: ${contaPriscila.saldoConta}")
    println("")
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldoConta += valor
}

class Conta {
    var titular = ""
    var nroConta = 0
    var saldoConta = 0.0
}

fun testaCopiasEReferencias() {
    //tipos por valor - copia o valor em espaços de memórias diferentes
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("$numeroX")
    println("$numeroY")

    //tipos por referência - apontam para o mesmo endereço de memória
    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Conta João: ${contaJoao.titular}")
    println("Conta Maria: ${contaMaria.titular}")
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Patricia $i"
        val nroConta: Int = 1000 + i
        var saldoConta = i + 10.0
        i++

        println("Títular da conta: $titular")
        println("Número da conta: $nroConta")
        println("Saldo da conta: $saldoConta")
        println("")
    }
}

fun verificaSaldo(saldoConta: Double) {
    when {
        saldoConta > 0.0 -> println("Conta com saldo positivo")
        saldoConta == 0.0 -> println("Conta neutra")
        else -> println("Conta com saldo negativo")
    }
}
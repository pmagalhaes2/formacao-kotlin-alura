package `aula-5`

fun main() {
    println("Bem vindo ao Bytebank!")

    val contaPatricia = Conta("Patricia", 1000)
    contaPatricia.deposita(450.0)

    println("Titular da conta: ${contaPatricia.titular}")
    println("Número da conta: ${contaPatricia.nroConta}")
    println("Saldo da conta: ${contaPatricia.saldoConta}")
    println("")

    val contaPriscila = Conta("Priscila", 1001)
    contaPriscila.deposita(200.0)

    println("Titular da conta: ${contaPriscila.titular}")
    println("Número da conta: ${contaPriscila.nroConta}")
    println("Saldo da conta: ${contaPriscila.saldoConta}")
    println("")

    println("Depositando na conta da Patricia...")
    contaPatricia.deposita(50.0)
    println("Saldo após depósito: ${contaPatricia.saldoConta}")
    println("")

    println("Depositando na conta da Priscila...")
    contaPriscila.deposita(150.0)
    println("Saldo após depósito: ${contaPriscila.saldoConta}")
    println("")

    println("Sacando da conta da Patricia...")
    contaPatricia.saca(50.0)
    println("Saldo após saque: ${contaPatricia.saldoConta}")
    println("")

    println("Sacando da conta da Priscila...")
    contaPriscila.saca(20.0)
    println("Saldo após saque: ${contaPriscila.saldoConta}")
    println("")

    println("Transferindo da conta da Patricia para conta da Priscila...")

    if (contaPatricia.transfere(100.0, contaPriscila)) {
        println("Transferência bem sucedida!")
        println("")
        println("Saldo conta origem: ${contaPatricia.saldoConta}")
        println("Saldo conta destino: ${contaPriscila.saldoConta}")
    } else {
        println("Falha na transferência.")
    }
}

class Conta(val titular: String, val nroConta: Int) {
    var saldoConta = 0.0
        private set

//    constructor(titular: String, nroConta: Int) {
//        this.titular = titular
//        this.nroConta = nroConta
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldoConta += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldoConta >= valor) {
            saldoConta -= valor
        } else {
            println("[ERRO] Saque não realizado, valor informado é maior que o saldo da conta.")
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldoConta >= valor) {
            saldoConta -= valor
            contaDestino.deposita(valor)
//          contaDestino.saldoConta += valor
            return true
        }
        return false
    }

}


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
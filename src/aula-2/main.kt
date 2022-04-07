package `aula-2`

fun main() {
    println("Bem vindo ao Bytebank!")

    val titular = "Patricia"
    val nroConta = 1000
    var saldoConta = 0.0
//    saldoConta = 100 + 2.0
//    saldoConta += 200

    println("Títular da conta: $titular")
    println("Número da conta: $nroConta")
    println("Saldo da conta: $saldoConta")


//    if(saldoConta > 0.0) {
//        println("Conta com saldo positivo")
//    } else if (saldoConta == 0.0) {
//        println("Conta neutra")
//    } else {
//        println("Conta negativa")
//    }

    when {
        saldoConta > 0.0 -> println("Conta com saldo positivo")
        saldoConta == 0.0 -> println("Conta neutra")
        else -> println("Conta negativa")
    }
}

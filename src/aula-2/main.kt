package `aula-2`

fun main() {
    println("Bem vindo ao Bytebank!")

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }

//    var i = 0
//    while (i < 5) {
//        val titular: String = "Patricia $i"
//        val nroConta: Int = 1000 + i
//        var saldoConta = i + 10.0
//        i++
//
//        println("Títular da conta: $titular")
//        println("Número da conta: $nroConta")
//        println("Saldo da conta: $saldoConta")
//        println("")
//    }

    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }

        val titular: String = "Patricia $i"
        val nroConta: Int = 1000 + i
        var saldoConta = i + 10.0

        println("Títular da conta: $titular")
        println("Número da conta: $nroConta")
        println("Saldo da conta: $saldoConta")
        println("")

        verificaSaldo(saldoConta)
    }
}

fun verificaSaldo(saldoConta: Double) {
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
        else -> println("Conta com saldo negativo")
    }
}
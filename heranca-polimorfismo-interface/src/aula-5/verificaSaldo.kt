package `aula-5`

fun verificaSaldo(saldoConta: Double) {
    when {
        saldoConta > 0.0 -> println("`heranca-polimorfismo-interface`.src.Conta com saldo positivo")
        saldoConta == 0.0 -> println("`heranca-polimorfismo-interface`.src.Conta neutra")
        else -> println("`heranca-polimorfismo-interface`.src.Conta com saldo negativo")
    }
}
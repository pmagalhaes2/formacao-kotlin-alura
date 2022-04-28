fun verificaSaldo(saldoConta: Double) {
    when {
        saldoConta > 0.0 -> println("`heranca-polimorfismo-interface`.src.br.com.patricia.bytebank.model.Conta com saldo positivo")
        saldoConta == 0.0 -> println("`heranca-polimorfismo-interface`.src.br.com.patricia.bytebank.model.Conta neutra")
        else -> println("`heranca-polimorfismo-interface`.src.br.com.patricia.bytebank.model.Conta com saldo negativo")
    }
}
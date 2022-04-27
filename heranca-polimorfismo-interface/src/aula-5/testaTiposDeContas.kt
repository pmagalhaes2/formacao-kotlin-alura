package `aula-5`

fun testaTiposDeContas() {
    val contaCorrente = ContaCorrente(titular = "Patricia", nroConta = 4578)
    val contaPoupanca = ContaPoupanca(titular = "Alex", nroConta = 1453)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldoConta}")
    println("Saldo poupança: ${contaPoupanca.saldoConta}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque corrente: ${contaCorrente.saldoConta}")
    println("Saldo após saque poupança: ${contaPoupanca.saldoConta}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo corrente após transferir para poupança: ${contaCorrente.saldoConta}")
    println("Saldo poupança após receber transferência: ${contaPoupanca.saldoConta}")
}
import br.com.patricia.bytebank.model.ContaCorrente
import br.com.patricia.bytebank.model.ContaPoupanca
import br.com.patricia.bytebank.model.ContaSalario

fun testaTiposDeContas() {
    val contaCorrente = ContaCorrente(titular = "Patricia", nroConta = 4578)
    val contaPoupanca = ContaPoupanca(titular = "Alex", nroConta = 1453)
    val contaSalario = ContaSalario(titular = "Bruno", nroConta = 1548)


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldoConta}")
    println("Saldo poupança: ${contaPoupanca.saldoConta}")
    println("Saldo salário: ${contaSalario.saldoConta}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo após saque corrente: ${contaCorrente.saldoConta}")
    println("Saldo após saque poupança: ${contaPoupanca.saldoConta}")
    println("Saldo após saque salário: ${contaSalario.saldoConta}")

    contaCorrente.transfere(100.0, contaSalario)
    println("Saldo corrente após transferir para salário: ${contaCorrente.saldoConta}")
    println("Saldo salário após receber transferência: ${contaSalario.saldoConta}")

    contaPoupanca.transfere(200.0, contaSalario)
    println("Saldo corrente após transferir para salário: ${contaPoupanca.saldoConta}")
    println("Saldo salário após receber transferência: ${contaSalario.saldoConta}")
}
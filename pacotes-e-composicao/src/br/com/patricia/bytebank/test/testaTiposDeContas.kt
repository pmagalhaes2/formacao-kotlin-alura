import br.com.patricia.bytebank.model.*

fun testaTiposDeContas() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Patricia",
            cpf = "333.333.333-33",
            senha = 123,
            endereco = Endereco(
                logradouro = "Rua Vergueiro",
                numero = 150,
                bairro = "Vila Olímpia",
                cidade = "São Paulo",
                estado = "SP",
                cep = "00000-000",
            )
        ),
        nroConta = 4578
    )
    val contaPoupanca = ContaPoupanca(titular = Cliente(
        nome = "Alex",
        cpf = "",
        senha = 541
    ), nroConta = 1453)
    val contaSalario = ContaSalario(titular = Cliente(
        nome = "Bruno",
        cpf = "",
        senha = 745
    ), nroConta = 1548)

    println("Títular: ${contaCorrente.titular.nome}")
    println("CPF: ${contaCorrente.titular.cpf}")
    println("Endereco: ${contaCorrente.titular.endereco.logradouro}")

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
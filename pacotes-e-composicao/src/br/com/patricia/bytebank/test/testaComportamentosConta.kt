import br.com.patricia.bytebank.model.Cliente
import br.com.patricia.bytebank.model.ContaCorrente

fun testaComportamentosConta() {

    val patricia = Cliente(nome = "Patricia", cpf="", senha = 123)
    val contaPatricia = ContaCorrente(patricia, 1000)
    contaPatricia.deposita(450.0)

    println("Titular da conta: ${contaPatricia.titular}")
    println("Número da conta: ${contaPatricia.nroConta}")
    println("Saldo da conta: ${contaPatricia.saldoConta}")
    println("")

    val priscila = Cliente(nome = "Priscila", cpf="", senha = 564)
    val contaPriscila = ContaCorrente(priscila, 1001)
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

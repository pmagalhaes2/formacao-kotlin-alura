import br.com.patricia.bytebank.model.*

fun main() {

    val fran = object: Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

     println("Nome da cliente: ${fran.nome}")

    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Beatriz",
            cpf = "444.444.444-44",
            senha = 134
        ),
        nroConta = 478
    )

    testaTiposDeContas()

    println("Total contas criadas: ${Conta.Contador.totalContas}")
}


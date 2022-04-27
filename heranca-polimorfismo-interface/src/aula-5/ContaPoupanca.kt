package `aula-5`

class ContaPoupanca(
    titular: String,
    nroConta: Int
) : Conta(titular = titular, nroConta = nroConta) {
    override fun saca(valor: Double) {
        if(this.saldoConta >= valor) {
            this.saldoConta -= valor
        }
    }
}
package `aula-4`

class ContaCorrente(
    titular: String,
    nroConta: Int
) : Conta(titular = titular, nroConta = nroConta) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldoConta >= valorComTaxa) {
            this.saldoConta -= valorComTaxa
        }
    }
}
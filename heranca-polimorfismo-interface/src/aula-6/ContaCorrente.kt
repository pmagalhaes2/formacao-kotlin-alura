package `aula-6`

class ContaCorrente(
    titular: String,
    nroConta: Int
) : ContaTransferivel(
    titular = titular,
    nroConta = nroConta
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldoConta >= valorComTaxa) {
            this.saldoConta -= valorComTaxa
        }
    }
}
package `aula-6`

class ContaPoupanca(
    titular: String,
    nroConta: Int
) : ContaTransferivel(
    titular = titular,
    nroConta = nroConta
) {
    override fun saca(valor: Double) {
        if(this.saldoConta >= valor) {
            this.saldoConta -= valor
        }
    }
}
package br.com.patricia.bytebank.model

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
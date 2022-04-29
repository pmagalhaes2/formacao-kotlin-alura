package br.com.patricia.bytebank.model

class ContaSalario(
    titular: Cliente,
    nroConta: Int
) : Conta(
    titular = titular,
    nroConta = nroConta
) {

    override fun saca(valor: Double) {
        if(this.saldoConta >= valor) {
            this.saldoConta -= valor
        }
    }
}
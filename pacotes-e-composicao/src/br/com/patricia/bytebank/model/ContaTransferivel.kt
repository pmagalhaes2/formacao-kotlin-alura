package br.com.patricia.bytebank.model

abstract class ContaTransferivel(
    titular: String,
    nroConta: Int
) : Conta(
    titular = titular,
    nroConta = nroConta
){

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldoConta >= valor) {
            saldoConta -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }
}
package br.com.patricia.bytebank.model

abstract class Conta(
    val titular: String,
    val nroConta: Int
) {
    var saldoConta = 0.0
        protected set

//    constructor(titular: String, nroConta: Int) {
//        this.titular = titular
//        this.nroConta = nroConta
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldoConta += valor
        }
    }

    abstract fun saca(valor: Double)

}
package br.com.patricia.bytebank.model

var totalContas = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val nroConta: Int
) {
    var saldoConta = 0.0
        protected set

    init {
        println("Criando conta..")
        totalContas++
    }

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
package br.com.patricia.bytebank.model

abstract class Conta(
    val titular: Cliente,
    val nroConta: Int
) {
    var saldoConta = 0.0
        protected set
    companion object Contador{ //Não é obrigatório atribuir um nome ao objeto
        var totalContas = 0
            private set
    }

    init {
        println("Criando conta..")
        Contador.totalContas++
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
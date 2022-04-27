package `aula-5`

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

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldoConta >= valor) {
            saldoConta -= valor
            contaDestino.deposita(valor)
//          contaDestino.saldoConta += valor
            return true
        }
        return false
    }

}
package `aula-1`

class Conta(val titular: String, val nroConta: Int) {
    var saldoConta = 0.0
        private set

//    constructor(titular: String, nroConta: Int) {
//        this.titular = titular
//        this.nroConta = nroConta
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldoConta += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldoConta >= valor) {
            saldoConta -= valor
        } else {
            println("[ERRO] Saque não realizado, valor informado é maior que o saldo da conta.")
        }
    }

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
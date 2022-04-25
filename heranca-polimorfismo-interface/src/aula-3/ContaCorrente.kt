package `aula-3`

class ContaCorrente(
    titular: String,
    nroConta: Int
) : Conta(titular = titular, nroConta = nroConta) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.saca(valorComTaxa)
    }
}
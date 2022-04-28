package `aula-6`

class ContaSalario(
    titular: String,
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
package `aula-3`

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

//    fun registra(diretor: Diretor) {
//        this.total += diretor.bonificacao()
//    }
//
//    fun registra(gerente: Gerente) {
//        this.total += gerente.bonificacao()
//    }
}
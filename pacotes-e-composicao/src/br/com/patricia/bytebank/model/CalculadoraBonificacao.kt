package br.com.patricia.bytebank.model

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

//    fun registra(diretor: br.com.patricia.bytebank.model.Diretor) {
//        this.total += diretor.bonificacao()
//    }
//
//    fun registra(gerente: br.com.patricia.bytebank.model.Gerente) {
//        this.total += gerente.bonificacao()
//    }
}
package br.com.patricia.bytebank.model

class Analista(
    nome: String, cpf: String, salario: Double, val senha: Int = 0
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override fun bonificacao(): Double {
        return salario * 0.1
    }

    override fun autentica(senha: Int): Boolean = this.senha == senha
}
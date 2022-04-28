package br.com.patricia.bytebank.model

class Analista(
    nome: String, cpf: String, salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return salario * 0.1
    }
}
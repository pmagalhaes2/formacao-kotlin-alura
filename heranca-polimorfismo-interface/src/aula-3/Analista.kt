package `aula-3`

class Analista(
    nome: String, cpf: String, salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return super.bonificacao() + 0.1
//        return salario * 0.1 + salario
    }
}
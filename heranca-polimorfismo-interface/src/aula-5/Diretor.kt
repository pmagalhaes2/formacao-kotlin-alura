package `aula-5`

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    override fun bonificacao(): Double {
        return salario + plr
    }
}
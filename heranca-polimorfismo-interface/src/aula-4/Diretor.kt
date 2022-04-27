package `aula-4`

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    var plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return salario + plr
//        return salario * 0.1 + salario + plr
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}
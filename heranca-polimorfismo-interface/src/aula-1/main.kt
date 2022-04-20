package `aula-1`

fun main() {
    println("Bem vindo ao Bytebank!")

    val patricia = Funcionario(
        nome = "Patricia",
        cpf = "123.456.789-00",
        salario = 2000.0
    )

    println("Nome = ${patricia.nome}")
    println("CPF = ${patricia.cpf}")
    println("Salário = ${patricia.salario}")
    println("Bonificação = ${patricia.bonificacao()}")


    val pedro = Gerente(
        nome = "Pedro",
        cpf = "124.578.878-11",
        salario = 3000.0,
        senha = 1234
    )

    println("Nome = ${pedro.nome}")
    println("CPF = ${pedro.cpf}")
    println("Salário = ${pedro.salario}")
    println("Bonificação = ${pedro.bonificacao()}")

    if (pedro.autentica(123)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação")
    }
}
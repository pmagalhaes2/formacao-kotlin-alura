package `aula-6`

fun testaFuncionarios() {
    println("Bem vindo ao Bytebank!")

    val patricia = Analista(
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

    if (pedro.autentica(1234)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação")
    }


    val guilherme = Diretor(
        nome = "Guilherme",
        cpf = "122.333.444-11",
        salario = 4500.0,
        senha = 2456,
        plr = 200.0
    )

    println("Nome = ${guilherme.nome}")
    println("CPF = ${guilherme.cpf}")
    println("Salário = ${guilherme.salario}")
    println("Bonificação = ${guilherme.bonificacao()}")

    if (pedro.autentica(1234)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação")
    }

    val maria = Analista(nome = "Maria", cpf = "444.444.444-44", salario = 1500.0)
    println("Nome = ${maria.nome}")
    println("CPF = ${maria.cpf}")
    println("Salário = ${maria.salario}")
    println("Bonificação = ${maria.bonificacao()}")


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(patricia)
    calculadora.registra(pedro)
    calculadora.registra(guilherme)
    calculadora.registra(maria)

    println("O total de bonificação é: ${calculadora.total}")
}
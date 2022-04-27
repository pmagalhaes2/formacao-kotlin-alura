package `aula-5`

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "alex",
        cpf = "478.546.555-55",
        salario = 3000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Carlos",
        cpf = "222.546.879-66",
        salario = 5000.0,
        senha = 4354,
        plr = 150.0
    )

    val cliente = Cliente(
        nome = "Bernardo",
        cpf = "222.444.555-99",
        senha = 4589
    )

    val sistema = SistemaInterno()
    sistema.entra(admin = gerente, senha = 1000)
    sistema.entra(admin = diretor, senha = 4354)
//    sistema.entra(admin = cliente, senha = 1245)
}
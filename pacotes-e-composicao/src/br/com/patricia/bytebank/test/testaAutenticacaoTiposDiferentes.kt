package br.com.patricia.bytebank.test

import br.com.patricia.bytebank.model.Analista
import br.com.patricia.bytebank.model.Cliente
import br.com.patricia.bytebank.model.Gerente
import br.com.patricia.bytebank.model.SistemaInterno

fun testaAutenticacaoTiposDiferentes() {
    //analista implementando Autenticavel
    val analista = Analista(
        nome = "Bárbara",
        cpf = "",
        salario = 1000.0,
        senha = 1000
    )

    //gerente herda de FuncionarioAdmin que implementa Autenticavel
    val gerente = Gerente(
        nome = "Bianca",
        cpf = "",
        salario = 2000.0,
        senha = 2000
    )

    val cliente = Cliente(
        nome = "Otávio",
        cpf = "",
        senha = 3000
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(analista, 1000)
    sistemaInterno.entra(gerente, 2000)
    sistemaInterno.entra(cliente, 3000)
}
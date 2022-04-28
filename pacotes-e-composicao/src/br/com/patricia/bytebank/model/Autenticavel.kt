package br.com.patricia.bytebank.model

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}
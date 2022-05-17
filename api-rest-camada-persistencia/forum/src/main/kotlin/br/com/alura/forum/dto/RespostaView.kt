package br.com.alura.forum.dto

import br.com.alura.forum.model.Usuario

class RespostaView(
    var id: Long? = null,
    val mensagem: String,
    val usuario: Usuario,
    val topico: TopicoView,
    val solucao: Boolean
)
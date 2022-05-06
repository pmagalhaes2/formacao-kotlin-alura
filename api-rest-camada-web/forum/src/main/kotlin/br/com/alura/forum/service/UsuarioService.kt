package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
data class UsuarioService(var usuarios: List<Usuario>) {
    init {
        val usuario = Usuario(
            id = 1,
            nome = "Bruno Marques",
            email = "bruno@teste.com.br"
        )

        usuarios = listOf(usuario)
    }

    fun buscarPorID(id: Long): Usuario {
        return usuarios.filter { usuario ->
            usuario.id == id
        }.first()
    }
}

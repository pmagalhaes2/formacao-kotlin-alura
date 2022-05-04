package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService {

        fun listar(): List<Topico> {
        val topico = Topico(
            id = 1,
            titulo = "Dúvida Kotlin",
            mensagem = "Variáveis no Kotlin",
            curso = Curso(
                id = 7,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 4,
                nome = "Ana da Silva",
                email = "ana@teste.com"
            )

        )
        return Arrays.asList(topico, topico)
    }
}
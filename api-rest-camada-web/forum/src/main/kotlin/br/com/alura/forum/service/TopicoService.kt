package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
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

        val topico2 = Topico(
            id = 2,
            titulo = "Dúvida Javascript",
            mensagem = "Variáveis no Javascript",
            curso = Curso(
                id = 5,
                nome = "Javascript",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 5,
                nome = "João Soares",
                email = "joao@teste.com"
            )

        )

        val topico3 = Topico(
            id = 3,
            titulo = "Dúvida Springboot",
            mensagem = "Injeção de dependências",
            curso = Curso(
                id = 9,
                nome = "Springboot",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 6,
                nome = "Bárbara Torres",
                email = "barbara@teste.com"
            )

        )

//        topicos = Arrays.asList(topico, topico2, topico3)
        topicos = listOf(topico, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

//    fun buscarPorID(id: Long): Topico {
//        return topicos.stream().filter({ topico ->
//            topico.id == id
//        }).findFirst().get()
//    }

    fun buscarPorID(id: Long): Topico {
        return topicos.filter{ topico ->
            topico.id == id
        }.first()
    }
}


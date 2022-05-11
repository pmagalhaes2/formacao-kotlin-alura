package br.com.alura.forum.service

import br.com.alura.forum.dto.NovaRespostaForm
import br.com.alura.forum.mapper.RespostaFormMapper
import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Resposta
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class RespostaService(
    private var respostas: List<Resposta> = ArrayList(),
    private val respostaFormMapper: RespostaFormMapper,
    private val topicoService: TopicoService
) {
//    init {
//        val curso = Curso(
//            id = 1,
//            nome = "Kotlin",
//            categoria = "Programacao"
//        )
//        val autor = Usuario(
//            id = 1,
//            nome = "Ana da Silva",
//            email = "ana@email.com"
//        )
//        val topico = Topico(
//            id = 1,
//            titulo = "Duvida Kotlin",
//            mensagem = "Variaveis no Kotlin",
//            curso = curso,
//            autor = autor
//        )
//
//        val resposta = Resposta(
//            id = 1,
//            mensagem = "Resposta 1",
//            autor = autor,
//            topico = topico,
//            solucao = false
//        )
//
//        val resposta2 = Resposta(
//            id = 2,
//            mensagem = "Resposta 2",
//            autor = autor,
//            topico = topico,
//            solucao = false
//        )
//
//        respostas = listOf(resposta, resposta2)
//    }

    fun listar(idTopico: Long): List<Resposta> {
        return respostas.filter { r ->
            r.topico.id == idTopico
        }.toList()
    }

    fun cadastrar(dto: NovaRespostaForm, idTopico: Long) {
        val resposta = respostaFormMapper.map(dto)
        resposta.id = respostas.size.toLong() + 1
        resposta.topico = topicoService.buscarPorID(idTopico)
        respostas = respostas.plus(resposta)
    }
}
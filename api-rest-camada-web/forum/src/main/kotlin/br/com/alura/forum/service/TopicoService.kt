package br.com.alura.forum.service

import br.com.alura.forum.dto.AtualizacaoTopicoForm
import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.mapper.TopicoFormMapper
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return topicos.map { t ->
            topicoViewMapper.map(t)
        }.toList()
    }

    fun buscarPorID(id: Long): TopicoView {
        val topico = topicos.filter { topico ->
            topico.id == id
        }.first()
        return topicoViewMapper.map(topico)
    }

    fun cadastrarTopico(dto: NovoTopicoForm) {
        val topico = topicoFormMapper.map(dto)
        topico.id = topicos.size.toLong() + 1
        topicos = topicos.plus(topico)
    }

    fun atualizarTopico(dto: AtualizacaoTopicoForm) {
        val topico = topicos.filter { topico ->
            topico.id == dto.id
        }.first()
        topicos = topicos.minus(topico).plus(Topico(
            id = dto.id,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            dataCriacao = topico.dataCriacao,
            autor = topico.autor,
            curso = topico.curso,
            respostas = topico.respostas,
            status = topico.status
        ))
    }

    fun deletarTopico(id: Long) {
        val topico = topicos.filter { topico ->
            topico.id == id
        }.first()
        topicos = topicos.minus(topico)
    }
}


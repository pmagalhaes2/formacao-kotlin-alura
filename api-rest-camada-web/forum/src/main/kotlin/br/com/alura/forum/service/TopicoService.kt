package br.com.alura.forum.service

import br.com.alura.forum.dto.NovoTopicoDTO
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorID(id: Long): Topico {
        return topicos.filter { topico ->
            topico.id == id
        }.first()
    }

    fun cadastrarTopico(dto: NovoTopicoDTO) {
        topicos = topicos.plus(Topico(
                id = topicos.size.toLong() + 1,
                titulo = dto.titulo,
                mensagem = dto.mensagem,
                curso = cursoService.buscarPorID(dto.idCurso),
                autor = usuarioService.buscarPorID(dto.idAutor)
            )
        )
    }
}


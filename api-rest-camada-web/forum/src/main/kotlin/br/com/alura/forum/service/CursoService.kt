package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import org.springframework.stereotype.Service

@Service
class CursoService(var cursos: List<Curso>) {
    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Programação"
        )
        cursos = listOf(curso)
    }

    fun buscarPorID(id: Long): Curso {
        return cursos.filter { curso ->
            curso.id == id
        }.first()
    }


}

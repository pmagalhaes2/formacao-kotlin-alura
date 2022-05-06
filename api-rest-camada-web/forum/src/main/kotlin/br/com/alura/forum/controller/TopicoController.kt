package br.com.alura.forum.controller

import br.com.alura.forum.dto.NovoTopicoDTO
import br.com.alura.forum.model.Topico
import br.com.alura.forum.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<Topico> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorID(@PathVariable id: Long): Topico {
        return service.buscarPorID(id)
    }

    @PostMapping
    fun cadastrarTopico(@RequestBody dto: NovoTopicoDTO) {
        service.cadastrarTopico(dto)
    }
}

package br.com.alura.forum.controller

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorID(@PathVariable id: Long): TopicoView {
        return service.buscarPorID(id)
    }

    @PostMapping
    fun cadastrarTopico(@RequestBody dto: NovoTopicoForm) {
        service.cadastrarTopico(dto)
    }
}

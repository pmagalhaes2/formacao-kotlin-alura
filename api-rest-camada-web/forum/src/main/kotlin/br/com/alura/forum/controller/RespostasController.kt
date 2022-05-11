package br.com.alura.forum.controller

import br.com.alura.forum.dto.NovaRespostaForm
import br.com.alura.forum.model.Resposta
import br.com.alura.forum.service.RespostaService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/topicos/{id}/respostas")
class RespostasController(private val service: RespostaService) {

    @GetMapping
    fun listar(@PathVariable id: Long): List<Resposta> {
        return service.listar(id)
    }

    @PostMapping
    fun cadastrar(@PathVariable id: Long, @RequestBody @Valid dto: NovaRespostaForm){
        service.cadastrar(dto, id)
    }

}
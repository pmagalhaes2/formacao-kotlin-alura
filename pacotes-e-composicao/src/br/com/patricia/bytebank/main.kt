import br.com.patricia.bytebank.model.Endereco

fun main() {
    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 1000)
    val enderecoNovo = Endereco(bairro = "Santa Cruz")
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)
}
import br.com.patricia.bytebank.model.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        numero = 1000,
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
    logradouro = "Rua Vergueiro",
    numero = 1000,
    cep = "00000-000"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)
}
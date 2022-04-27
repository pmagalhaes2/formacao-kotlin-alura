package `aula-4`

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Patricia $i"
        val nroConta: Int = 1000 + i
        var saldoConta = i + 10.0
        i++

        println("Títular da conta: $titular")
        println("Número da conta: $nroConta")
        println("Saldo da conta: $saldoConta")
        println("")
    }
}

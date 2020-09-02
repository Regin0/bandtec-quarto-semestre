fun main() {
    println("É nois kotlin")
    println("God God")

    val cidade = "São Paulo"
    val habitantes = 15000
    val capital = true

    val pais:String = "Canadá"
    val idh:Double = 0.877
    val populacao:Int = 50000
    val eMonarquia:Boolean = true

    val frase1 = "Na cidade de $cidade moram $habitantes habitantes"
    println(frase1)

    val frase2 = "Na cidade de ${cidade.toUpperCase()} moram ${habitantes.plus(1000)} habitantes"
    println(frase2)

    val pesoTexto = "77.55"
    println("Peso em Double: ${pesoTexto.toDouble()}")
    println("Peso em Double x 2: ${pesoTexto.toDouble()*2}")

    val idadeTexto = "55"
    println("Idade em texto: ${idadeTexto.toInt()}")
//    val idade:Int = idadeTexto.toInt()
//    println("Idaded em texto: $idade")

    //Em Kotlin, variáveis com "val" são IMUTÁVEIS (não da pra mudar)....
    //e variáveis com "var" são MUTÁVEIS (dá pra mudar)


    //listOf cria uma lista IMUTÁVEL (somente leitura)
    val frutas = listOf("Abacate", "Pera", "Maçã")

    val bairros = mutableListOf("Planalto", "Vila Prudente", "Faria Lima")
    println(bairros)
    bairros.add("Barueri")
    println(bairros)
    bairros.removeAt(0)
    println(bairros)

}

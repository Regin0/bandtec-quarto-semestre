fun main() {
    val idade = 97

//    if (idade >= 16){
//        println("Você já pode votar")
//    }
//    else{
//        println("Você ainda NÃO pode votar")
//
//    }

    val resultado = if (idade >= 16) "Voce já pode votar" else "Você ainda NÃO pode votar"
    println(resultado)


    //when: é um ótimo substituto para sequências de if-else-if-else    
    val frase = when (idade){
        0 -> "Mt bb"
        2 -> "Já deve falar alguma coisa"
        3,4,5 -> "Kid dms ainda"
        in 6..13-> "Tem futuro"
        14,15,16,17 -> "Já da trabson pros pais"
        in Int.MIN_VALUE..-1 -> "Idade inválida"
        //maior q 95 anos "Matusalém"
        in 96 ..Int.MAX_VALUE -> "Matusalém"
        else -> "Idade padrão"
    }
    println(frase)
}

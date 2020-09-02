fun main() {
    /*
        A Kotlin n curte NullPointer exception!
        ela faz de tudo pra q ela n ocorra
     */

//    val cidade = null
//    println("cidade: $cidade")

    val bairro:String? = null
    val idade:Int? = null
    val altura:Double? = null

    println("Bairro: ${bairro?.toUpperCase()}")
}
fun main() {
    cumprimentar()
    val variavelComFuncDentro = cumprimentar()

    println(calcularDescontoVt(2000.0))
    println(montarFrase("Regino",20))
}

fun cumprimentar(){
    println("Boa noite, galera")
}

fun calcularDescontoVt(salario:Double):Double{
    return salario * 0.06
}

fun montarFrase(nome:String, idade:Int):String{
    return "Você se chama $nome e tem $idade anos"
}
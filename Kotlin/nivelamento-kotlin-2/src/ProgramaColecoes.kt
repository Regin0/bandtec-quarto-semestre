fun main() {
    val paises = listOf<String>("Alemanha","Brasil","Canadá","Hungria","México")

//    paises.forEach{ println(it)}

    paises.forEach{ pais -> println("O país é $pais")
        if (pais.length>6){
            println("Nome giiigantesco")
        }
    }

    val quantosPaisesMais6Letras = paises.count{it.length > 6}
    println(quantosPaisesMais6Letras)

    val paisesComALetraR = paises.filter { it.contains("r") }
    println(paisesComALetraR)
}
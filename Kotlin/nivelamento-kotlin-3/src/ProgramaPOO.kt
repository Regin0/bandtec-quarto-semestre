fun main() {

    val pais1 = Pais("Canadá",1500,0.899)

    println(pais1.nome)
    println(pais1.populacao)
    println(pais1.idh)

    val alunoA = Aluno()
    alunoA.nome = "Regino"
    alunoA.idade = 20


    val frutaA = Fruta()
    val frutaB = Fruta("Jaca",12.5)
    val frutaC = Fruta("Uva")
    val frutaD = Fruta("Jaca",12.5)
    println(frutaB == frutaD)

    val cliente1 = Cliente("Zé","123",100.0)
    val cliente2 = Cliente("Marise","981",100000.0)
    val cliente3 = Cliente("Zé","123",100.0)

    println(cliente2)
    println(cliente1 == cliente3)

}
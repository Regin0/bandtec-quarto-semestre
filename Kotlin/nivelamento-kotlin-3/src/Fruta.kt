class Fruta(var nome: String?, var preco: Double?) {

    /*
        Construtor "personalizado" (termo "constructor()")
        Neste exemplo o construtor não recebe valor nenhum
        e indica que, ao ser invocado, chama, de forma IMPLÍCITA o construtor padrão
        com os 2 argumentos null
     */
    constructor() : this(null, null) {
        println("chamou o construtor")
    }


    /*
        Este outro construtor recebe apenas um "novoNome" e usa ele, de forma IMPLÍCITA,
        para passar esse "novoNome" como 1° argumento do construtor padrão
     */
    constructor(novoNome: String?) : this(novoNome, null) {
        println("Criou uma fruta só com nome")
    }
}
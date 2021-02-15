package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Wesley"
    var cpf: String = "123.345.678-9"
}

fun main(){
    var wesley = Pessoa()

    println("O nome é "+  wesley.nome)

    println("O CPF é " + wesley.cpf)

}
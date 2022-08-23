import encap.Cliente
import companionobject.listaDeCompras

fun main() {
    /*
    1. Cria uma Classe Cliente, contendo os atributos encapsulados,
    um construtor padrão e pelo menos mais duas opções de construtores
    conforme sua percepção, com os atributos:
    nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
     Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
     */
        try {
            println("***************************************************")
            println("***************Cadastro de cliente!****************")
            println("***************************************************")
            println()
            print("Digite o nome do cliente: ")
            val nome = readln()
            print("Digite o endereço do cliente: ")
            val endereco = readln()
            print("Digite o telefone do cliente: ")
            val telefone = readln()

            var cliente1 = Cliente(
                nome, endereco, telefone
            )

            while (true) {
                println("***************************************************")
                println("********** - Lista de compras de $nome - **********")
                println("***************************************************")
                println()
                println("1 - Para adicionar itens a lista de compras! ")
                println("2 - Para remover itens da lista de compras! ")
                println("3 - Para exibir todos os itens da lista de compras! ")
                println("4 - Para sair do menu! ")
                println()
                println("Opção: ")

                when (readln().toInt()) {
                    1 -> {
                        println("Digite o item que deseja adicionar: ")
                        var produto = readln()
                        listaDeCompras.addItem(produto)
                    }
                    2 -> {
                        println("Digite o nome do produto que deseja remover: ")
                        var produto = readln()
                        listaDeCompras.removeItem(produto)
                    }
                    3 -> listaDeCompras.mostrarItem()
                    4 -> break
                }
            }
        } catch (e: Exception){
        println("Opção inválida, tente novamente! ")
        }
    }

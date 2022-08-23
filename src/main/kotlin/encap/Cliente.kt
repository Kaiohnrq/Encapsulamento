package encap

class Cliente(
    var nome: String,
    var endereco: String,
    var telefone: String,
) {

    init{
        checarDados()
    }

    fun checarDados() {
        if (nome == "" || endereco == "" || telefone == "") {
            throw Exception("Cliente cadastrado de maneira incorreta, todos campos são obrigatórios! ")
        }
    }


}
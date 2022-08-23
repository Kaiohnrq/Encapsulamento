package companionobject


    object listaDeCompras{

    private var listaDeCompras = mutableListOf<String>("Arroz", "Feijão", "Óleo")

    fun addItem(produto: String){
        listaDeCompras.add(produto)
        println("Voce adicionou o $produto da lista de compras! ")
    }

    fun removeItem(produto: String){
        if(listaDeCompras.contains(produto)) {
            listaDeCompras.remove(produto)
            println("Voce removeu o $produto da lista de compras! ")
        } else {
            println("$produto não existe na lista de compras! ")
        }
    }

    fun mostrarItem(){
        listaDeCompras.forEach{
            println(it)
        }
    }


}
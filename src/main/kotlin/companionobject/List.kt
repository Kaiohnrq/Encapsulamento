package companionobject


    object listaDeCompras{

    private var _listaDeCompras = mutableListOf<String>()
    var listaCompras: List <String> = _listaDeCompras

    fun addItem(produto: String){
        _listaDeCompras.add(produto)
        println("Voce adicionou o $produto da lista de compras! ")
    }

    fun removeItem(produto: String){
        if(_listaDeCompras.contains(produto)) {
            _listaDeCompras.remove(produto)
            println("Voce removeu o $produto da lista de compras! ")
        } else {
            println("$produto não existe na lista de compras! ")
        }
    }

    fun mostrarItem(){
        _listaDeCompras.forEach{
            println(it)
        }
    }


}
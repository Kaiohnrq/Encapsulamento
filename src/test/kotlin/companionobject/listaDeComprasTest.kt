package companionobject

import encap.Cliente
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class listaDeComprasTest {


    var cliente = Cliente(
        "Kaio",
        "merere",
        "92312039"
    )

    @BeforeEach
    fun adicionarListaTest() {
        listaDeCompras.addItem("Arroz")
        listaDeCompras.addItem("Feijão")
        listaDeCompras.addItem("Margarina")
    }

    @Test
    fun addItemTest() {
        assertEquals(3, listaDeCompras.listaCompras.size)
    }

    @Test
    fun removeItemTest(){
        listaDeCompras.removeItem("Arroz")

        assertEquals(2, listaDeCompras.listaCompras.size)
        assertFalse(listaDeCompras.listaCompras.contains("Arroz"))
    }

}



enum class TipoOrdenador{
    BASICO, OFIMATICA, TODOTERRENO, GAMING
}





open class Articulo(var nombre: String, var precio: Double) {

    companion object {
        private var totalArticulos = 0

        private fun generarId(): Int {
            return ++totalArticulos
        }
    }

    protected val id: Int = generarId()

    fun mostrarInfo() {
        println("Artículo ID: $id, Nombre: $nombre, Precio: $precio")
    }



    open fun promocionNavidad(porcentajeRebaja: Double){
        if (porcentajeRebaja > 0 || porcentajeRebaja < 100){
            precio -= precio * (porcentajeRebaja / 100)
        } else{
            println("El porcentaje no puede ser ni  inferior a 0 ni superior a 100")
        }
    }




    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}$ (ID: $id)"
    }
}



class Ordenador(nombre: String, precio: Double, val tipoOrdenador: TipoOrdenador = TipoOrdenador.BASICO): Articulo(nombre, precio){

    override fun promocionNavidad(porcentajeRebaja: Double){
        if (precio > 500){
            super.promocionNavidad(porcentajeRebaja)
        }
    }


    override fun toString(): String {
        return "$nombre ($tipoOrdenador) - %.2f€ (ID: $id)".format(precio)
    }
}




fun main() {

    val articulo1 = Articulo("Cuaderno", 25.0)
    val articulo2 = Articulo("Lámpara", 45.0)


    val ordenador1 = Ordenador("PC Gamer", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("PC Oficina", 399.99, TipoOrdenador.BASICO)


    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)


    println("\n***Precios antes de la promoción***")
    articulos.forEach { println(it) }

    println("\n***Aplicando promoción del 10%***")
    articulos.forEach { it.promocionNavidad(10.0) }


    println("\n***Precios después de la promoción***")
    articulos.forEach { println(it) }
}





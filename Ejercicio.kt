
class Articulo(var nombre: String, var precio: Double) {

    companion object {
        private var totalArticulos = 0

        private fun generarId(): Int {
            return ++totalArticulos
        }
    }

    private val id: Int = generarId()

    fun mostrarInfo() {
        println("Artículo ID: $id, Nombre: $nombre, Precio: $precio")
    }

    fun promocionNavidad(porcentajeRebaja: Double){
        if (porcentajeRebaja < 0 || porcentajeRebaja > 100){
            precio -= precio * (porcentajeRebaja / 100)
        } else{
            println("El porcentaje no puede ser ni  inferior a 0 ni superior a 100")
        }
    }


    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}$ (ID: $id)"
    }
}



class Ordenador()





/**
 * Interfaz que define métodos para interactuar con la consola.
 */
interface IConsola{
    fun mostrar(mensage: String, newLine: Boolean = true)
    fun leerNum(msj: String, newLine: Boolean): Int?

}

class Consola: IConsola {

    /**
     * Muestra un mensaje en la consola.
     * @param mensage El mensaje a mostrar.
     * @param newLine Indica si se debe imprimir el mensaje en una nueva linea.
     */
    override fun mostrar(mensage: String, newLine: Boolean) {
        if (!newLine) print(mensage) else println(mensage)
    }


    /**
     * Lee un número desde la consola.
     * @param msj El mensaje a mostrar antes de leer el número.
     * @param newLine Indica si se debe imprimir el mensaje en una nueva linea.
     * @return El número leído, o null si no se pudo convertir a un entero.
     */
    override fun leerNum(msj: String, newLine: Boolean): Int? {
        mostrar(msj, newLine)
        return readln().toIntOrNull()
    }
}
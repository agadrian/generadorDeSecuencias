/**
 * Interfaz que define un generador de secuencias.
 */
interface IGeneradorSecuencia{
    var sec: Sequence<String>
    fun lineSequence(limit: Int = Int.MAX_VALUE): Sequence<String>
    fun fraseIncremental(numPalabras: Int)
    fun fraseFinal(numPalabras: Int)
    fun getSec(): String
    fun mostrarSec()

}


/**
 * Implementación de [IGeneradorSecuencia] que utiliza una instancia de [IConsola] para mostrar información en la consola.
 * @property gestorConsola Instancia de [IConsola] para interactuar con la consola.
 */
class GeneradorSecuencia(private val gestorConsola: IConsola): IGeneradorSecuencia {
    override lateinit var sec: Sequence<String>

    private var frase = ""

    /**
     * Genera una secuencia de líneas de entrada.
     * @param limit El número máximo de líneas a leer.
     * @return Una secuencia de strings representando las líneas de entrada.
     */
    override fun lineSequence(limit: Int ) = generateSequence { readln() }.constrainOnce().take(limit)


    /**
     * Genera una frase incremental basada en la secuencia de entrada.
     * @param numPalabras El número de palabras que compondrán la frase.
     */
    override fun fraseIncremental(numPalabras: Int) {
        sec = lineSequence(numPalabras)


        //Añade espacio si no esta vacia
        sec.forEach {palabra ->
            frase+= if (frase.isEmpty()) palabra else " $palabra"
            gestorConsola.mostrar(frase)
        }

    }


    /**
     * Genera una frase final basada en la secuencia de entrada.
     * @param numPalabras El número de palabras que compondrán la frase.
     */
    override fun fraseFinal(numPalabras: Int) {
        sec = lineSequence(numPalabras)
        mostrarSec()
    }


    /**
     * Obtiene la secuencia completa como una sola cadena.
     * @return La secuencia completa como una cadena.
     */
    override fun getSec() = sec.toList().joinToString(" ")


    /**
     * Muestra la secuencia completa en la consola.
     */
    override fun mostrarSec() {
        gestorConsola.mostrar(frase)
    }


}
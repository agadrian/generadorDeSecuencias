
interface IGeneradorSecuencia{
    var sec: Sequence<String>
    fun lineSequence(limit: Int = Int.MAX_VALUE): Sequence<String>
    fun fraseIncremental(numPalabras: Int)
    fun faseFinal(numPalabras: Int)
    fun getSec(): String
    fun mostrarSec()

}

class GeneradorSecuencia(private val gestorConsola: IConsola): IGeneradorSecuencia {
    override lateinit var sec: Sequence<String>

    override fun lineSequence(limit: Int ) = generateSequence { readln() }.constrainOnce().take(limit)

    override fun fraseIncremental(numPalabras: Int) {
        sec = lineSequence(numPalabras)
        var frase = ""

        //Añade espacio si no esta vacia
        sec.forEach {palabra ->
            frase+= if (frase.isEmpty()) palabra else " $palabra"
        }
    }

    override fun faseFinal(numPalabras: Int) {
        sec = lineSequence(numPalabras)
        mostrarSec()
    }

    override fun getSec() = sec.toList().joinToString { " " }

    override fun mostrarSec() {
        gestorConsola.mostrar(getSec())
    }


}
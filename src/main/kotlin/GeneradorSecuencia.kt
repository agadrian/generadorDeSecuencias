
interface IGeneradorSecuencia{
    var sec: Sequence<String>
    fun lineSequence(limit: Int): Sequence<String>

}

class GeneradorSecuencia(val gestorConsola: IConsola): IGeneradorSecuencia {
    override lateinit var sec: Sequence<String>

    override fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readlnOrNull() }.constrainOnce().take(limit)


    fun fraseIncremental(numPalabras: Int){

    }
}
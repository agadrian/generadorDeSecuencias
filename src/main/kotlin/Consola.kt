///

interface IConsola{
    fun mostrar(mensage: String, newLine: Boolean = true)
    fun leerNum(msj: String): Int?

}

class Consola: IConsola {


    override fun mostrar(mensage: String, newLine: Boolean) {
        if (!newLine) print(mensage) else println(mensage)
    }

    override fun leerNum(msj: String): Int? {
        mostrar(msj)
        return readln().toIntOrNull()
    }
}
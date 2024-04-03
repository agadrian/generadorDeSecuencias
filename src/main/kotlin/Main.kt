
fun main(args: Array<String>) {
    val consola = Consola()
    val generadorSecuencia = GeneradorSecuencia(consola)
    val menu = Menu(generadorSecuencia, consola)

    menu.menuPrincipal()

}
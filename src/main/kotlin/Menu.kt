class Menu(private val generadorSecuencia: IGeneradorSecuencia, private val gestorConsola: IConsola) {

    /**
     * Función interna para pedir una opción dentro de un rango específico.
     * @param min El valor mínimo permitido.
     * @param max El valor máximo permitido.
     * @return La opción seleccionada por el usuario.
     */
    private fun pedirOpcion(min: Int, max: Int) : Int{
        var opcion: Int

        do {
            gestorConsola.mostrar("Introduce opcion -> ", false)
            opcion = readln().toIntOrNull() ?:-1

            if (opcion == -1){
                gestorConsola.mostrar("Opcion no valida. ", false)
            } else if (opcion !in min..max) {
                gestorConsola.mostrar("Opcion fuera de rango. ", false)
            }
        } while (opcion !in min..max)
        return opcion
    }



    /**
     * Función que muestra y gestiona el menú principal.
     */
    fun menuPrincipal(){
        

        var opc: Int
        do {
            imprimirMenuPrincipal()
            opc = pedirOpcion(1,4)

            when (opc){
                1 -> {
                    val numero: Int?



                }                }
                2 -> 
                3 -> 
                4 -> 
            }
        }while (opc != 4)
    }

    /**
     * Función interna para imprimir las opciones del menú principal.
     */
    private fun imprimirMenuPrincipal(){
        gestorConsola.mostrar("\n")
        gestorConsola.mostrar("1.- ")
        gestorConsola.mostrar("2.- ")
        gestorConsola.mostrar("3.- ")
        gestorConsola.mostrar("4.- ")
    }
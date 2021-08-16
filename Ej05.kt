/* 5) Realizar los cálculos necesarios para incrementar un pago en efectivo sabiendo que
en cantidad de cuotas se incrementa de la siguiente forma:
a) Efectivo/1 cuota 0%
b) 2 cuotas 0%
c) 3 cuotas 5%
d) 4 a 6 cuotas 10%
e) 7 a 9 cuotas 15%
f) 10 a 12 cuotas 18%
g) 13 a 18 cuotas 24% */

fun main() {

//*********** Ingreso del monto por teclado *******************

    print("\nIngrese el monto en pesos a calcular: ")
    val monto: Float = readLine()!!.toFloat()

//*********** Calculo de las cuotas ***************************

    val cu2: Float = (monto / 2)
    val cu3: Float = ((((monto * 5) /100) + monto) / 3)
    val cu4: Float = ((((monto * 10) /100) + monto) / 4)
    val cu5: Float = ((((monto * 10) /100) + monto) / 5)
    val cu6: Float = ((((monto * 10) /100) + monto) / 6)
    val cu7: Float = ((((monto * 15) /100) + monto) / 7)
    val cu8: Float = ((((monto * 15) /100) + monto) / 8)
    val cu9: Float = ((((monto * 15) /100) + monto) / 9)
    val cu10: Float = ((((monto * 18) /100) + monto) / 10)
    val cu11: Float = ((((monto * 18) /100) + monto) / 11)
    val cu12: Float = ((((monto * 18) /100) + monto) / 12)
    val cu13: Float = ((((monto * 24) /100) + monto) / 13)
    val cu14: Float = ((((monto * 24) /100) + monto) / 14)
    val cu15: Float = ((((monto * 24) /100) + monto) / 15)
    val cu16: Float = ((((monto * 24) /100) + monto) / 16)
    val cu17: Float = ((((monto * 24) /100) + monto) / 17)
    val cu18: Float = ((((monto * 24) /100) + monto) / 18)

//++++++++++ Imprime en pantalla el resultado ******************

    println("\nLos montos por pago en efectivo o en cuotas son: ")
    println("\nEfectivo o en 1 cuota: $monto\n" +
            "En 2 cuotas de: $cu2\n" +
            "En 3 cuotas de: $cu3\n" +
            "En 4 cuotas de: $cu4\n" +
            "En 5 cuotas de: $cu5\n" +
            "En 6 cuotas de: $cu6\n" +
            "En 7 cuotas de: $cu7\n" +
            "En 8 cuotas de: $cu8\n" +
            "En 9 cuotas de: $cu9\n" +
            "En 10 cuotas de: $cu10\n" +
            "En 11 cuotas de: $cu11\n" +
            "En 12 cuotas de: $cu12\n" +
            "En 13 cuotas de: $cu13\n" +
            "En 14 cuotas de: $cu14\n" +
            "En 15 cuotas de: $cu15\n" +
            "En 16 cuotas de: $cu16\n" +
            "En 17 cuotas de: $cu17\n" +
            "En 18 cuotas de: $cu18")

    println("\nFin del programa!!!")

}
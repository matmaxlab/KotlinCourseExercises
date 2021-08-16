/* 4) Se pide realizar el siguiente cálculo, el cual permite saber cuanto es el total a pagar
de 10000 si se incrementa en un 18 por ciento de interés, hallar el valor total. */

fun main() {

    val totincrem: Float = (10000 + (10000 * 0.18)).toFloat()

    print("\nEl incremento total del 18% aplicado a 10000 es = $totincrem\n")

}
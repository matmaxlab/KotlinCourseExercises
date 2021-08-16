/* 10) Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la
cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador. */

fun main() {

    print("\nIngrese el precio del producto: ")
    val preciouni: Float = readLine()!!.toFloat()
    print("Ingrese la cantidad del producto: ")
    val cant: Int = readLine()!!.toInt()

    val totabonar: Float = (preciouni * cant)

    print("\nEl total a abonar es de: $ $totabonar\n")

}
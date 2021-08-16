/* 20) Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de
ellos. */

fun main() {

    print("\nIngrese el primer número entero: ")               //Ingreso por teclado de los 3 números enteros
    val num1: Int = readLine()!!.toInt()
    print("Ingrese el segundo número entero: ")
    val num2: Int = readLine()!!.toInt()
    print("Ingrese el tercer número entero: ")
    val num3: Int = readLine()!!.toInt()

    if(num1 > num2 &&
        num1 > num3) {                                         //Compara e imprime el resultado por pantalla
        print("\nEl primero es el Mayor!!\n")
    }else if(num2 > num1 &&
        num2 > num3) {
        print("\nEl segundo es el Mayor!!\n")
    }else {
        print("\nEl tercero es el Mayor!!\n")
    }

}
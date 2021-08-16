/* 13) Realizar un programa que solicite ingresar dos números enteros distintos y muestre
por pantalla el mayor de ellos (suponemos que el operador del programa ingresa
valores distintos, no valida nuestro programa dicha situación) */

fun main() {

    print("\nIngrese el primer número entero: ")               //Ingreso por teclado de los 2 números enteros
    val num1: Int = readLine()!!.toInt()
    print("Ingrese el segundo número entero: ")
    val num2: Int = readLine()!!.toInt()

    if (num1 > num2){                                          //Compara el Mayor entre los 2 números
        print("\nEl primer número es el Mayor!!!\n")
    }else {
        print("\nEl segundo número es el Mayor!!!\n")
    }
}
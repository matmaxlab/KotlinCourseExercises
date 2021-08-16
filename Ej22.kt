/* 22) Confeccionar un programa que permita cargar un número entero positivo de
hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un
mensaje de error si el número de cifras es mayor. */

fun main() {

    print("\nIngrese un número entero Positivo: ")
    val numpos: Int = readLine()!!.toInt()

    if(numpos > 999) {
        print("\nERROR: El número ingresado es Mayor a 3 cifras!!!\n")
    }else if(numpos in 0..9) {
        print("\nEl número ingresado es de 1 cifra\n")
    }else if(numpos in 10..99) {
        print("\nEl número ingresado es de 2 cifras\n")
    }else {
        print("\nEl número ingresado es de 3 cifras\n")
    }

}
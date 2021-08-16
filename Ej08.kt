/* 8) Realizar la carga de dos números enteros por teclado e imprimir su suma y su
producto. */

fun main() {

    print("\nIngrese el 1° número entero: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el 2° número entero: ")
    val num2 = readLine()!!.toInt()

    val suma: Int = num1 + num2
    val multi: Int = num1 * num2

    println("\nLa suma de $num1 + $num2 = $suma")
    println("La multiplicación de $num1 * $num2 = $multi")

}
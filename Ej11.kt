/* 11) Escribir un programa en el cual se ingresan cuatro números enteros, calcular e
informar la suma de los dos primeros y el producto del tercero y el cuarto. */

fun main() {

    val suma: Int  //Declaro variables suma y multi
    val multi: Int

    print("\nIngrese el primer número entero: ") //Ingreso por teclado de los 4 números enteros
    val num1: Int = readLine()!!.toInt()
    print("Ingrese el segundo número entero: ")
    val num2: Int = readLine()!!.toInt()
    print("Ingrese el tercer número entero: ")
    val num3: Int = readLine()!!.toInt()
    print("Ingrese el cuarto número entero: ")
    val num4: Int = readLine()!!.toInt()

    suma = num1 + num2                          //Operaciones de suma y multiplicación
    multi = num3 * num4

    println("\nLa suma de $num1 + $num2 = $suma")           //Se imprimen por pantalla los resultados
    println("La multiplicación de $num3 * $num4 = $multi")

}
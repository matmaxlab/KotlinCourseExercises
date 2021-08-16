/* 12) Realizar un programa que lea por teclado cuatro valores numéricos enteros e
informar su suma y promedio. */

fun main() {

    val suma: Int                                              //Declaro variables suma y prom

    print("\nIngrese el primer número entero: ")               //Ingreso por teclado de los 4 números enteros
    val num1: Int = readLine()!!.toInt()
    print("Ingrese el segundo número entero: ")
    val num2: Int = readLine()!!.toInt()
    print("Ingrese el tercer número entero: ")
    val num3: Int = readLine()!!.toInt()
    print("Ingrese el cuarto número entero: ")
    val num4: Int = readLine()!!.toInt()

    suma = num1 + num2 + num3 + num4                           //Operaciones de suma y promedio
    val prom: Float = (suma / 4).toFloat()

    println("\nLa suma de los 4 valores es = $suma")           //Se imprimen por pantalla los resultados
    println("El promedio de los 4 valores es = $prom")

}
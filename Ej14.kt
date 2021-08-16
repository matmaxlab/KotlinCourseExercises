/* 14) Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo
calcular la suma y la resta, luego mostrarlos, sino calcular el producto y la división. */

fun main() {

    print("\nIngrese el primer número entero: ")               //Ingreso por teclado de los 2 números enteros
    val num1: Int = readLine()!!.toInt()
    print("Ingrese el segundo número entero: ")
    val num2: Int = readLine()!!.toInt()

    if (num1 > num2){                                          //Compara el mayor y ejecuta la operación
        val suma: Int = num1 + num2
        val resta: Int = num1 - num2
        println("\nLa suma de $num1 + $num2 = $suma")
        println("La resta de $num1 - $num2 = $resta")
    }else {
        val mult: Int = num1 * num2
        val divi: Float = (num1 / num2).toFloat()
        println("\nLa multiplicación de $num1 * $num2 = $mult")
        println("La división de $num1 / $num2 = $divi")
    }

}
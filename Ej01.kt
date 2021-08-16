/* 1) Hacer un diagrama de flujo para realizar la siguiente tarea, donde se debe ingresar
comúnmente 2 números y realizar la operación de adición (suma), resta,
multiplicación y división para el mismo ejemplo 3+4=27 */

fun main() {

    val suma: Int                                               //Declaro variables
    val resta: Int
    val mult: Int
    val divi: Float

    print("\nIngrese el primer número: ")                       //Ingreso por teclado
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()

    suma = num1 + num2                                          //Operaciones matemáticas
    resta = num1 - num2
    mult = num1 * num2
    divi = (num1 / num2).toFloat()

    println("\nLa suma de $num1 y $num2 es = $suma")            //Muestra resultados por pantalla
    println("La resta de $num1 y $num2 es = $resta")
    println("La multiplicación de $num1 y $num2 es = $mult")
    println("La división de $num1 y $num2 es = $divi\n")

}
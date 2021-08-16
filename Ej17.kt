/* 17) Ingresar por teclado un valor entero. Almacenar en otra variable el cuadrado de
dicho número si el valor ingresado es par, en caso que sea impar guardar el cubo.
Mostrar además un mensaje que indique si se calcula el cuadrado o el cubo. */

fun main() {

    print("\nIngrese un número entero: ")                       //Ingreso por teclado del número entero
    val num: Int = readLine()!!.toInt()

    if(num%2 == 0) {                                            //Compara si el número es divisible por 2 y el resto es cero
        val cuad: Int = num * num
        print("\nEl cuadrado del número $num es = $cuad\n")     //Si es par, calcula el cuadrado
    }else {
        val cubo: Int = num * num * num                         //Si es impar, calcula el cubo
        print("\nEl cubo del número $num es = $cubo\n")
    }

}
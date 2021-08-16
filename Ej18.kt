/* 18) Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra
variable la cantidad de dígitos que tiene el valor ingresado por teclado. Mostrar la
cantidad de dígitos del número ingresado por teclado. */

fun main() {

    print("\nIngrese un número entero: ")                   //Ingreso del número por teclado
    val num: Int = readLine()!!.toInt()

    val dig: Char = if(num in 1..9) {                       //Compara si es de 1 o 2 digitos
        '1'
    }else {
        '2'
    }

    print("\nEl número ingresado tiene $dig dígitos\n")     //Imprime el resultado por pantalla

}
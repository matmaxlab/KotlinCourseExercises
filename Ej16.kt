/* 16) Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un
mensaje indicando si el número tiene uno o dos dígitos. (Tener en cuenta que
condición debe cumplirse para tener dos dígitos, un número entero) */

fun main() {

    print("\nIngrese un número entre 1 y 99: ")             //Ingreso por teclado un número entre 1 y 99
    val num: Int = readLine()!!.toInt()

    if(num >=1 && num < 10) {                               //Compara e imprime el resultado en pantalla
        print("\nEl número ingresado es de 1 dígito\n")
    }else {
        print("\nEl número ingresado es de 2 dígitos\n")
    }

}
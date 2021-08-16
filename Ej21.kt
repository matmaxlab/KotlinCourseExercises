/* 21) Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el
número es positivo, nulo o negativo. */

//Consultar al profe por tratamiento de Null??

fun main() {

    val num: Int?

    print("\nIngrese un número entero: ")
    num = readLine()!!.toInt()

    if(num < 0) {
        print("\nEl número es NEGATIVO\n")
    }else if(num > 0) {
        print("\nEl número es POSITIVO\n")
    }else {
        print("\nEl número es NULO\n")
    }

}
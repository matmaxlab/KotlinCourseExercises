/* 9) Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del
mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por
cuatro) */

fun main() {

    print("\nIngrese la medida de un lado del cuadrado: ") //Ingreso por teclado del lado
    val lado: Float = readLine()!!.toFloat()

    val cuad: Float = lado * 4                             //Cálculo del perímetro

    print("\nEl perímetro del cuadrado es = $cuad\n")      //Imprime el resultado

}
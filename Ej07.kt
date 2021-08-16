/* 7) Definir tres variables inmutables y cargar por asignación los pesos de tres personas
con valores Float. Calcular el promedio de pesos de las personas y mostrarlo. */

fun main() {

//++++++++++++++++++ Ingreso de pesos por teclado +++++++++++++++++++++++++

    print("\nIngrese el peso de la 1° persona: ")
    val peso1 = readLine()!!.toFloat()
    print("Ingrese el peso de la 2° persona: ")
    val peso2 = readLine()!!.toFloat()
    print("Ingrese el peso de la 3° persona: ")
    val peso3 = readLine()!!.toFloat()

//++++++++++++++++++++++ Cálculo del promedio +++++++++++++++++++++++++++++

    val prompeso: Float = ((peso1 + peso2 + peso3) / 3)

//+++++++++++++++++++++++ Imprime el resultado ++++++++++++++++++++++++++++

    print("\nEl promedio de peso de las tres personas es: $prompeso Kg\n")

}
/* 19) Confeccionar un programa que pida por teclado tres notas de un alumno, calcule
el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado". */

fun main() {

    print("\nIngrese la primer nota del alumno: ")             //Ingreso por teclado de las 3 notas
    val nota1: Int = readLine()!!.toInt()
    print("Ingrese la segunda nota del alumno: ")
    val nota2: Int = readLine()!!.toInt()
    print("Ingrese la tercer nota del alumno: ")
    val nota3: Int = readLine()!!.toInt()

    val prom: Float = ((nota1 + nota2 + nota3) / 3).toFloat()  //Calculo el promedio

    if(prom >= 7) {                                            //Compara e imprime el resultado por pantalla
        print("\nPromocionado!!!\n")
    }else if(prom >= 4 && prom < 7) {
        print("\nRegular!!!\n")
    }else {
        print("\nReprobado!!!\n")
    }

}
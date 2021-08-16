/* 15) Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar
un mensaje "Promocionado". */

fun main() {

    val suma: Int                                              //Declaro variables suma y prom

    print("\nIngrese la primer nota del alumno: ")             //Ingreso por teclado de las 3 notas
    val nota1: Int = readLine()!!.toInt()
    print("Ingrese la segunda nota del alumno: ")
    val nota2: Int = readLine()!!.toInt()
    print("Ingrese la tercer nota del alumno: ")
    val nota3: Int = readLine()!!.toInt()


    suma = nota1 + nota2 + nota3                               //Operaciones de suma y promedio
    val prom: Float = (suma / 3).toFloat()

    if(prom >= 7) {                                            //Imprime el resultado por pantalla
        print("\nPromocionado!!!\n")
    }

}
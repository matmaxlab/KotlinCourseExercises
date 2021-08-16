/* 23) Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente
información: cantidad total de preguntas que se le realizaron y la cantidad de
preguntas que contestó correctamente. Se pide confeccionar un programa que
ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de
respuestas correctas que ha obtenido, y sabiendo que:
Nivel máximo: Porcentaje>=90%.
Nivel medio: Porcentaje>=75% y <90%.
Nivel regular: Porcentaje>=50% y <75%.
Fuera de nivel: Porcentaje<50%. */

fun main() {

    print("\nIngrese la cantida de preguntas: ")
    val pregtot: Int = readLine()!!.toInt()
    print("Ingrese cantidad de respuestas correctas: ")
    val correctas: Int = readLine()!!.toInt()

    val portot: Float = ((correctas * 100) / pregtot).toFloat()

    if(portot >= 90) {
        print("\nTotal de correctas: $portot % Nivel Máximo!!!\n")
    }else if(portot >= 75 && portot < 90) {
        print("\nTotal de correctas: $portot % Nivel Medio!!!\n")
    }else if(portot >= 50 && portot < 75) {
        print("\nTotal de correctas: $portot % Nivel Regular!!!\n")
    }else {
        print("\nTotal de correctas: $portot % Fuera de Nivel!!!\n")
    }

}
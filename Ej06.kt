/* 6) Se pide realizar un diagrama el cual se utiliza para calcular los siguientes datos de
un terreno donde el lote es de 50 mts de fondo y 11 de frente, calcular los siguientes
ítems:
a) Perímetro.
b) Superficie.
c) Si tiene que realizar el alambrado para que sea de 5 vueltas al rededor del
terreno, cuantos metros necesita.
d) Sabiendo el perímetro del terreno indique la cantidad de postes que necesita
para alambrar, si estos se colocan cada 3tms. */

fun main() {

    val fondo: Int = 50                 //Declaro variables
    val frente: Int = 11

    val per = (2*fondo) + (2*frente)    //Cálculos
    val sup = fondo * frente
    val alamb = per * 5
    val postes = per / 3

    println("\nLas características y cantidad de material para alambrar un terreno de 50mt de fondo por 11mt de frente son: \n") //Imprime resultado
    println("Perímetro del terreno: $per Mts\n" +
            "Superficie del terreno: $sup Mt2\n" +
            "Cantidad de alambre requido (5 vueltas): $alamb Mts\n" +
            "Cantidad de postes requeridos (cada 3mt): $postes\n")

}
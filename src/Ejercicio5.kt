fun main(){


print(quiniela());

}
//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince
fun quiniela():String{
    var str=""
    for(i in 1..15) {
        for (j in 1..3) {
            str += " | 1 X 2 | "
        }
        str+="\n"
    }
    return str;
}


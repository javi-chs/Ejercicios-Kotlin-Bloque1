fun main(){

    println("La media de los numero introducidos es = "+media());

}
//Escriba un programa que calcule la media de N numéro enteros introducidos.
fun media():Double{
    var siga=true;
    var numeros :IntArray = intArrayOf();
    var cont=0;
    while(siga){
        println("Introduce el siguiente número");
        var item = readLine()!!.toInt();
        var arrayAux =  intArrayOf(item);
        numeros = numeros.plus(arrayAux);
        println("¿Quieres seguir? S-->Si, N-->No");
        var seguimos = readLine();
        if(seguimos == "N"){siga=false;}
        }
    var res = calcMedia(numeros);
    return res;
}
fun calcMedia(numeros:IntArray):Double{
    var suma =0.0;
    for(i in numeros){
        suma += i;
    }
    var resultado :Double = suma/numeros.size

    return resultado;
}
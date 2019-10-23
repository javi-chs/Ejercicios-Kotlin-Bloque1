//Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
// Emplear el operador "%" en la condición de la estructura condicional
fun main(){
    var lista = getNumbers();
    paresImpares(lista);
}
fun getNumbers():IntArray{
    var fin = false;
    var lista = intArrayOf();
    while(!fin){
        println("Introduce el siguiente numero");
        val numero = readLine()!!.toInt();
        lista = lista.plus(numero)
        println("Quieres introducir mas numeros? S->Ni, N->No");
        val acabo = readLine();
        if(acabo == "N"){fin=true;} //Si le pongo === no me coge la N como String?
    }
    return lista;
}

fun paresImpares(lista:IntArray){
    var contarPares=0;
    var contarImpares=0;
    for(i in lista){
        if(i%2==0){contarPares++}
        else{contarImpares++}
    }
    println("Cantidad de impares : $contarImpares");
    println("Cantidad de pares : $contarPares");
}
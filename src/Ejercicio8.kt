//Realizar un programa que permita cargar dos listas de 5 valores cada una. Informar con un mensaje cual de las dos
// listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
// Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo
fun main(){

}

fun comparaListas(a:IntArray, b:IntArray){
    var contA=0;
    var contB=0;
    for(i in a){
        contA+=i;
    }
    for(i in b){
        contB+=i;
    }
    if(contA<contB){
        println("Lista 1 es mayor");
    }
    else if(contB<contA){println("Lista 2 es mayor"); }
         else{println("Son iguales")}
}
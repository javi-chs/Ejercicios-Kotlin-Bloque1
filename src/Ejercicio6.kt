import java.lang.Integer.parseInt

//Realizar la carga de la cantidad de hijos de 10 familias. Contar cuantos tienen 0,1,2 o más hijos. Imprimir dichos contadores
fun main(){

    var familias = getFamilias()
    cuentaHijos(familias);

}
fun getFamilias():IntArray{
    var lista :IntArray = intArrayOf() ;
    for(i in 1..10){
        println("Cuantos hijos hay en tu familia");
        val hijos = readLine()!!.toInt();
        lista = lista.plus(hijos);
    }
    return lista;
}
fun cuentaHijos(list:IntArray){
    var cont0=0;
    var cont1=0;
    var cont2=0;
    var cont3=0;
    for(i in list){
        if(i==0){cont0++}
        if(i==1){cont1++}
        if(i==2){cont2++}
        if(i>=3){cont3++}
    }
    println("Hay $cont0 familias con cero hijos");
    println("Hay $cont1 familias con un hijo");
    println("Hay $cont2 familias con dos hijos");
    println("Hay $cont3 familias con 3 o más hijos");

}
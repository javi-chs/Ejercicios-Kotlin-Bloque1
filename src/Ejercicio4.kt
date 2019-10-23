fun main(){
var res = fibonacci(50);
    for (i in res){print("$i ")}
}
//Cree un programa que a partir de un entero calcule su serie Fibonacci
fun fibonacci(num:Int):IntArray{
    var resultado :IntArray = intArrayOf(0);
    var sig=1;
    var ant = 0;
    var auxiliar=0;
    while (sig <num){
        var aux = intArrayOf(sig); //[2]
        resultado= resultado.plus(aux);//[0,1,1,2,3]
        auxiliar = ant; //1
        ant=sig //2
        sig = sig + auxiliar; //3
    }
    return resultado;


}
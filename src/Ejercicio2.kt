fun main(){
   kbitsToMBytes();
}
//Realizar un programa que no pida un unidad en kb y nos haga la conversión a MB
// 1 Byte son 8 bits
// 1 MB son 1000 kbytes

fun kbitsToMBytes(){
    println("Indicanos la cantidad de kbites");
    var kbites = readLine()!!.toInt();
    var res = 0.0;
    var bytes :Double = kbites / 8.0;
    res = bytes/1000;
    println("$kbites kbits son $res MBytes");
}
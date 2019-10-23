fun main(){
    print("Altura del arbol?");
    var altura = readLine()!!.toInt();
    var arbol = getTree(altura);
    println(arbol);
}
fun getTree(alt:Int):String{
    var long= (alt*2)-1;
    var ast=1
    var str="";
    var numEspacios = (long - ast)/2;
    for(i in  1..alt){

        for(k in 1..numEspacios){
                str+=" ";

            }
        for(k in 1..ast){
            str+="*";

        }
        for(k in 1..numEspacios){
            str+=" ";

        }
        str+="\n"
        ast += 2;
        numEspacios = (long - ast)/2;
    }
    return str;
}
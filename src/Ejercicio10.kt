//Crea una aplicación que nos pida la altura de la silla y nos dibuje por pantalla una silla con *.
// La única restricción que no debe ser menor de 7 ni mayor de 30 y la condición de que el asiento este situado la mitad + 1
fun main(){
printChair();
}
fun printChair(){
    var fin=false;
    while(!fin){
        println("Introduce la altura");
        var altura= readLine()!!.toInt();
        if(altura>=7 && altura<=30){
            var respaldo=(altura/2);
            var asiento= respaldo+1
            var resto = respaldo -1;
           if(altura%2!=0){respaldo +=1 }
            for(i in 1..respaldo){println("*")}
            for(i in 1..asiento){print("*")}
            println();
            for(i in 1..resto){
                var patas = "";
                for (i in 1..asiento){
                    if(i==1 || i==asiento){patas+="*"}
                    else{patas+=" "}
                }
                println(patas);
            }


            fin=true;
        }
        else{
            println("Valor de altura fuera de rango, rango = [7,30]");
        }
    }

}
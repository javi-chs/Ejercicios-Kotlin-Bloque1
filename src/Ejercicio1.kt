fun main(){
    println(ejercicio1(1998));



}
//Escriba un método que imprima la representación de su parámetro entero en números romanos.
// Por ejemplo, si el parámetro es 1998, la salida debe ser M CM XC VIII
fun  ejercicio1(numero:Int):String{
    var resultado = "";
    var millares = numero/1000;
    var centenas = (numero%1000)/100;
    var decenas = (numero - (millares*1000) - (centenas*100))/10;
    var unidades= (numero - (millares*1000) - (centenas*100) - (decenas*10));
    resultado = millares(millares);
    resultado += centenas(centenas);
    resultado += decenas(centenas);
    resultado+= unidades(unidades);
    return resultado;
}

fun millares(num:Int):String{
    var str = ""
    for(i in 1..num){str+="M"}
    return str;
}
fun centenas(centenas:Int):String{
    var str=""
    if(centenas!=9 && centenas!=4){
        if(centenas>=5){
            var cant = centenas -5;
            var aux = "D"
            for(i in 1..cant){aux+="C"} //centenas = 5,6,7,8
            str+=aux;
        }
        else{
            for(i in 1..centenas){str+="C"}// centenas = 0,1,2,3
        }
    }
    else{
        if(centenas==9){str="CM"} else{str="CD"} //centenas=9,4
    }
    return str;
}


fun decenas(decenas:Int):String{
    var str = "";
    if(decenas!=9 &&  decenas !=4){
        if(decenas >= 5){
            var cant = decenas -5;
            var aux = "L"
            for(i in 1..cant){aux+="X"} //decenas = 5,6,7,8
            str=aux;
        }
        else{
            for(i in 1..decenas){str+="X"}//decenas = 1,2,3
        }

    }
    else{
        if(decenas == 9){str="XC"} else{str="XL"}//decenas = 9,4
    }
    return str;
}



fun unidades(unidades:Int):String{
    var str = "";
    if(unidades!=9 &&  unidades !=4){
        if(unidades >= 5){
            var cant = unidades -5;
            var aux = "V"
            for(i in 1..cant){aux+="I"} //unidades = 5,6,7,8
            str=aux;
        }
        else{
            for(i in 1..unidades){str+="I"}//unidades = 1,2,3
        }

    }
    else{
        if(unidades == 9){str="IX"} else{str="IV"}//unidades = 9,4
    }
    return str;
}



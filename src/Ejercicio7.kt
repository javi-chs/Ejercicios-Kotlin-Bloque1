//Escribir un programa que solicite ingresar 10 notas
// de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
fun main(){
var notas = getNotas()
  notasInfo(notas);
}
fun notasInfo(array: IntArray){
    var cntMayor=0;
    var cntMenor=0;
    for(i in array){
        if(i>=7){ cntMayor++; }
        else{ cntMenor++; }
    }
    println("El numero de alumnos que han sacado más de 7 es $cntMayor");
    println("El numero de alumnos que han sacado menos de 7 es $cntMenor");
}
fun getNotas():IntArray{
    var notas :IntArray =
        intArrayOf();
    var cont=0;
    var nota=0;
    while(cont>10) {
        println("Nota de alumno  $cont");
         nota = readLine()!!.toInt();
        notas.plus(nota);
        cont++;
    }
    return notas;
}
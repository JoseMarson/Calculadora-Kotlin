import java.lang.StringBuilder
import kotlin.math.pow
fun main(){
    println("Insira a string ")
    var x= readLine();
    x?.let{
        calc(x)

    }
}
fun calc(x:String){
    var y=x.length
    var frase = StringBuilder()
    for(i in x){
        if(i=='a'|| i=='A'){
            frase.append('x')
        }
        else{
            frase.append(i)
        }
    }
    println(frase)
}
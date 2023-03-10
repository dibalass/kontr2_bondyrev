import java.lang.Exception
import kotlin.coroutines.*

suspend fun main() {
    var examen=Exam("Бондырев","РМП", 3,4)
    examen.fun1()
    var n: Int
    println("введи к-во повторений N")
    while(true) {
        try {
            n = readLine()!!.toInt()
            if(n<1)
                println("введи число больше 0")
            else
                break
        } catch (e: Exception) {
            println("ошибка введи число больше 0")
        }
    }
    for (i in 1..n){
        examen.fun2(n)
    }
}
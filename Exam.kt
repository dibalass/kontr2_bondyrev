import kotlin.coroutines.*
class Exam (studentFIO:String, subject:String, data:Int, mark:Int):AbsractExam(studentFIO, subject, data, mark)
{
    override suspend fun fun2(n: Int) {
        runBlocking {
            repeat(n){
                launch {
                    delay(1000)
                    while (true) {
                        println("Введи номер месяца")
                        data = readLine()!!.toInt()
                        if(data>12||data<1)
                            println("введи номер месяца от 1 до 12")
                    }
                    when (data) {
                        in 7..12 ->  println("зимняя сессия скоро")
                        in 1..6-> println("летняя сессия скоро")
                    }
                }
            }
        }
    }
}
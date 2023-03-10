import kotlin.coroutines.*

abstract class AbsractExam(var studentFIO:String, var subject:String,var data_month:Int,var mark:Int):InterFace{
    override suspend fun fun1() {
        delay(5000)
        println("Студент - $studentFIO" +
                "\nПредмет - $subject" +
                "\nДата экзамена - $data_month" +
                "\nОценка - $mark")
    }
    abstract override suspend fun fun2(n: Int)
}
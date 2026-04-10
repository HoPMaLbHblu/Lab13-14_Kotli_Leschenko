import javax.management.monitor.StringMonitor

class Question <T>(
    val questionText:String,
    val answer: T,
    val difficulty: String
)

fun main(){
    val question1= Question<String>(
        "речка спятила с ума - по домам пошла сама",
        "водопровод",
        "medium"
    )
    val question2 = Question<Boolean>(
        "Небо зеленое. правда или ложь",
        false,
        "easy"
    )
    val question3 = Question<Int>(
        "Сколько дней между полнолуниями",
        28,
        "hard"
    )
    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}
import javax.management.monitor.StringMonitor

class Question <T>(
    val questionText:String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty{
    EASY,
    MEDIUM,
    HARD
}

fun main(){
    val question1= Question<String>(
        "речка спятила с ума - по домам пошла сама",
        "водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        "Небо зеленое. правда или ложь",
        false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        "Сколько дней между полнолуниями",
        28,
        Difficulty.HARD
    )
    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}
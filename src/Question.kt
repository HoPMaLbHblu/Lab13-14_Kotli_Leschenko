import javax.management.monitor.StringMonitor

data class Question <T>(
    val questionText:String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty{
    EASY,
    MEDIUM,
    HARD
}

class Quiz: ProgressPrintable{
    override val progressText: String
        get() = "${answered} of ${total} answered"
    val question1= Question<String>(
        "Речка спятила с ума - по домам пошла сама.",
        "водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        "Небо зеленое. правда или ложь",
        false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        "Сколько дней между полнолуниями?",
        28,
        Difficulty.HARD
    )
    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 3
    }
    fun printQuiz(){
        question1.let {
            println(question1.questionText)
            println(question1.answer)
            println(question1.difficulty)
            println()
        }

        question2.let {
            println(question2.questionText)
            println(question2.answer)
            println(question2.difficulty)
            println()
        }

        question3.let {
            println(question3.questionText)
            println(question3.answer)
            println(question3.difficulty)
            println()
        }
    }

}
interface ProgressPrintable{
    val progressText: String
    fun printProgressBar(){
        repeat (Quiz.answered)  {print("▓")}
        repeat (Quiz.total - Quiz.answered)  {print("▒")}
        println()
        println(Quiz.progressText)
    }
}

val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

fun main(){

//    println(question1.toString())
//    println(question2.answer)
//    println(question3.answer)

//    println("${Quiz.answered} of ${Quiz.total} answered")

//    Quiz.printProgressBar()
//    Quiz().printProgressBar()
    Quiz().apply { printQuiz() }
}
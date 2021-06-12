class FizzBuzz {
    companion object {
        const val FIZZ = " ... Fizz ... "
        const val BUZZ = " ... Buzz ... "
    }
    private var message: String = ""

    fun printFizzBuzzValue(value: Int) {
        prepareFizzBuzzMessage(value)
        println(message)
    }

    private fun prepareFizzBuzzMessage(value: Int) {
        message = when {
            isFizz(value) -> FIZZ
            isBuzz(value) -> BUZZ
            isFizz(value) && isBuzz(value) -> FIZZ + BUZZ
            else -> "\t  $value"
        }
    }

    private fun isFizz(value: Int): Boolean {
        return (value % 3 == 0)
    }

    private fun isBuzz(value: Int): Boolean {
        return (value % 5 == 0)
    }
}
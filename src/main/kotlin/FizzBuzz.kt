class FizzBuzz {
    companion object {
        const val FIZZ = " ... Fizz ... "
        const val BUZZ = " ... Buzz ... "
        const val FIZZ_VALUE = 3
        const val BUZZ_VALUE = 5
    }

    fun getFizzBuzzValue(value: Int): String {
        return prepareFizzBuzzMessage(value)
    }

    private fun prepareFizzBuzzMessage(value: Int): String {
        return when {
            isFizz(value) -> FIZZ
            isBuzz(value) -> BUZZ
            isFizz(value) && isBuzz(value) -> FIZZ + BUZZ
            else -> "\t  $value"
        }
    }

    private fun isFizz(value: Int): Boolean {
        return (value % FIZZ_VALUE == 0)
    }

    private fun isBuzz(value: Int): Boolean {
        return (value % BUZZ_VALUE == 0)
    }
}
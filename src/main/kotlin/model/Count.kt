package model

// private constructor issue
data class Count(val amount: Int) {
    fun isPurchasable(money: Money): Boolean = money.amount.toInt() >= amount * LOTTO_PRICE

    fun getAutoCount(money: Money): Int = (money.amount.toInt() - amount * LOTTO_PRICE) / LOTTO_PRICE

    companion object {
        private const val LOTTO_PRICE: Int = 1000

        private const val ERROR_NO_INPUT = "입력이 없습니다."
        private const val ERROR_LESS_THAN_ZERO = "0 이상의 값을 입력해주셔야 합니다."

        fun from(input: String): Count {
            val amount = input.toIntOrNull()
            requireNotNull(amount) { ERROR_NO_INPUT }
            require(amount >= 0) { ERROR_LESS_THAN_ZERO }

            return Count(amount)
        }
    }
}

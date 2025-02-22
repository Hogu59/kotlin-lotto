package model

import java.math.BigDecimal
import java.text.DecimalFormat

class LotterySeller(private val money: Money) {
    init {
        require(money <= MAX_PURCHASE_AMOUNT) { ERROR_EXCEED_MAX_PURCHASE_AMOUNT }
        require(money >= PRICE) { ERROR_LESS_THAN_MIN_PURCHASE_AMOUNT }
    }

    fun exchange(): Money = money % PRICE

    fun getLotteryCount(): Int = (money / PRICE).toInt()

    companion object {
        private const val MIN_PRICE_AMOUNT = 1_000
        private const val MAX_PRICE_AMOUNT = 100_000

        private val decimalFormat = DecimalFormat("#,###")

        private val PRICE = Money(BigDecimal(MIN_PRICE_AMOUNT))
        private val MAX_PURCHASE_AMOUNT = Money(BigDecimal(MAX_PRICE_AMOUNT))

        private val ERROR_EXCEED_MAX_PURCHASE_AMOUNT = "${decimalFormat.format(MAX_PRICE_AMOUNT)}원 이하로만 구매가 가능합니다."
        private val ERROR_LESS_THAN_MIN_PURCHASE_AMOUNT = "${decimalFormat.format(MIN_PRICE_AMOUNT)}원 이상의 금액을 지불해야 합니다."
    }
}

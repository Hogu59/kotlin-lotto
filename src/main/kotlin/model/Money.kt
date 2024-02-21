package model

import java.math.BigDecimal
import java.math.RoundingMode

data class Money(val amount: BigDecimal) : Comparable<Money> {
    operator fun plus(other: Money): Money = Money(this.amount.add(other.amount))
    operator fun minus(other: Money): Money = Money(this.amount.minus(other.amount))
    operator fun times(count: Int): Money = Money(this.amount.times(count.toBigDecimal()))
    operator fun div(other: Money): Double = this.amount.divide(other.amount, 2, RoundingMode.HALF_UP).toDouble()
    operator fun rem(other: Money): Money = Money(this.amount.rem(other.amount))
    override fun compareTo(other: Money): Int = (amount - other.amount).toInt()
}

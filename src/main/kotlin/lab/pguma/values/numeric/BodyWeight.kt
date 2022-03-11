package lab.pguma.values.numeric

@JvmInline
value class BodyWeight(override val value: Double): DecimalNumberValue {
    init {
        require(value >= 0) {"体重は０以上の数値でしか初期化できません"}
    }
}
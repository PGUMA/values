package lab.pguma.values.numeric

@JvmInline
value class Age(override val value: Long): IntegralNumberValue {
    init {
        require(value >= 0) {"年齢は０以上の数値でしか初期化できません"}
    }
}
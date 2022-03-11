package lab.pguma.values.numeric

interface IntegralNumberValue {
    val value: Long
}

inline operator fun <reified T: IntegralNumberValue> T.plus(other: T): T {
    val newValue = value + other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: IntegralNumberValue> T.minus(other: T): T {
    val newValue = value - other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: IntegralNumberValue> T.times(other: T): T {
    val newValue = value * other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: IntegralNumberValue> T.div(other: T): T {
    val newValue = value / other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: IntegralNumberValue> T.compareTo(other: T): Int {
    return value.compareTo(other.value)
}

interface DecimalNumberValue {
    val value: Double
}

inline operator fun <reified T: DecimalNumberValue> T.plus(other: T): T {
    val newValue = value + other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: DecimalNumberValue> T.minus(other: T): T {
    val newValue = value - other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: DecimalNumberValue> T.times(other: T): T {
    val newValue = value * other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: DecimalNumberValue> T.div(other: T): T {
    val newValue = value / other.value
    return T::class.constructors.first().call(newValue)
}

inline operator fun <reified T: DecimalNumberValue> T.compareTo(other: T): Int {
    return value.compareTo(other.value)
}
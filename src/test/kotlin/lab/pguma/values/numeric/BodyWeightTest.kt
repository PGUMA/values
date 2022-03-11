package lab.pguma.values.numeric

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class BodyWeightTest : StringSpec({

    "BodyWeightを正常に加算できること" {
        BodyWeight(50.6) + BodyWeight(5.0) shouldBe BodyWeight(55.6)
    }

    "BodyWeightを正常に減算できること" {
        BodyWeight(60.0) - BodyWeight(7.5) shouldBe BodyWeight(52.5)
    }

    "BodyWeightを正常に乗算できること" {
        BodyWeight(10.0) * BodyWeight(5.0) shouldBe BodyWeight(50.0)
    }

    "BodyWeightを正常に除算できること" {
        BodyWeight(50.0) / BodyWeight(5.0) shouldBe BodyWeight(10.0)
    }

    "BodyWeightを正常に比較できること" {
        (BodyWeight(60.0) > BodyWeight(59.9999)) shouldBe true
        (BodyWeight(60.0) < BodyWeight(59.9999)) shouldBe false
        (BodyWeight(60.0) == BodyWeight(60.00000)) shouldBe true
        (BodyWeight(60.0) == BodyWeight(59.9999)) shouldBe false
    }
})
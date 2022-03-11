package lab.pguma.values.numeric

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class AgeTest : StringSpec({

    "Ageを正常に加算できること" {
        Age(10) + Age(5) shouldBe Age(15)
    }

    "Ageを正常に減算できること" {
        Age(10) - Age(5) shouldBe Age(5)
    }

    "Ageを正常に乗算できること" {
        Age(10) * Age(5) shouldBe Age(50)
    }

    "Ageを正常に除算できること" {
        Age(10) / Age(5) shouldBe Age(2)
    }

    "Ageを正常に比較できること" {
        (Age(30) > Age(29)) shouldBe true
        (Age(30) < Age(29)) shouldBe false
        (Age(30) == Age(30)) shouldBe true
        (Age(30) == Age(29)) shouldBe false
    }

})
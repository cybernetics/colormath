package com.github.ajalt.colormath

import io.kotlintest.assertSoftly
import io.kotlintest.shouldBe
import org.junit.Test

import org.junit.Assert.*
import kotlin.math.PI

class HueColorTest {
    @Test
    fun hueAsRad() = assertSoftly {
        HSL(0, 0, 0).hueAsRad() shouldBe 0f
        HSL(180, 0, 0).hueAsRad() shouldBe PI.toFloat()
        HSL(360, 0, 0).hueAsRad() shouldBe (2 * PI).toFloat()
    }

    @Test
    fun hueAsGrad() = assertSoftly {
        HSL(0, 0, 0).hueAsGrad() shouldBe 0f
        HSL(180, 0, 0).hueAsGrad() shouldBe 200f
        HSL(360, 0, 0).hueAsGrad() shouldBe 400f
    }

    @Test
    fun hueAsTurns() = assertSoftly {
        HSL(0, 0, 0).hueAsTurns() shouldBe 0f
        HSL(180, 0, 0).hueAsTurns() shouldBe .5f
        HSL(360, 0, 0).hueAsTurns() shouldBe 1f
    }
}

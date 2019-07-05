package com.togglr.toggle

import com.togglr.setup.IndependenceDayDiscount
import com.togglr.setup.TestConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [TestConfig::class])
internal class ToggleAspectTest(
        @Autowired val independenceDayDiscount: IndependenceDayDiscount
) {

    @Test
    internal fun `should return 20 percent discount if independence day discount toggle is on`() {
        val discountPercentage = independenceDayDiscount.getDiscountPercentage()

        assertThat(discountPercentage).isEqualTo(20)
    }
}
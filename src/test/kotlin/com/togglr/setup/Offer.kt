package com.togglr.setup

import com.togglr.toggle.Toggle
import org.springframework.stereotype.Component

interface Offer {
    fun getDiscountPercentage(): Int
}

@Component("offer.no-discount")
class NoDiscount: Offer {
    override fun getDiscountPercentage(): Int  = 0
}

@Component("offer.independence-day-discount")
@Toggle(name = AppFeatures.INDEPENDENCE_DAY_DISCOUNT, fallback = "offer.no-discount")
class IndependenceDayDiscount: Offer {
    override fun getDiscountPercentage(): Int  = 20
}

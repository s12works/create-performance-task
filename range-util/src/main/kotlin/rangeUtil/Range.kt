package com.s12works.imageRandomizer.rangeUtil

import com.s12works.imageRandomizer.assertion.enforcers.fail

public data class Range(
    public val minimum: Minimum,
    public val maximum: Maximum
) {
    init {
        com.s12works.imageRandomizer.assertion.assert(
            "Range object illegally specified via (min=${this.minimum}, max=${this.maximum}",
            ::fail
        ) {
            when (listOf(this.minimum, this.maximum).all { it != null } ) {
                true -> this.minimum!! <= this.maximum!!
                false -> true
            }
        }
    }

    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
}

package com.s12works.imageRandomizer.assertion

public data class Assessor(
    public val name: String?,
    public val func: () -> Assessment
) {
    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
}

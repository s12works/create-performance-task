package com.s12works.imageRandomizer.assertion

public data class Receipt(
    public val message: Message,
    public val assessor: () -> Assessment
) {
    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
}

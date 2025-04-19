package com.s12works.imageRandomizer.graphics

public data class Pixel<A>(
    public val position: Position,
    public val association: A
) { 
    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
}

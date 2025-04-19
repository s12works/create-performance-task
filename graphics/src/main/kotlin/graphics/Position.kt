package com.s12works.imageRandomizer.graphics

public data class Position(
    public val xpos: Coordinate,
    public val ypos: Coordinate
) {
    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
}

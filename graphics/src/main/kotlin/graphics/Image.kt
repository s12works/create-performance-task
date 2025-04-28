package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.assertion.assert
import com.s12works.imageRandomizer.assertion.enforcers.fail
import com.s12works.imageRandomizer.graphics.getImageValidationErrorMessage as getErrorMessage
import com.s12works.imageRandomizer.rangeUtil.Range
import com.s12works.imageRandomizer.rangeUtil.contains

public class Image {
    public val resolution: Resolution
    public val pixels: Collection<Pixel<Color>>

    public constructor(
        resolution: Resolution,
        pixels: Collection<Pixel<Color>>,
    ) {
        assert(
            getErrorMessage("size inconsistent with given resolution"),
            ::fail,
            { pixels.size == resolution.width * resolution.length }
        )

        val procPositions = mutableListOf<Position>()
        for (pixel in pixels) {
            assert(
                getErrorMessage("pixel's position, ${pixel.position}, is outside of given resolution, ${resolution}"),
                ::fail,
                {
                    pixel.position.xpos in Range(0, resolution.length) &&
                    pixel.position.ypos in Range(0, resolution.width)
                }
            )

            assert(
                getErrorMessage("duplicate pixel positions processed"),
                ::fail,
                { !(pixel.position in procPositions) }
            )
        }

        this.resolution = resolution
        this.pixels = pixels
    }

    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is Image &&
        this.resolution == other.resolution &&
        this.pixels == other.pixels
    )
}

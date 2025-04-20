package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.assertion.enforcers.fail

public fun getImageFromComp(composition: SimplifiedImageComp, colorGenerator: ColorGenerator): Image {
    val pixels = mutableListOf<Pixel<Color>>()
    var resolution = Resolution(0, 0)

    for (format in composition.keys) {
        for (position in composition[format]!!) {
            // update resolution to acquire maximum values
            resolution = Resolution(
                if (position.xpos > resolution.length) position.xpos else resolution.length,
                if (position.ypos > resolution.width) position.ypos else resolution.width
            )

            pixels.add(
                Pixel(
                    position,
                    colorGenerator(format)
                )
            )
        }
    }

    return Image(
        resolution,
        pixels.toList()
    )
}

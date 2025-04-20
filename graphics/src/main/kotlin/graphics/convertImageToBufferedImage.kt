package com.s12works.imageRandomizer.graphics

import java.awt.image.BufferedImage

public fun convertImageToBufferedImage(image: Image): BufferedImage {
    val bufferedImage = BufferedImage(
        image.resolution.width,
        image.resolution.length,
        BufferedImage.TYPE_INT_ARGB
    )

    for (pixel in image.pixels) {
        bufferedImage.setRGB(
            pixel.position.xpos,
            pixel.position.ypos,
            java.awt.Color(
                pixel.association.red,
                pixel.association.green,
                pixel.association.blue
            ).rgb
        )
    }

    return bufferedImage
}

package com.s12works.imageRandomizer.graphics

public fun convertBufferedImageToImage(bufferedImage: java.awt.image.BufferedImage): Image {
    val resolution = Resolution(bufferedImage.width, bufferedImage.height)

    val pixels = mutableListOf<Pixel<Color>>()

    for (y in 0 until resolution.width) {
        for (x in 0 until resolution.length) {
            val awtColor = java.awt.Color(
                bufferedImage.getRGB(x, y),
                false
            )

            pixels.add(
                Pixel(
                    Position(x, y),
                    Color(
                        awtColor.getRed(),
                        awtColor.getGreen(),
                        awtColor.getBlue()
                    )
                )
            )
        }
    }

    return Image(resolution, pixels.toList())
}

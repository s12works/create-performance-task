package com.s12works.imageRandomizer.app

import com.s12works.imageRandomizer.input.Test
import com.s12works.imageRandomizer.input.ErrorMessage
import com.s12works.imageRandomizer.rangeUtil.contains
import com.s12works.imageRandomizer.input.Request
import kotlin.random.Random
import javax.imageio.ImageIO
import java.io.File

public fun main() {
    val userInputs: List<com.s12works.imageRandomizer.input.UserInput> = getUserInputs(
        "ERROR: ",
        listOf<UserInputREPLInstance>(
            UserInputREPLInstance(
                "Category size:",
                mapOf<Test, ErrorMessage>(
                    { request: Request ->
                        var hasPassed: Boolean? = null

                        try {
                            hasPassed = request.toInt() in com.s12works.imageRandomizer.rangeUtil.ranges.positive
                        } catch(exc: NumberFormatException) {
                            hasPassed = false
                        }

                        hasPassed!!
                    } to "input provided for category size must be a positive integer"
                )
            ),

            UserInputREPLInstance(
                "Input file location:",
                mapOf<Test, ErrorMessage>(
                    pngFileRequirement,
                    { request: Request ->
                        var hasPassed: Boolean? = null

                        try {
                            javax.imageio.ImageIO.read(java.io.File(request))
                            hasPassed = true
                        } catch (exc: javax.imageio.IIOException) {
                            hasPassed = false
                        }

                        hasPassed!!
                    } to "File must exist/be readable"
                )
            ),

            UserInputREPLInstance(
                "Input file output location:",
                mapOf<Test, ErrorMessage>(
                    pngFileRequirement
                )
            )
        )
    ).toList()

    println("Running")

    val categorySize: Int = userInputs[0].toInt()
    val inputLocation: File = File(userInputs[1])
    val outputLocation: File = File(userInputs[2])

    val colorGenerator: com.s12works.imageRandomizer.graphics.ColorGenerator = {
        com.s12works.imageRandomizer.graphics.Color(
            Random.nextInt(0, 255),
            Random.nextInt(0, 255),
            Random.nextInt(0, 255)
        )
    }

    ImageIO.write(
        com.s12works.imageRandomizer.graphics.convertImageToBufferedImage(
            com.s12works.imageRandomizer.graphics.getImageFromComp(
                com.s12works.imageRandomizer.graphics.getSimplifiedImageComp(
                    categorySize,
                    com.s12works.imageRandomizer.graphics.convertBufferedImageToImage(
                        ImageIO.read(inputLocation)
                    )
                ),
                colorGenerator
            )
        ),
        "png",
        outputLocation
    )
}

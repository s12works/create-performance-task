package com.s12works.imageRandomizer.app

public val pngFileRequirement = Pair<com.s12works.imageRandomizer.input.Test, com.s12works.imageRandomizer.input.ErrorMessage>(
    { request: com.s12works.imageRandomizer.input.Request -> request.reversed().substring(0, 4).reversed() == ".png" },
    "specified file/location must be of type PNG"
)

package com.s12works.imageRandomizer.app

public data class UserInputREPLInstance(
    public val request: com.s12works.imageRandomizer.input.Request,
    public val tests: Map<com.s12works.imageRandomizer.input.Test, com.s12works.imageRandomizer.input.ErrorMessage?>
) {
    override fun toString(): com.s12works.imageRandomizer.objectRepr.Translation =
        com.s12works.imageRandomizer.objectRepr.getStandardRepr(this)
}

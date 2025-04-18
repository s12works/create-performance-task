package com.s12works.imageRandomizer.assertion

public open class Receipt(
    public final val message: Message,
    public final val assessor: Assessor
) {
    override open fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)

    override open equals(other: Any?): Boolean =
        this com.s12works.imageRandomizer.standardObjectEquality.equals other
}

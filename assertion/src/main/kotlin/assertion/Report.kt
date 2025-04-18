package com.s12works.imageRandomizer.assertion

/**
 * contains all that which is necessary for processing/representing errors
 * 
 * @property receipt represents the report's required [Receipt] (or representation of the error)
 */
public open class Report(
    public final val reciept: Reciept
) {
    override open fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)

    override open fun equals(other: Any?): Boolean =
        this com.s12works.imageRandomizer.standardObjectEquality.equals other
} 

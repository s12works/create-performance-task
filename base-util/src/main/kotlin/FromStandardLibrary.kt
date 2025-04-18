package com.s12works.imageRandomizer

/**
 * indicates the disconnected nature of the specified feature
 *
 * This (and [StandardLibraryUtility]) allows for programatic/direct
 * awareness of whether or not a certain feature is seperate from
 * other potentially related API's; this awareness is intended to
 * indicate the potential instability of said feature as a result.
 *
 * @see [StandardLibraryUtility] includes officially supported types
 */
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.TYPEALIAS
)
public annotation class FromStandardLibrary(
    public val utilityType: StandardLibraryUtility
)

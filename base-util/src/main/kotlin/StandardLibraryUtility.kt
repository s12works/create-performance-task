package com.s12works.imageRandomizer

/**
 * represents a supported type of standard-library utility
 *
 * This (and [FromStandardLibrary]) allows for programatic/direct
 * awareness of whether or not a certain feature is seperate from
 * other potentially related API's; this awareness is intended to
 * indicate the potential instability of said feature as a result.
 *
 * @see [FromStandardLibrary] used for application
 */
public enum class StandardLibraryUtility {
    STANDARD_OBJECT_EQUALITY,
    ASSERTION_ENFORCER,
    ASSERTION_REPORT,
    ASSERTION_REPORTER,
    OBJECT_REPR_REPRESENTOR,
    OBJECT_REPR_TRANSLATOR
}

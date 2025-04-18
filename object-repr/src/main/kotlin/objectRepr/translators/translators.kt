package com.s12works.imageRandomizer.objectRepr.translators

import com.s12works.imageRandomizer.objectRepr.Representation
import com.s12works.imageRandomizer.objectRepr.Translation
import com.s12works.imageRandomizer.FromStandardLibrary
import com.s12works.imageRandomizer.StandardLibraryUtility

@FromStandardLibrary(StandardLibraryUtility.OBJECT_REPR_TRANSLATOR)
public fun getDefault(representation: Representation): Translation {
    val translations = com.s12works.imageRandomizer.getProcGeneratedCollection(
        representation.properties,
        { "${it.name}=${it.value}" }
    )

    return "${representation.name ?: com.s12works.imageRandomizer.objectRepr.genericObjectName}(${translations.joinToString(separator=", ")})"
}

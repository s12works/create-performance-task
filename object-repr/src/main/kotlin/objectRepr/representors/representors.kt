package com.s12works.imageRandomizer.objectRepr.representors

import com.s12works.imageRandomizer.objectRepr.Representation
import com.s12works.imageRandomizer.objectRepr.Property
import com.s12works.imageRandomizer.FromStandardLibrary
import com.s12works.imageRandomizer.StandardLibraryUtility
import kotlin.reflect.KProperty

@FromStandardLibrary(StandardLibraryUtility.OBJECT_REPR_REPRESENTOR)
public fun <O: Any> getStandard(obj: O): Representation {
    val kProperties = obj::class.members.filterIndexed { index: Int, member: kotlin.reflect.KCallable<*> ->
        member is KProperty<*>
    } as Collection<KProperty<*>>

    return Representation(
        obj::class.simpleName,
        com.s12works.imageRandomizer.getProcGeneratedCollection<KProperty<*>, Property<Any?>>(
            kProperties,
            { Property<Any?>(it.name, it.call()) }
        )
    )
}

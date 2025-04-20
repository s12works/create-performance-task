package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.rangeUtil.contains
import com.s12works.imageRandomizer.getProcGeneratedCollection

public fun getSimplifiedImageComp(categorySize: Int, image: Image): SimplifiedImageComp {
    val categories: List<Category> = getCategories(categorySize, rgbRange)
    val composition = mutableMapOf<CategoryIDColorFormat, MutableList<Position>>()

    for (pixel in image.pixels) {
        val categoryIDs: List<CategoryID> = getProcGeneratedCollection<RGBValue, CategoryID>(
            listOf<RGBValue>(
                pixel.association.red,
                pixel.association.green,
                pixel.association.blue
            ),
            {
                var categoryID: CategoryID? = null

                for (i in 0 until categories.size) {
                    if (it in categories[i]) {
                        categoryID = i
                    }
                }

                categoryID!!
            }
        ).toList()

        val format = CategoryIDColorFormat(
            categoryIDs[0],
            categoryIDs[1],
            categoryIDs[2]
        )
        
        if (format in composition.keys) {
            composition[format]!!.add(pixel.position)
        } else {
            composition[format] = mutableListOf(pixel.position)
        }
    }

    val updatedPairs = getProcGeneratedCollection<Map.Entry<CategoryIDColorFormat, MutableList<Position>>, Pair<CategoryIDColorFormat, List<Position>>>(
        composition.entries,
        { Pair(it.key, it.value.toList()) }
    )

    return mapOf(*updatedPairs.toTypedArray())
}

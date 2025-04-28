package com.s12works.imageRandomizer.graphics

import com.s12works.imageRandomizer.rangeUtil.contains

public fun getSimplifiedImageComp(categorySize: Int, image: Image): SimplifiedImageComp {
    val categories: List<Category> = getCategories(categorySize, rgbRange)
    val composition = mutableMapOf<CategoryIDColorFormat, MutableList<Position>>()

    for (pixel in image.pixels) {
        val categoryIDs: List<CategoryID> = listOf<RGBValue>(
            pixel.association.red,
            pixel.association.green,
            pixel.association.blue
        ).map {
            var categoryID: CategoryID? = null

            for (i in 0 until categories.size) {
                if (it in categories[i]) {
                    categoryID = i
                }
            }

            categoryID!!
        }

        val format = CategoryIDColorFormat(
            categoryIDs[0],
            categoryIDs[1],
            categoryIDs[2]
        )
        
        if (format in composition.keys.toSet()) {
            println(format)
            composition[format]!!.add(pixel.position)
        } else {
            composition[format] = mutableListOf(pixel.position)
        }
    }

    /*
    for (format in composition.keys) {
        println("FORMAT: $format")
        composition[format]!!.forEach {
            println(" ".repeat(4) + it)
        }
    }
    */

    println("Printing Size...")
    println(composition.keys.size)
    /*
    for (format in composition.keys) {
        println(format)
    }
    */
    
    val updatedPairs = composition.entries.map {
        Pair(it.key, it.value.toList())
    }
    
    /*
    val updatedPairs = getProcGeneratedCollection<Map.Entry<CategoryIDColorFormat, MutableList<Position>>, Pair<CategoryIDColorFormat, List<Position>>>(
        composition.entries,
        { Pair(it.key, it.value.toList()) }
    )
    */
   
    println("END; use CTRL C to exit")
    while (true) {}

    return mapOf(*updatedPairs.toTypedArray())
}

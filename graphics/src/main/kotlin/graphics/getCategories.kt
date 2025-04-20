package com.s12works.imageRandomizer.graphics

public fun getCategories(size: Int, bounds: com.s12works.imageRandomizer.rangeUtil.Range): List<Category> {
    val categories = mutableListOf<Category>()
    var newUpperBound = bounds.minimum!!
    
    // initial addition
    categories.add(
        Category(
            newUpperBound,
            newUpperBound + size
        )
    )

    while (newUpperBound < bounds.maximum!!) {
        newUpperBound += size + 1
        if (newUpperBound <= bounds.maximum!!) {
            categories.add(
                Category(
                    newUpperBound,
                    newUpperBound + size
                )
            )
        }
    }

    return categories.toList()
}

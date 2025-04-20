package com.s12works.imageRandomizer.graphics.categoryIDColorFormatValidation

public fun getMessage(type: CategoryIDColorFormatType, id: com.s12works.imageRandomizer.graphics.CategoryID):
    com.s12works.imageRandomizer.assertion.Message = "CategoryIDColorFormat object illegally instantiated; ${type.name.lowercase(java.util.Locale.US)} value is $id"

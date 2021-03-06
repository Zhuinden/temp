package com.zhuinden.casterio_simple_stack_examples

import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FirstKey(val clazz: String) : ViewKey() {
    override val layoutId: Int
        get() = R.layout.view_first

    @IgnoredOnParcel
    override val toolbarText: Int = R.string.first_view_toolbar_text

    constructor() : this(FirstKey::class.java.name)
}
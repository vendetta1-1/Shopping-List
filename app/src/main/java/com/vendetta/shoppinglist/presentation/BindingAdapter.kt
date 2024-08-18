package com.vendetta.shoppinglist.presentation

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout
import com.vendetta.shoppinglist.R

@BindingAdapter("textOfErrorInputName")
fun bindErrorInputName(textInputLayout: TextInputLayout, errorInputName: Boolean) {
    val message = if (errorInputName) {
        textInputLayout.context.getString(R.string.error_input_name)
    } else {
        null
    }
    textInputLayout.error = message
}

@BindingAdapter("textOfErrorInputCount")
fun bindErrorInputCount(textInputLayout: TextInputLayout, errorInputCount: Boolean) {
    val message = if (errorInputCount) {
        textInputLayout.context.getString(R.string.error_input_count)
    } else {
        null
    }
    textInputLayout.error = message
}

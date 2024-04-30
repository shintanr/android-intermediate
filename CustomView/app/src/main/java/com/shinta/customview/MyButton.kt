package com.shinta.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat


// 1. membuat class button, extend ke kelas appcompatbutton
    // 2. membuat constructor
    // 3. memakai fun onDraw untuk mengubah button
    // 4. buat res 2 drawable  baru, yaitu bg_button dan bg_button_disable untuk membuat backgroud button
    // 5. menambahkan kode AA untuk memasukkan background dan attribute

class MyButton: AppCompatButton {
    constructor(context: Context): super(context)
    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    // kode AA
    private var txtColor: Int = 0
    private var enabledBackground: Drawable
    private var disableBackground: Drawable

    init{
        txtColor = ContextCompat.getColor(context, android.R.color.background_light)
        enabledBackground = ContextCompat.getDrawable(context, R.drawable.bg_button) as Drawable
        disableBackground = ContextCompat.getDrawable(context, R.drawable.bg_button_disable) as Drawable

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        background = if(isEnabled) enabledBackground else disableBackground
        setTextColor(txtColor)
        textSize = 12f
        gravity = Gravity.CENTER
        text = if(isEnabled) "Submit" else "isi dulu"
    }
}
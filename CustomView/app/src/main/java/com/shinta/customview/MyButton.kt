package com.shinta.customview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton


    // 1. membuat class button, extend ke kelas appcompatbutton
    // 2. membuat constructor
    // 3. memakai fun onDraw untuk mengubah button
    // 4. buat res 2 drawable  baru, yaitu bg_button dan bg_button_disable untuk membuat backgroud button
    // 5. menambahkan kode AA untuk memasukkan background dan attribute

class MyButton: AppCompatButton {
    constructor(context: Context): super(context)
    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }
}
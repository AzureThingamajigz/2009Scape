package org.rs09.client.rendering

import org.runite.client.*

/**
 * A utility class to make rendering new things easier. This should only be used for new things. Ideally only port the
 * necessary calls to this utility class.
 *
 * In the future, instead of utilizing this class, a toolkit system should be used.
 */
object RenderingUtils {
    val hd: Boolean
        get() = HDToolKit.highDetail

    // TODO Is this actually the width?
    val width: Int
        get() = Class23.anInt454

    // TODO Is this actually the height?
    val height: Int
        get() = Class140_Sub7.anInt2934

    @JvmStatic
    @Deprecated("Please use the Toolkit methods instead of this delegating method", ReplaceWith("Toolkit.getActiveToolkit().fillRect(x, y, w, h, rgb, alpha)"))
    fun fillRect(x: Int, y: Int, w: Int, h: Int, rgb: Int, alpha: Int) {
        Toolkit.getActiveToolkit().fillRect(x, y, w, h, rgb, alpha)
//        if (hd) Class22.fillRectangle(x, y, w, h, rgb, alpha)
//        else Class74.fillRectangle(x, y, w, h, rgb, alpha)
    }

    @JvmStatic
    fun drawHorizontalLine(x: Int, y: Int, w: Int, rgb: Int) {
        Toolkit.getActiveToolkit().drawHorizontalLine(x, y, w, rgb)
//        if (hd) Class22.drawHorizontalLine(x, y, w, rgb)
//        else Toolkit.JAVA_TOOLKIT.drawHorizontalLine(x, y, w, rgb)
    }

    @JvmStatic
    fun drawVerticalLine(x: Int, y: Int, h: Int, rgb: Int) {
        Toolkit.getActiveToolkit().drawVerticalLine(x,y,h,rgb)
//        if (hd) Class22.drawVerticalLine(x, y, h, rgb)
//        else Class74.drawVerticalLine(x, y, h, rgb)
    }

    @JvmStatic
    fun drawRect(x: Int, y: Int, w: Int, h: Int, rgb: Int, alpha: Int) {
        Toolkit.getActiveToolkit().drawRect(x, y, w, h, rgb, alpha)
//        if (hd) Class22.drawRect(x, y, w, h, rgb)
//        else Class74.drawRect(x, y, w, h, rgb)
    }

    fun drawText(str: String, x: Int, y: Int, rgb: Int, parse: Boolean = false) {
        if (parse) Class126.aClass3_Sub28_Sub17_1669.method681(RSString.parse(str), x, y, rgb, -1)
        else Class126.aClass3_Sub28_Sub17_1669.method681(RSString.of(str), x, y, rgb, -1)
    }

    fun drawText(str: RSString, x: Int, y: Int, rgb: Int) {
        Class126.aClass3_Sub28_Sub17_1669.method681(str, x, y, rgb, -1)
    }

    fun setClipping(left: Int, top: Int, right: Int, bottom: Int) {
        if (hd) Class22.setClipping(left, top, right, bottom)
        else Class74.setClipping(left, top, right, bottom)
    }

    fun resetClipping() {
        if (hd) Class22.resetClipping()
        else Class74.resetClipping()
    }
}
package nixlab.phone.cleaner.freeup.storage.domain.algorithm

import android.graphics.Bitmap
import android.graphics.Color

object DHash {

    private const val WIDTH = 9
    private const val HEIGHT = 8

    fun fromBitmap(bitmap: Bitmap?): Long {
        if (bitmap == null || bitmap.isRecycled || bitmap.width <= 0 || bitmap.height <= 0) {
            return 0L
        }
        return try {
            val scaled = Bitmap.createScaledBitmap(bitmap, WIDTH, HEIGHT, true)
            val pixels = IntArray(WIDTH * HEIGHT)
            scaled.getPixels(pixels, 0, WIDTH, 0, 0, WIDTH, HEIGHT)
            if (scaled != bitmap && !scaled.isRecycled) {
                scaled.recycle()
            }

            val grayValues = IntArray(WIDTH * HEIGHT)
            for (i in pixels.indices) {
                val color = pixels[i]
                val r = Color.red(color)
                val g = Color.green(color)
                val b = Color.blue(color)
                grayValues[i] = (r * 299 + g * 587 + b * 114) / 1000
            }

            var hash = 0L
            var bitIndex = 0

            for (row in 0 until HEIGHT) {
                for (col in 0 until WIDTH - 1) {
                    val left = grayValues[row * WIDTH + col]
                    val right = grayValues[row * WIDTH + (col + 1)]
                    if (left > right) {
                        hash = hash or (1L shl bitIndex)
                    }
                    bitIndex++
                }
            }

            hash
        } catch (t: Throwable) {
            0L
        }
    }

    fun hammingDistance(hash1: Long, hash2: Long): Int {
        return java.lang.Long.bitCount(hash1 xor hash2)
    }

    fun isSimilar(hash1: Long, hash2: Long, threshold: Int = 10): Boolean {
        return hammingDistance(hash1, hash2) <= threshold
    }

    fun isExactDuplicate(hash1: Long, hash2: Long): Boolean {
        return hash1 == hash2
    }
}

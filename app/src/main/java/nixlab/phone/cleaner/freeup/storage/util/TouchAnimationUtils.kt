package nixlab.phone.cleaner.freeup.storage.util

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View

object TouchAnimationUtils {

    @SuppressLint("ClickableViewAccessibility")
    fun attachTouchAnimation(view: View, onClick: (() -> Unit)? = null) {
        view.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    v.animate()
                        .scaleX(0.94f)
                        .scaleY(0.94f)
                        .setDuration(100)
                        .start()
                }
                MotionEvent.ACTION_UP -> {
                    v.animate()
                        .scaleX(1.0f)
                        .scaleY(1.0f)
                        .setDuration(150)
                        .withEndAction {
                            onClick?.invoke()
                        }
                        .start()
                }
                MotionEvent.ACTION_CANCEL -> {
                    v.animate()
                        .scaleX(1.0f)
                        .scaleY(1.0f)
                        .setDuration(150)
                        .start()
                }
            }
            true
        }
    }
}

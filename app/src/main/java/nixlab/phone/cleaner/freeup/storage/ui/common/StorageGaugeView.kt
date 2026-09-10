package nixlab.phone.cleaner.freeup.storage.ui.common

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View
import android.view.animation.DecelerateInterpolator

class StorageGaugeView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var progress: Float = 0f
    private var targetProgress: Float = 0f

    private val trackPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 28f
        strokeCap = Paint.Cap.ROUND
        color = Color.parseColor("#1E293B")
    }

    private val progressPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 28f
        strokeCap = Paint.Cap.ROUND
    }

    private val glowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 38f
        strokeCap = Paint.Cap.ROUND
        alpha = 80
    }

    private val oval = RectF()
    private val startAngle = 135f
    private val sweepTotal = 270f

    private var animator: ValueAnimator? = null

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        if (w <= 0 || h <= 0) return

        val padding = 36f
        oval.set(padding, padding, w - padding, h - padding)

        val gradient = LinearGradient(
            0f, 0f, w.toFloat(), h.toFloat(),
            intArrayOf(
                Color.parseColor("#8B5CF6"), // Electric Violet
                Color.parseColor("#00E5FF"), // Neon Cyan
                Color.parseColor("#10B981"), // Mint Emerald
                Color.parseColor("#EC4899")  // Sunset Rose
            ),
            floatArrayOf(0f, 0.35f, 0.70f, 1.0f),
            Shader.TileMode.CLAMP
        )
        progressPaint.shader = gradient
        glowPaint.shader = gradient
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Background track
        canvas.drawArc(oval, startAngle, sweepTotal, false, trackPaint)

        // Progress arc
        val currentSweep = sweepTotal * (progress / 100f)
        if (currentSweep > 0) {
            canvas.drawArc(oval, startAngle, currentSweep, false, glowPaint)
            canvas.drawArc(oval, startAngle, currentSweep, false, progressPaint)
        }
    }

    fun setProgress(value: Int, animated: Boolean = true) {
        animator?.cancel()
        targetProgress = value.toFloat().coerceIn(0f, 100f)
        if (animated) {
            animator = ValueAnimator.ofFloat(progress, targetProgress).apply {
                duration = 1200
                interpolator = DecelerateInterpolator()
                addUpdateListener {
                    progress = it.animatedValue as Float
                    invalidate()
                }
            }
            animator?.start()
        } else {
            progress = targetProgress
            invalidate()
        }
    }
}

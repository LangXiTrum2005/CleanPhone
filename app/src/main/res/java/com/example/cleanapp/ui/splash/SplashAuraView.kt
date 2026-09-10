package com.example.cleanapp.ui.splash

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PathMeasure
import android.graphics.RadialGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View
import android.view.animation.LinearInterpolator
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

class SplashAuraView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val mainPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val ringPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
    }
    private val particlePaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val sweepPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private var rotationAngle = 0f
    private var rippleProgress = 0f
    private var sweepProgress = 0f
    private var animator: ValueAnimator? = null

    private data class Particle(
        var x: Float,
        var y: Float,
        var radius: Float,
        var alpha: Int,
        var speedY: Float,
        var speedX: Float,
        var maxAlpha: Int
    )

    private val particles = ArrayList<Particle>()
    private val particleCount = 35

    init {
        startAnimation()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        initParticles(w, h)
    }

    private fun initParticles(w: Int, h: Int) {
        particles.clear()
        if (w == 0 || h == 0) return
        for (i in 0 until particleCount) {
            particles.add(
                Particle(
                    x = Random.nextFloat() * w,
                    y = Random.nextFloat() * h,
                    radius = Random.nextFloat() * 6f + 2f,
                    alpha = Random.nextInt(50, 200),
                    speedY = Random.nextFloat() * 1.5f + 0.5f,
                    speedX = (Random.nextFloat() - 0.5f) * 0.6f,
                    maxAlpha = Random.nextInt(120, 240)
                )
            )
        }
    }

    private fun startAnimation() {
        animator = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 4000L
            repeatCount = ValueAnimator.INFINITE
            interpolator = LinearInterpolator()
            addUpdateListener { anim ->
                val fraction = anim.animatedValue as Float
                rotationAngle = fraction * 360f
                rippleProgress = (fraction * 2.5f) % 1.0f
                sweepProgress = (fraction * 1.5f) % 1.0f

                // Update particles
                for (p in particles) {
                    p.y -= p.speedY
                    p.x += p.speedX
                    if (p.y < 0) {
                        p.y = height.toFloat()
                        p.x = Random.nextFloat() * width
                    }
                }
                invalidate()
            }
            start()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val cx = width / 2f
        val cy = height / 2f
        if (cx == 0f || cy == 0f) return

        // 1. Draw Glowing Background Radial Aura
        val auraRadius = Math.min(width, height) * 0.45f
        val auraShader = RadialGradient(
            cx, cy, auraRadius,
            intArrayOf(
                Color.parseColor("#4000A884"), // Teal glow
                Color.parseColor("#1A00E5FF"), // Cyan glow
                Color.TRANSPARENT
            ),
            floatArrayOf(0f, 0.55f, 1.0f),
            Shader.TileMode.CLAMP
        )
        mainPaint.shader = auraShader
        canvas.drawCircle(cx, cy, auraRadius, mainPaint)

        // 2. Draw Multiple Pulse Ripples
        for (i in 0..2) {
            val rProgress = (rippleProgress + i * 0.33f) % 1.0f
            val rRadius = auraRadius * 0.3f + rProgress * auraRadius * 0.7f
            val rAlpha = ((1f - rProgress) * 160).toInt().coerceIn(0, 255)

            ringPaint.color = Color.parseColor("#00A884")
            ringPaint.alpha = rAlpha
            ringPaint.strokeWidth = (1f + (1f - rProgress) * 4f)
            canvas.drawCircle(cx, cy, rRadius, ringPaint)
        }

        // 3. Draw Rotating Tech Dots / Orbit Ring
        val ringRadius = auraRadius * 0.65f
        canvas.save()
        canvas.rotate(rotationAngle, cx, cy)
        for (angle in 0 until 360 step 30) {
            val rad = Math.toRadians(angle.toDouble())
            val px = cx + ringRadius * cos(rad).toFloat()
            val py = cy + ringRadius * sin(rad).toFloat()

            particlePaint.color = if (angle % 60 == 0) Color.parseColor("#00A884") else Color.parseColor("#00E5FF")
            particlePaint.alpha = 180
            canvas.drawCircle(px, py, 4f, particlePaint)
        }
        canvas.restore()

        // Counter-rotating outer dotted ring
        val outerRadius = auraRadius * 0.82f
        canvas.save()
        canvas.rotate(-rotationAngle * 0.6f, cx, cy)
        for (angle in 0 until 360 step 45) {
            val rad = Math.toRadians(angle.toDouble())
            val px = cx + outerRadius * cos(rad).toFloat()
            val py = cy + outerRadius * sin(rad).toFloat()

            particlePaint.color = Color.parseColor("#8000A884")
            particlePaint.alpha = 130
            canvas.drawCircle(px, py, 3f, particlePaint)
        }
        canvas.restore()

        // 4. Draw Floating Sparkle Particles
        for (p in particles) {
            particlePaint.shader = null
            particlePaint.color = Color.parseColor("#00E5FF")
            particlePaint.alpha = p.alpha
            canvas.drawCircle(p.x, p.y, p.radius, particlePaint)
        }

        // 5. Draw Light Sweep Beam
        val sweepY = height * sweepProgress
        val sweepShader = LinearGradient(
            0f, sweepY - 40f, 0f, sweepY + 40f,
            intArrayOf(Color.TRANSPARENT, Color.parseColor("#3500E5FF"), Color.TRANSPARENT),
            floatArrayOf(0f, 0.5f, 1.0f),
            Shader.TileMode.CLAMP
        )
        sweepPaint.shader = sweepShader
        canvas.drawRect(0f, sweepY - 40f, width.toFloat(), sweepY + 40f, sweepPaint)
    }

    override fun onDetachedFromWindow() {
        animator?.cancel()
        super.onDetachedFromWindow()
    }
}

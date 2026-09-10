package com.example.cleanapp.ui.splash

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
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
        strokeWidth = 3.5f
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
        var color: Int
    )

    private val particles = ArrayList<Particle>()
    private val particleCount = 35

    private val palette = intArrayOf(
        Color.parseColor("#8B5CF6"), // Electric Violet
        Color.parseColor("#00E5FF"), // Neon Cyan
        Color.parseColor("#EC4899"), // Sunset Pink / Rose
        Color.parseColor("#10B981"), // Emerald
        Color.parseColor("#F59E0B")  // Amber Gold
    )

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
                    color = palette[Random.nextInt(palette.size)]
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

        // 1. Multi-Color Radial Background Aura
        val auraRadius = Math.min(width, height) * 0.48f
        val auraShader = RadialGradient(
            cx, cy, auraRadius,
            intArrayOf(
                Color.parseColor("#458B5CF6"), // Electric Violet center
                Color.parseColor("#3000E5FF"), // Neon Cyan mid
                Color.parseColor("#1AEC4899"), // Sunset Rose edge
                Color.TRANSPARENT
            ),
            floatArrayOf(0f, 0.4f, 0.75f, 1.0f),
            Shader.TileMode.CLAMP
        )
        mainPaint.shader = auraShader
        canvas.drawCircle(cx, cy, auraRadius, mainPaint)

        // 2. Multi-Color Pulse Ripples
        val rippleColors = intArrayOf(
            Color.parseColor("#8B5CF6"),
            Color.parseColor("#00E5FF"),
            Color.parseColor("#EC4899")
        )
        for (i in 0..2) {
            val rProgress = (rippleProgress + i * 0.33f) % 1.0f
            val rRadius = auraRadius * 0.3f + rProgress * auraRadius * 0.7f
            val rAlpha = ((1f - rProgress) * 170).toInt().coerceIn(0, 255)

            ringPaint.color = rippleColors[i % rippleColors.size]
            ringPaint.alpha = rAlpha
            ringPaint.strokeWidth = (1.5f + (1f - rProgress) * 4.5f)
            canvas.drawCircle(cx, cy, rRadius, ringPaint)
        }

        // 3. Rotating Multi-Color Tech Orbit Ring
        val ringRadius = auraRadius * 0.65f
        canvas.save()
        canvas.rotate(rotationAngle, cx, cy)
        for (angle in 0 until 360 step 30) {
            val rad = Math.toRadians(angle.toDouble())
            val px = cx + ringRadius * cos(rad).toFloat()
            val py = cy + ringRadius * sin(rad).toFloat()

            val pColorIndex = (angle / 30) % palette.size
            particlePaint.color = palette[pColorIndex]
            particlePaint.alpha = 200
            canvas.drawCircle(px, py, 4.5f, particlePaint)
        }
        canvas.restore()

        // Counter-rotating outer dotted ring
        val outerRadius = auraRadius * 0.84f
        canvas.save()
        canvas.rotate(-rotationAngle * 0.6f, cx, cy)
        for (angle in 0 until 360 step 45) {
            val rad = Math.toRadians(angle.toDouble())
            val px = cx + outerRadius * cos(rad).toFloat()
            val py = cy + outerRadius * sin(rad).toFloat()

            val pColorIndex = ((angle / 45) + 2) % palette.size
            particlePaint.color = palette[pColorIndex]
            particlePaint.alpha = 150
            canvas.drawCircle(px, py, 3.5f, particlePaint)
        }
        canvas.restore()

        // 4. Draw Floating Multi-Color Particles
        for (p in particles) {
            particlePaint.shader = null
            particlePaint.color = p.color
            particlePaint.alpha = p.alpha
            canvas.drawCircle(p.x, p.y, p.radius, particlePaint)
        }

        // 5. Draw Light Sweep Beam with Cyan-Violet Gradient
        val sweepY = height * sweepProgress
        val sweepShader = LinearGradient(
            0f, sweepY - 40f, width.toFloat(), sweepY + 40f,
            intArrayOf(
                Color.TRANSPARENT,
                Color.parseColor("#4000E5FF"),
                Color.parseColor("#408B5CF6"),
                Color.TRANSPARENT
            ),
            floatArrayOf(0f, 0.4f, 0.7f, 1.0f),
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

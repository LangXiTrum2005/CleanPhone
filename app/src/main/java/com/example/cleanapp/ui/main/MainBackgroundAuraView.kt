package com.example.cleanapp.ui.main

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View
import android.view.animation.LinearInterpolator
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

class MainBackgroundAuraView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val orbPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val particlePaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private var animTime = 0f
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
    private val particleCount = 30

    private val particlePalette = intArrayOf(
        Color.parseColor("#8B5CF6"), // Electric Violet
        Color.parseColor("#00E5FF"), // Neon Cyan
        Color.parseColor("#EC4899"), // Sunset Rose
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
                    radius = Random.nextFloat() * 4.5f + 1.5f,
                    alpha = Random.nextInt(40, 160),
                    speedY = Random.nextFloat() * 1.0f + 0.3f,
                    speedX = (Random.nextFloat() - 0.5f) * 0.4f,
                    color = particlePalette[Random.nextInt(particlePalette.size)]
                )
            )
        }
    }

    fun triggerTapBurst(burstX: Float, burstY: Float, accentColor: Int) {
        val burstCount = 12
        for (i in 0 until burstCount) {
            val angle = Math.toRadians((i * 30 + Random.nextInt(-10, 10)).toDouble())
            val speed = Random.nextFloat() * 2.5f + 1.2f
            particles.add(
                Particle(
                    x = burstX,
                    y = burstY,
                    radius = Random.nextFloat() * 5f + 2f,
                    alpha = 255,
                    speedY = -sin(angle).toFloat() * speed,
                    speedX = cos(angle).toFloat() * speed,
                    color = if (i % 2 == 0) accentColor else particlePalette[Random.nextInt(particlePalette.size)]
                )
            )
        }
        // Limit total active particles to avoid memory overhead
        if (particles.size > 80) {
            particles.subList(0, particles.size - 80).clear()
        }
    }

    private fun startAnimation() {
        animator = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 10000L
            repeatCount = ValueAnimator.INFINITE
            interpolator = LinearInterpolator()
            addUpdateListener { anim ->
                val fraction = anim.animatedValue as Float
                animTime = fraction * 2f * Math.PI.toFloat()

                val iterator = particles.iterator()
                while (iterator.hasNext()) {
                    val p = iterator.next()
                    p.y -= p.speedY
                    p.x += p.speedX
                    p.alpha = (p.alpha - 2).coerceAtLeast(0)

                    if (p.alpha <= 0 || p.y < 0) {
                        if (particles.size > particleCount) {
                            iterator.remove()
                        } else {
                            p.y = height.toFloat()
                            p.x = Random.nextFloat() * width
                            p.alpha = Random.nextInt(40, 160)
                        }
                    }
                }
                invalidate()
            }
            start()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val w = width.toFloat()
        val h = height.toFloat()
        if (w == 0f || h == 0f) return

        // 1. Top-Right Glowing Orb (Electric Violet / Indigo)
        val orb1X = w * 0.75f + sin(animTime.toDouble()).toFloat() * (w * 0.08f)
        val orb1Y = h * 0.18f + sin((animTime * 1.3f).toDouble()).toFloat() * (h * 0.05f)
        val orb1Radius = w * 0.65f
        val orb1Shader = RadialGradient(
            orb1X, orb1Y, orb1Radius,
            intArrayOf(Color.parseColor("#408B5CF6"), Color.parseColor("#154F46E5"), Color.TRANSPARENT),
            floatArrayOf(0f, 0.5f, 1.0f),
            Shader.TileMode.CLAMP
        )
        orbPaint.shader = orb1Shader
        canvas.drawCircle(orb1X, orb1Y, orb1Radius, orbPaint)

        // 2. Mid-Left Glowing Orb (Neon Cyan / Sky Blue)
        val orb2X = w * 0.20f + sin((animTime * 0.8f + 1f).toDouble()).toFloat() * (w * 0.10f)
        val orb2Y = h * 0.48f + sin((animTime * 1.1f).toDouble()).toFloat() * (h * 0.06f)
        val orb2Radius = w * 0.55f
        val orb2Shader = RadialGradient(
            orb2X, orb2Y, orb2Radius,
            intArrayOf(Color.parseColor("#3500E5FF"), Color.parseColor("#120088FF"), Color.TRANSPARENT),
            floatArrayOf(0f, 0.55f, 1.0f),
            Shader.TileMode.CLAMP
        )
        orbPaint.shader = orb2Shader
        canvas.drawCircle(orb2X, orb2Y, orb2Radius, orbPaint)

        // 3. Bottom-Right Glowing Orb (Sunset Rose / Magenta)
        val orb3X = w * 0.65f + sin((animTime * 1.4f + 2f).toDouble()).toFloat() * (w * 0.12f)
        val orb3Y = h * 0.78f + sin((animTime * 0.9f).toDouble()).toFloat() * (h * 0.04f)
        val orb3Radius = w * 0.55f
        val orb3Shader = RadialGradient(
            orb3X, orb3Y, orb3Radius,
            intArrayOf(Color.parseColor("#30EC4899"), Color.parseColor("#10BE185D"), Color.TRANSPARENT),
            floatArrayOf(0f, 0.5f, 1.0f),
            Shader.TileMode.CLAMP
        )
        orbPaint.shader = orb3Shader
        canvas.drawCircle(orb3X, orb3Y, orb3Radius, orbPaint)

        // 4. Top-Left Glowing Orb (Emerald / Mint)
        val orb4X = w * 0.25f + sin((animTime * 1.2f + 3f).toDouble()).toFloat() * (w * 0.07f)
        val orb4Y = h * 0.15f + sin((animTime * 0.7f).toDouble()).toFloat() * (h * 0.04f)
        val orb4Radius = w * 0.50f
        val orb4Shader = RadialGradient(
            orb4X, orb4Y, orb4Radius,
            intArrayOf(Color.parseColor("#3010B981"), Color.parseColor("#0D06B6D4"), Color.TRANSPARENT),
            floatArrayOf(0f, 0.5f, 1.0f),
            Shader.TileMode.CLAMP
        )
        orbPaint.shader = orb4Shader
        canvas.drawCircle(orb4X, orb4Y, orb4Radius, orbPaint)

        // 5. Draw Multi-color Floating & Tap Burst Particles
        particlePaint.shader = null
        for (p in particles) {
            particlePaint.color = p.color
            particlePaint.alpha = p.alpha
            canvas.drawCircle(p.x, p.y, p.radius, particlePaint)
        }
    }

    override fun onDetachedFromWindow() {
        animator?.cancel()
        super.onDetachedFromWindow()
    }
}

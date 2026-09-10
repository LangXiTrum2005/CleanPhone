package com.codejoy.boom.clap.ad.native_templates;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.codejoy.boom.clap.ad.native_templates.AdLightingAnimationView;
import com.codejoy.boom.clap.polloi;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class AdLightingAnimationView extends ImageFilterView {
    private int[] colors;
    private final Path mClipPath;
    private int mDuration;
    private int mFlashWidth;
    private final Paint mPaint;
    private final Path mPath;
    private final RectF mRect;
    private int mRepeatCount;
    private ValueAnimator mValueAnimator;
    private int playMode;
    private float[] positions;
    private int radius;
    private float slope;

    public AdLightingAnimationView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void attabal(AdLightingAnimationView adLightingAnimationView, float f, ValueAnimator valueAnimator) {
        adLightingAnimationView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f2 = adLightingAnimationView.slope;
        float f3 = fFloatValue + f;
        adLightingAnimationView.mPaint.setShader(new LinearGradient(fFloatValue, f2 * fFloatValue, f3, f2 * f3, adLightingAnimationView.colors, adLightingAnimationView.positions, Shader.TileMode.CLAMP));
        adLightingAnimationView.invalidate();
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, polloi.GntAdLightingAnimationView);
            String string = typedArrayObtainStyledAttributes.getString(polloi.GntAdLightingAnimationView_gnt_colors);
            String string2 = typedArrayObtainStyledAttributes.getString(polloi.GntAdLightingAnimationView_gnt_positions);
            if (string != null && string2 != null) {
                String[] strArrSplit = string.split(",");
                String[] strArrSplit2 = string2.split(",");
                int length = strArrSplit.length;
                if (length == strArrSplit2.length) {
                    this.colors = new int[length];
                    this.positions = new float[length];
                    for (int i = 0; i < length; i++) {
                        this.colors[i] = Color.parseColor(strArrSplit[i]);
                        this.positions[i] = Float.parseFloat(strArrSplit2[i]);
                    }
                }
            }
            this.playMode = typedArrayObtainStyledAttributes.getInt(polloi.GntAdLightingAnimationView_gnt_play_mode, this.playMode);
            int i2 = typedArrayObtainStyledAttributes.getInt(polloi.GntAdLightingAnimationView_gnt_repeat, this.mRepeatCount);
            this.mRepeatCount = i2;
            if (i2 < 0 && i2 != -1) {
                this.mRepeatCount = -1;
            }
            this.mDuration = typedArrayObtainStyledAttributes.getInt(polloi.GntAdLightingAnimationView_gnt_duration, this.mDuration);
            this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(polloi.GntAdLightingAnimationView_gnt_radius, this.radius);
            this.slope = typedArrayObtainStyledAttributes.getFloat(polloi.GntAdLightingAnimationView_gnt_slope, this.slope);
            this.mFlashWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(polloi.GntAdLightingAnimationView_gnt_flash_width, this.mFlashWidth);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void showAnimation(int i, int i2, int i3, int i4) {
        this.mPath.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f = i;
        this.mPath.lineTo(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f2 = i2;
        this.mPath.lineTo(f, f2);
        this.mPath.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        this.mPath.close();
        if (this.mFlashWidth < 0) {
            this.mFlashWidth = i / 3;
        }
        final float f3 = this.mFlashWidth;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f4 = 2.0f * f3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4, f + f4);
        this.mValueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatCount(i3);
        this.mValueAnimator.setInterpolator(new LinearInterpolator());
        this.mValueAnimator.setDuration(i4);
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: orometer.attabal
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AdLightingAnimationView.attabal(this.f34767attabal, f3, valueAnimator2);
            }
        });
        this.mValueAnimator.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mValueAnimator = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mClipPath.reset();
        if (this.radius < 0) {
            this.radius = getHeight() / 2;
        }
        this.mPaint.setAlpha(102);
        this.mRect.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight());
        Path path = this.mClipPath;
        RectF rectF = this.mRect;
        int i = this.radius;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.clipPath(this.mClipPath);
        canvas.drawPath(this.mPath, this.mPaint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.playMode == 1) {
            showAnimation(size, size2, this.mRepeatCount, this.mDuration);
        }
    }

    public void setColorAndPositions(int[] iArr, float[] fArr) {
        if (iArr.length != fArr.length) {
            throw new RuntimeException("colors and positions arrays must have the same length");
        }
        this.colors = iArr;
        this.positions = fArr;
    }

    public void startLightingAnimation(int i, int i2) {
        showAnimation(getWidth(), getHeight(), i, i2);
    }

    public AdLightingAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.mPath = new Path();
        this.mClipPath = new Path();
        this.mRect = new RectF();
        this.colors = new int[]{0, 268435456, 268435456, 0};
        this.positions = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4f, 0.5f, 1.0f};
        this.playMode = 1;
        this.mDuration = 1600;
        this.mRepeatCount = -1;
        this.radius = -1;
        this.slope = 0.45f;
        this.mFlashWidth = -1;
        init(context, attributeSet);
    }
}

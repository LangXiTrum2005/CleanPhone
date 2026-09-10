package com.willy.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.ContextCompat;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class ScaleRatingBar extends AnimationRatingBar {

    /* JADX INFO: renamed from: com.willy.ratingbar.ScaleRatingBar$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public ScaleRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f0 = 20;
        this.i0 = 0.0f;
        this.j0 = -1.0f;
        this.k0 = 1.0f;
        this.l0 = 0.0f;
        this.m0 = false;
        this.n0 = true;
        this.o0 = true;
        this.p0 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f42868a);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.e0 = typedArrayObtainStyledAttributes.getInt(6, this.e0);
        this.k0 = typedArrayObtainStyledAttributes.getFloat(12, this.k0);
        this.i0 = typedArrayObtainStyledAttributes.getFloat(5, this.i0);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, this.f0);
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.s0 = typedArrayObtainStyledAttributes.hasValue(2) ? ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(2, -1)) : null;
        this.t0 = typedArrayObtainStyledAttributes.hasValue(3) ? ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(3, -1)) : null;
        this.m0 = typedArrayObtainStyledAttributes.getBoolean(4, this.m0);
        this.n0 = typedArrayObtainStyledAttributes.getBoolean(8, this.n0);
        this.o0 = typedArrayObtainStyledAttributes.getBoolean(1, this.o0);
        this.p0 = typedArrayObtainStyledAttributes.getBoolean(0, this.p0);
        typedArrayObtainStyledAttributes.recycle();
        if (this.e0 <= 0) {
            this.e0 = 5;
        }
        if (this.f0 < 0) {
            this.f0 = 0;
        }
        if (this.s0 == null) {
            this.s0 = ContextCompat.getDrawable(getContext(), com.charging.screenshow.battery.animations.themes.R.drawable.empty);
        }
        if (this.t0 == null) {
            this.t0 = ContextCompat.getDrawable(getContext(), com.charging.screenshow.battery.animations.themes.R.drawable.filled);
        }
        float f2 = this.k0;
        if (f2 > 1.0f) {
            this.k0 = 1.0f;
        } else if (f2 < 0.1f) {
            this.k0 = 0.1f;
        }
        float f3 = this.i0;
        int i2 = this.e0;
        float f4 = this.k0;
        f3 = f3 < 0.0f ? 0.0f : f3;
        float f5 = i2;
        f3 = f3 > f5 ? f5 : f3;
        this.i0 = f3 % f4 == 0.0f ? f3 : f4;
        b();
        setRating(f);
        this.y0 = UUID.randomUUID().toString();
        this.w0 = new Handler();
    }

    @Override // com.willy.ratingbar.BaseRatingBar
    public final void a(float f) {
        if (this.x0 != null) {
            this.w0.removeCallbacksAndMessages(this.y0);
        }
        for (final PartialView partialView : this.v0) {
            final int iIntValue = ((Integer) partialView.getTag()).intValue();
            final double dCeil = Math.ceil(f);
            if (iIntValue > dCeil) {
                partialView.a();
            } else {
                final float f2 = f;
                Runnable runnable = new Runnable() { // from class: com.willy.ratingbar.ScaleRatingBar.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = iIntValue;
                        double d = i2;
                        double d2 = dCeil;
                        PartialView partialView2 = partialView;
                        float f3 = f2;
                        if (d == d2) {
                            partialView2.b(f3);
                        } else {
                            partialView2.e0.setImageLevel(10000);
                            partialView2.f0.setImageLevel(0);
                        }
                        if (i2 == f3) {
                            ScaleRatingBar scaleRatingBar = ScaleRatingBar.this;
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(scaleRatingBar.getContext(), com.charging.screenshow.battery.animations.themes.R.anim.scale_up);
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(scaleRatingBar.getContext(), com.charging.screenshow.battery.animations.themes.R.anim.scale_down);
                            partialView2.startAnimation(animationLoadAnimation);
                            partialView2.startAnimation(animationLoadAnimation2);
                        }
                    }
                };
                this.x0 = runnable;
                if (this.w0 == null) {
                    this.w0 = new Handler();
                }
                this.w0.postAtTime(runnable, this.y0, SystemClock.uptimeMillis() + 15);
                f = f2;
            }
        }
    }
}

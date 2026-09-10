package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: compiled from: FadeThroughDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront extends Drawable {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Drawable f20433attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final float[] f20434dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Drawable f20435saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f20436wireman;

    public beachfront(Drawable drawable, Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new saneness();
        this.f20433attabal = drawableMutate;
        Drawable drawableMutate2 = drawable2 != null ? drawable2.getConstantState().newDrawable().mutate() : new saneness();
        this.f20435saneness = drawableMutate2;
        int layoutDirection = drawable != null ? DrawableCompat.getLayoutDirection(drawable) : 3;
        int layoutDirection2 = drawable2 != null ? DrawableCompat.getLayoutDirection(drawable2) : 3;
        DrawableCompat.setLayoutDirection(drawableMutate, layoutDirection);
        DrawableCompat.setLayoutDirection(drawableMutate2, layoutDirection2);
        drawableMutate2.setAlpha(0);
        this.f20434dern = new float[2];
    }

    public void attabal(float f) {
        if (this.f20436wireman != f) {
            this.f20436wireman = f;
            impromptu.attabal(f, this.f20434dern);
            this.f20433attabal.setAlpha((int) (this.f20434dern[0] * 255.0f));
            this.f20435saneness.setAlpha((int) (this.f20434dern[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f20433attabal.draw(canvas);
        this.f20435saneness.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f20433attabal.getIntrinsicHeight(), this.f20435saneness.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f20433attabal.getIntrinsicWidth(), this.f20435saneness.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f20433attabal.getMinimumHeight(), this.f20435saneness.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f20433attabal.getMinimumWidth(), this.f20435saneness.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f20433attabal.isStateful() || this.f20435saneness.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f20436wireman <= 0.5f) {
            this.f20433attabal.setAlpha(i);
            this.f20435saneness.setAlpha(0);
        } else {
            this.f20433attabal.setAlpha(0);
            this.f20435saneness.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f20433attabal.setBounds(i, i2, i3, i4);
        this.f20435saneness.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20433attabal.setColorFilter(colorFilter);
        this.f20435saneness.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f20433attabal.setState(iArr) || this.f20435saneness.setState(iArr);
    }

    /* JADX INFO: compiled from: FadeThroughDrawable.java */
    public static class saneness extends Drawable {
        public saneness() {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}

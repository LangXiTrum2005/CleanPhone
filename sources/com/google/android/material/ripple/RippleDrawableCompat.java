package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: loaded from: classes4.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {
    public RippleDrawableCompatState X;

    public static final class RippleDrawableCompatState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MaterialShapeDrawable f19397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19398b;

        public RippleDrawableCompatState(RippleDrawableCompatState rippleDrawableCompatState) {
            this.f19397a = (MaterialShapeDrawable) rippleDrawableCompatState.f19397a.X.newDrawable();
            this.f19398b = rippleDrawableCompatState.f19398b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            RippleDrawableCompatState rippleDrawableCompatState = new RippleDrawableCompatState(this);
            RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat();
            rippleDrawableCompat.X = rippleDrawableCompatState;
            return rippleDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.X;
        if (rippleDrawableCompatState.f19398b) {
            rippleDrawableCompatState.f19397a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.X.f19397a.getClass();
        return -3;
    }

    @Override // com.google.android.material.shape.Shapeable
    public final ShapeAppearanceModel getShapeAppearanceModel() {
        return this.X.f19397a.X.f19417a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.X = new RippleDrawableCompatState(this.X);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.X.f19397a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.X.f19397a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zD = RippleUtils.d(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.X;
        if (rippleDrawableCompatState.f19398b == zD) {
            return zOnStateChange;
        }
        rippleDrawableCompatState.f19398b = zD;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.X.f19397a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.X.f19397a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.X.f19397a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        this.X.f19397a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.X.f19397a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.X.f19397a.setTintMode(mode);
    }
}

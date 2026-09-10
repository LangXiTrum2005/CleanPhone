package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class FixedSizeDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f12814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f12815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f12816c;
    public Drawable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public State f12817e;
    public boolean f;

    public static final class State extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f12818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12820c;

        public State(Drawable.ConstantState constantState, int i2, int i3) {
            this.f12818a = constantState;
            this.f12819b = i2;
            this.f12820c = i3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new FixedSizeDrawable(this, this.f12818a.newDrawable());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new FixedSizeDrawable(this, this.f12818a.newDrawable(resources));
        }
    }

    public FixedSizeDrawable(State state, Drawable drawable) {
        this.f12817e = state;
        Preconditions.c(drawable, "Argument must not be null");
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f12814a = new Matrix();
        this.f12815b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f12816c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.concat(this.f12814a);
        this.d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.Callback getCallback() {
        return this.d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f12817e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f12817e.f12820c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f12817e.f12819b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.d = this.d.mutate();
            State state = this.f12817e;
            this.f12817e = new State(state.f12818a, state.f12819b, state.f12820c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.d.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.d.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        RectF rectF = this.f12816c;
        rectF.set(i2, i3, i4, i5);
        this.f12814a.setRectToRect(this.f12815b, rectF, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.d.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i2, PorterDuff.Mode mode) {
        this.d.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.d.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.d.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return this.d.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.d.unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        RectF rectF = this.f12816c;
        rectF.set(rect);
        this.f12814a.setRectToRect(this.f12815b, rectF, Matrix.ScaleToFit.CENTER);
    }
}

package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    public static final PorterDuff.Mode h0 = PorterDuff.Mode.SRC_IN;
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PorterDuff.Mode f4322Y;
    public boolean Z;
    public WrappedDrawableState e0;
    public boolean f0;
    public Drawable g0;

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable a() {
        return this.g0;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.g0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.g0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.e0;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.f4324b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean c(int[] iArr) {
        if (this instanceof WrappedDrawableApi21) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.e0;
        ColorStateList colorStateList = wrappedDrawableState.f4325c;
        PorterDuff.Mode mode = wrappedDrawableState.d;
        if (colorStateList == null || mode == null) {
            this.Z = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.Z && colorForState == this.X && mode == this.f4322Y) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.X = colorForState;
        this.f4322Y = mode;
        this.Z = true;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.g0.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.e0;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.g0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.e0;
        if (wrappedDrawableState == null || wrappedDrawableState.f4324b == null) {
            return null;
        }
        wrappedDrawableState.f4323a = getChangingConfigurations();
        return this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.g0.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.g0.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.g0.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return DrawableCompat.Api23Impl.a(this.g0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.g0.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.g0.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.g0.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.g0.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.g0.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.g0.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.g0.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        WrappedDrawableState wrappedDrawableState;
        ColorStateList colorStateList = ((this instanceof WrappedDrawableApi21) || (wrappedDrawableState = this.e0) == null) ? null : wrappedDrawableState.f4325c;
        return (colorStateList != null && colorStateList.isStateful()) || this.g0.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.g0.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f0 && super.mutate() == this) {
            WrappedDrawableState wrappedDrawableState = this.e0;
            WrappedDrawableState wrappedDrawableState2 = new WrappedDrawableState();
            wrappedDrawableState2.f4325c = null;
            wrappedDrawableState2.d = h0;
            if (wrappedDrawableState != null) {
                wrappedDrawableState2.f4323a = wrappedDrawableState.f4323a;
                wrappedDrawableState2.f4324b = wrappedDrawableState.f4324b;
                wrappedDrawableState2.f4325c = wrappedDrawableState.f4325c;
                wrappedDrawableState2.d = wrappedDrawableState.d;
            }
            this.e0 = wrappedDrawableState2;
            Drawable drawable = this.g0;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState3 = this.e0;
            if (wrappedDrawableState3 != null) {
                Drawable drawable2 = this.g0;
                wrappedDrawableState3.f4324b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.g0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        return DrawableCompat.Api23Impl.b(this.g0, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.g0.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.g0.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.g0.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.g0.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.g0.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.g0.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return c(iArr) || this.g0.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.e0.f4325c = colorStateList;
        c(this.g0.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.e0.d = mode;
        c(this.g0.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.g0.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

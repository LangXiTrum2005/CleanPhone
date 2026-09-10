package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class RoundRectDrawableWithShadow extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f3732b = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3733a;

    public interface RoundRectHelper {
    }

    public static float a(float f, float f2, boolean z2) {
        if (!z2) {
            return f;
        }
        return (float) (((1.0d - f3732b) * ((double) f2)) + ((double) f));
    }

    public static float b(float f, float f2, boolean z2) {
        if (!z2) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f3732b) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f3733a) {
            int i2 = getBounds().left;
            throw null;
        }
        canvas.translate(0.0f, 0.0f / 2.0f);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(b(0.0f, 0.0f, false));
        int iCeil2 = (int) Math.ceil(a(0.0f, 0.0f, false));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3733a = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }
}

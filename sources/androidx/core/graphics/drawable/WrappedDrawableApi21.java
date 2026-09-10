package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class WrappedDrawableApi21 extends WrappedDrawableApi14 {
    public static Method i0;

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.g0.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.g0.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.g0;
        if (drawable != null && (method = i0) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.g0.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.g0.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        this.g0.setTint(i2);
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.g0.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.g0.setTintMode(mode);
    }
}

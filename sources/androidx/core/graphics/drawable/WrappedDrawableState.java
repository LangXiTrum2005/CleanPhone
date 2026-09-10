package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class WrappedDrawableState extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f4324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f4325c;
    public PorterDuff.Mode d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i2 = this.f4323a;
        Drawable.ConstantState constantState = this.f4324b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        WrappedDrawableApi21 wrappedDrawableApi21 = new WrappedDrawableApi21();
        wrappedDrawableApi21.e0 = this;
        Drawable.ConstantState constantState = this.f4324b;
        if (constantState != null) {
            wrappedDrawableApi21.b(constantState.newDrawable(resources));
        }
        if (WrappedDrawableApi21.i0 == null) {
            try {
                WrappedDrawableApi21.i0 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
                return wrappedDrawableApi21;
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
        return wrappedDrawableApi21;
    }
}

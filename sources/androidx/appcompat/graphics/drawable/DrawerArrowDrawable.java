package androidx.appcompat.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3416a = (float) Math.toRadians(45.0d);

    @Retention(RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        getBounds();
        float fA = a.a((float) Math.sqrt(0.0f), 0.0f, 0.0f, 0.0f);
        Math.round((0.0f * 0.0f) + 0.0f);
        double d = fA;
        double dA = a.a(f3416a, 0.0f, 0.0f, 0.0f);
        Math.round(Math.cos(dA) * d);
        Math.round(Math.sin(dA) * d);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
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

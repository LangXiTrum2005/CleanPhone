package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class ActionBarBackgroundDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f3522a;

    public static class Api21Impl {
    }

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f3522a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3522a;
        if (actionBarContainer.l0) {
            Drawable drawable = actionBarContainer.k0;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.i0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.j0;
        if (drawable3 == null || !actionBarContainer.m0) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3522a;
        if (actionBarContainer.l0) {
            if (actionBarContainer.k0 != null) {
                actionBarContainer.i0.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.i0;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

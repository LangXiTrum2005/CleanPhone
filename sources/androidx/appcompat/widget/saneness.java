package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: ActionBarBackgroundDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends Drawable {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ActionBarContainer f5552attabal;

    /* JADX INFO: compiled from: ActionBarBackgroundDrawable.java */
    public static class attabal {
        public static void attabal(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public saneness(ActionBarContainer actionBarContainer) {
        this.f5552attabal = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f5552attabal;
        if (actionBarContainer.mIsSplit) {
            Drawable drawable = actionBarContainer.mSplitBackground;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.mBackground;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f5552attabal;
        Drawable drawable3 = actionBarContainer2.mStackedBackground;
        if (drawable3 == null || !actionBarContainer2.mIsStacked) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f5552attabal;
        if (actionBarContainer.mIsSplit) {
            if (actionBarContainer.mSplitBackground != null) {
                attabal.attabal(actionBarContainer.mBackground, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.mBackground;
            if (drawable != null) {
                attabal.attabal(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

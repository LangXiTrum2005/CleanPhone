package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public float h0;
    public float i0;
    public float j0;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$1, reason: invalid class name */
    public class AnonymousClass1 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$2, reason: invalid class name */
    public class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    private void setOverlay(boolean z2) {
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.h0;
    }

    public float getRound() {
        return this.j0;
    }

    public float getRoundPercent() {
        return this.i0;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setCrossfade(float f) {
        this.h0 = f;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.j0 = f;
            float f2 = this.i0;
            this.i0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.j0 != f;
        this.j0 = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z2) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z2 = this.i0 != f;
        this.i0 = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z2) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        throw null;
    }

    public void setWarmth(float f) {
        throw null;
    }
}

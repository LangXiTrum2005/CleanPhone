package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public float e0;
    public float f0;
    public float g0;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$1, reason: invalid class name */
    public class AnonymousClass1 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$2, reason: invalid class name */
    public class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    public static class ImageMatrix {
    }

    private void setOverlay(boolean z2) {
    }

    public float getBrightness() {
        throw null;
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.e0;
    }

    public float getRound() {
        return this.g0;
    }

    public float getRoundPercent() {
        return this.f0;
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
        this.e0 = f;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.g0 = f;
            float f2 = this.f0;
            this.f0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.g0 != f;
        this.g0 = f;
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
        boolean z2 = this.f0 != f;
        this.f0 = f;
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

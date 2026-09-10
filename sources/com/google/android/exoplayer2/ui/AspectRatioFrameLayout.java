package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X5;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X5 f808a;
    public float b;
    public int c;

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, UW.f3822a, 0, 0);
            try {
                this.c = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f808a = new X5(this);
    }

    public int getResizeMode() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.b / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        X5 x5 = this.f808a;
        if (fAbs <= 0.01f) {
            if (x5.f3955a) {
                return;
            }
            x5.f3955a = true;
            x5.b.post(x5);
            return;
        }
        int i3 = this.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.b;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.b;
                    } else {
                        f2 = this.b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.b;
            measuredWidth = (int) (f4 * f);
        }
        if (!x5.f3955a) {
            x5.f3955a = true;
            x5.b.post(x5);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable W5 w5) {
    }
}

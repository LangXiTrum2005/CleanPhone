package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class K4 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I4 f22917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22919c;
    public String d;

    public K4(Context context) {
        super(context, null);
        this.f22918b = 1.0f;
        this.f22919c = true;
        this.d = "unspecified";
        setLayerType(1, null);
    }

    private final int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(getContext() instanceof Activity)) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    private static /* synthetic */ void getMContentMode$annotations() {
    }

    private final float getScale() {
        float density = getContext().getResources().getDisplayMetrics().densityDpi / getDensity();
        this.f22918b = density;
        if (density < 0.1f) {
            this.f22918b = 0.1f;
        }
        if (this.f22918b > 5.0f) {
            this.f22918b = 5.0f;
        }
        return this.f22918b;
    }

    public final void a(Canvas canvas) {
        float fMin;
        float f;
        float f2;
        canvas.save();
        float f3 = this.f22918b;
        canvas.scale(f3, f3);
        float width = getWidth();
        float height = getHeight();
        I4 i4 = this.f22917a;
        float fC = (i4 != null ? i4.c() : 0) * this.f22918b;
        I4 i5 = this.f22917a;
        float fA = (i5 != null ? i5.a() : 0) * this.f22918b;
        String str = this.d;
        if (Intrinsics.a(str, "aspectFill")) {
            fMin = Math.max(height / fA, width / fC);
            float f4 = width - (fC * fMin);
            float f5 = 2;
            float f6 = this.f22918b * fMin;
            f = (f4 / f5) / f6;
            f2 = ((height - (fA * fMin)) / f5) / f6;
            canvas.scale(fMin, fMin);
        } else if (Intrinsics.a(str, "aspectFit")) {
            fMin = Math.min(height / fA, width / fC);
            float f7 = width - (fC * fMin);
            float f8 = 2;
            float f9 = this.f22918b * fMin;
            f = (f7 / f8) / f9;
            f2 = ((height - (fA * fMin)) / f8) / f9;
            canvas.scale(fMin, fMin);
        } else {
            fMin = height / fA;
            canvas.scale(width / fC, fMin);
            f = 0.0f;
            f2 = 0.0f;
        }
        float[] fArr = {f, f2, fMin};
        I4 i6 = this.f22917a;
        if (i6 != null) {
            i6.a(canvas, fArr[0], fArr[1]);
        }
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.f(canvas, "canvas");
        I4 i4 = this.f22917a;
        if (i4 != null) {
            if (!i4.b()) {
                a(canvas);
                return;
            }
            i4.d();
            a(canvas);
            if (this.f22919c) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f22919c = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        this.f22918b = getScale();
        Drawable drawable = getDrawable();
        I4 i4 = this.f22917a;
        int i5 = 1;
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = 1;
            }
            if (intrinsicHeight > 0) {
                i5 = intrinsicHeight;
            }
        } else if (i4 != null) {
            int iC = i4.c();
            int iA = i4.a();
            if (iC <= 0) {
                iC = 1;
            }
            i5 = iA > 0 ? iA : 1;
            intrinsicWidth = iC;
        } else {
            i5 = 0;
            intrinsicWidth = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(getPaddingLeft() + getPaddingRight() + intrinsicWidth, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(getPaddingTop() + getPaddingBottom() + i5, getSuggestedMinimumHeight()), i3));
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i2) {
        super.onScreenStateChanged(i2);
        boolean z2 = i2 == 1;
        this.f22919c = z2;
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i2) {
        Intrinsics.f(changedView, "changedView");
        super.onVisibilityChanged(changedView, i2);
        boolean z2 = i2 == 0;
        this.f22919c = z2;
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        boolean z2 = i2 == 0;
        this.f22919c = z2;
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    public final void setContentMode(String contentMode) {
        Intrinsics.f(contentMode, "contentMode");
        this.d = contentMode;
    }

    public final void setGifImpl(I4 i4) {
        this.f22917a = i4;
        if (i4 != null) {
            i4.a(this);
            i4.start();
        }
        requestLayout();
    }

    public final void setPaused(boolean z2) {
        I4 i4 = this.f22917a;
        if (i4 != null) {
            i4.a(z2);
        }
    }
}

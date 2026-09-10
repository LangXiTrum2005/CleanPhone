package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f32514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f32515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32516c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f32517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f32518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f32519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32520d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f32517a = f10;
            this.f32518b = f11;
            this.f32519c = z10;
            if (this.f32520d) {
                return;
            }
            this.f32520d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32520d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f32516c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f32515b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f32515b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f32514a.a(this.f32515b, f14, false);
            return;
        }
        int i12 = this.f32516c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f32515b;
                } else if (i12 == 4) {
                    if (f15 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f10 = this.f32515b;
                    } else {
                        f11 = this.f32515b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f32515b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f11 = this.f32515b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f32515b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f32514a.a(this.f32515b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f32515b != f10) {
            this.f32515b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        int i11 = this.f32516c;
        int i12 = 1;
        if (i10 == 1) {
            i12 = 0;
        } else if (i10 == 2) {
            i12 = 3;
        } else if (i10 == 3) {
            i12 = 4;
        } else if (i10 != 4) {
            i12 = i10 != 5 ? i11 : 2;
        }
        if (i11 != i12) {
            this.f32516c = i12;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32516c = 0;
        this.f32514a = new c();
    }

    public void setAspectRatioListener(@Nullable b bVar) {
    }
}

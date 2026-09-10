package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f32958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f32959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f32968k;
    private float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f32970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Runnable f32972p;

    public MBRotationView(Context context) {
        super(context);
        this.f32962e = 40;
        this.f32963f = 20;
        this.f32964g = 0;
        this.f32965h = 0;
        this.f32967j = 0;
        this.f32968k = 0.5f;
        this.l = 0.9f;
        this.f32969m = true;
        this.f32970n = false;
        this.f32971o = false;
        this.f32972p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f32964g * this.f32960c) / 2) / this.f32962e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f32964g) > this.f32962e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f32971o ? this.f32965h - 2 : this.f32965h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f32965h;
            } else if (this.f32971o) {
                i12 = this.f32965h;
                i11 = i12 - 1;
            } else {
                i13 = this.f32965h;
                i11 = i13 + 1;
            }
        } else if (this.f32971o) {
            i13 = this.f32965h;
            i11 = i13 + 1;
        } else {
            i12 = this.f32965h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f32970n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f32968k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f32960c = (int) (f12 * f13);
        this.f32961d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f32961d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f32960c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f32972p, 1000 / this.f32963f);
        }
        this.f32969m = z10;
    }

    public void setHeightRatio(float f10) {
        this.l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f32970n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f32968k = f10;
    }

    private void a() {
        this.f32958a = new Camera();
        this.f32959b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f32964g * this.f32961d) / 2) / this.f32962e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f32964g) > this.f32962e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f11 = -i11;
            this.f32958a.rotateX(f11);
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.rotateX(f11);
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (i12 == 1) {
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.rotateX(i11);
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f32958a.rotateX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.rotateX(-i11);
            this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32962e = 40;
        this.f32963f = 20;
        this.f32964g = 0;
        this.f32965h = 0;
        this.f32967j = 0;
        this.f32968k = 0.5f;
        this.l = 0.9f;
        this.f32969m = true;
        this.f32970n = false;
        this.f32971o = false;
        this.f32972p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f32958a.save();
        this.f32959b.reset();
        float f10 = i10;
        this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f32958a.rotateX(this.f32964g);
        this.f32958a.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i10 == 0) {
            if (this.f32971o) {
                b(this.f32960c, this.f32962e, i12);
            } else {
                b(-this.f32960c, -this.f32962e, i12);
            }
        } else if (i10 > 0) {
            b(this.f32960c, this.f32962e, i12);
        } else if (i10 < 0) {
            b(-this.f32960c, -this.f32962e, i12);
        }
        this.f32958a.getMatrix(this.f32959b);
        this.f32958a.restore();
        this.f32959b.preTranslate((-getWidth()) / 2, -i11);
        this.f32959b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f32959b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f32964g - 1;
        this.f32964g = i10;
        this.f32966i = this.f32965h;
        a(i10);
        if (this.f32969m) {
            postDelayed(this.f32972p, 1000 / this.f32963f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32962e = 40;
        this.f32963f = 20;
        this.f32964g = 0;
        this.f32965h = 0;
        this.f32967j = 0;
        this.f32968k = 0.5f;
        this.l = 0.9f;
        this.f32969m = true;
        this.f32970n = false;
        this.f32971o = false;
        this.f32972p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f32958a.save();
        this.f32959b.reset();
        float f10 = i10;
        this.f32958a.translate(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f32958a.rotateY(this.f32964g);
        this.f32958a.translate(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i10 == 0) {
            if (this.f32971o) {
                a(this.f32961d, this.f32962e, i12);
            } else {
                a(-this.f32961d, -this.f32962e, i12);
            }
        } else if (i10 > 0) {
            a(this.f32961d, this.f32962e, i12);
        } else if (i10 < 0) {
            a(-this.f32961d, -this.f32962e, i12);
        }
        this.f32958a.getMatrix(this.f32959b);
        this.f32958a.restore();
        this.f32959b.preTranslate(-i11, (-getHeight()) / 2);
        this.f32959b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f32959b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i10) {
        int i11 = this.f32962e;
        int i12 = this.f32966i - (i10 / i11);
        this.f32964g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f32958a.translate(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f11 = -i11;
            this.f32958a.rotateY(f11);
            this.f32958a.translate(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.translate(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.rotateY(f11);
            this.f32958a.translate(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f32958a.translate(f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.rotateY(i11);
            this.f32958a.translate(f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f32958a.rotateY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f13 = (-i10) / 2;
            this.f32958a.translate(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f32958a.rotateY(-i11);
            this.f32958a.translate(f13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void b(int i10) {
        int iC;
        this.f32965h = i10;
        if (Math.abs(this.f32964g) > this.f32962e / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.f32967j != iC) {
            this.f32967j = iC;
        }
    }
}

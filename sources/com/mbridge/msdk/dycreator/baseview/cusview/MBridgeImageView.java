package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f33000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f33010k;
    private float[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f33011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f33012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f33013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f33014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f33015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f33016r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f33008i, this.f33009j, this.f33012n, this.f33010k);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f33010k == null || this.l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f33010k;
                float f10 = this.f33004e;
                fArr[i13] = f10;
                this.l[i13] = f10 - (this.f33008i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f33010k;
                float f11 = this.f33005f;
                fArr2[i10] = f11;
                this.l[i10] = f11 - (this.f33008i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f33010k;
                float f12 = this.f33006g;
                fArr3[i11] = f12;
                this.l[i11] = f12 - (this.f33008i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f33010k;
                float f13 = this.f33007h;
                fArr4[i12] = f13;
                this.l[i12] = f13 - (this.f33008i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f33012n;
        if (rectF != null) {
            float f10 = this.f33008i / 2.0f;
            rectF.set(f10, f10, this.f33001b - f10, this.f33002c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f33011m;
        if (rectF != null) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f33001b, this.f33002c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f33011m, null, 31);
            int i10 = this.f33001b;
            int i11 = this.f33008i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            int i12 = this.f33002c;
            float f12 = i12;
            canvas.scale(f10 / f11, ((i12 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f33016r;
            if (paint != null) {
                paint.reset();
                this.f33016r.setAntiAlias(true);
                this.f33016r.setStyle(Paint.Style.FILL);
                this.f33016r.setXfermode(this.f33000a);
            }
            Path path = this.f33015q;
            if (path != null) {
                path.reset();
                this.f33015q.addRoundRect(this.f33011m, this.l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f33015q, this.f33016r);
            Paint paint2 = this.f33016r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f33013o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f33001b = i10;
        this.f33002c = i11;
        if (this.f33014p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f33013o = true;
        this.f33008i = i11;
        this.f33009j = i12;
        this.f33003d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f33003d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f33013o = true;
        this.f33014p = true;
        this.f33008i = i14;
        this.f33009j = i15;
        this.f33004e = i10;
        this.f33006g = i12;
        this.f33005f = i11;
        this.f33007h = i13;
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f33015q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f33015q, this.f33016r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33015q = new Path();
        this.f33016r = new Paint();
        this.f33010k = new float[8];
        this.l = new float[8];
        this.f33012n = new RectF();
        this.f33011m = new RectF();
        this.f33000a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f33015q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f33016r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f33016r.setColor(i11);
            this.f33016r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f33010k == null || this.l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f33010k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f33003d;
                fArr[i10] = f10;
                this.l[i10] = f10 - (this.f33008i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}

package com.smartdigimkt.n5;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes4.dex */
public class d extends com.smartdigimkt.n5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37088e;
    private Paint f;
    private Paint g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f37089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Canvas f37090i;
    private RectF j;
    private Bitmap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37091l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37092n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37093p;
    private int q;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = d.this.f37084a;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            if (d.this.k == null && d.this.f37090i == null) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            d.this.f37093p = (int) (((d.this.q * 2) + dVar.o + dVar.f37086c) * fFloatValue);
            d.this.f37084a.postInvalidate();
        }
    }

    public d(View view) {
        super(view);
        if (view == null) {
            return;
        }
        this.q = h.a(view.getContext(), 5.0f);
        this.f37091l = h.a(view.getContext(), 24.0f);
        this.o = h.a(view.getContext(), 30.0f);
        this.f37088e = 20;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(Color.parseColor("#cfffffff"));
        Paint paint2 = new Paint(1);
        this.g = paint2;
        paint2.setColor(-16777216);
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.f37089h = paint3;
        paint3.setColor(-16777216);
        this.f.setStrokeWidth(this.q);
        this.f.setMaskFilter(new BlurMaskFilter(this.f37088e, BlurMaskFilter.Blur.NORMAL));
        int i2 = -this.q;
        this.m = i2;
        this.f37092n = i2 - this.o;
    }

    @Override // com.smartdigimkt.n5.a
    public void b() {
        int i2;
        super.b();
        if (this.f37084a == null || (i2 = this.f37086c) == 0 || this.d == 0) {
            return;
        }
        int i3 = (int) (((double) i2) * 0.1d);
        try {
            this.o = i3;
            this.f37092n = this.m - i3;
            RectF rectF = new RectF();
            this.j = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            int i4 = this.f37086c;
            rectF.right = i4;
            int i5 = this.d;
            rectF.bottom = i5;
            this.k = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            this.f37090i = new Canvas(this.k);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public void a(int i2, int i3) {
        if (this.f37086c != i2 || this.d != i3) {
            b();
        }
        super.a(i2, i3);
    }

    @Override // com.smartdigimkt.n5.a
    public ValueAnimator a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1200L);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }

    @Override // com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public void a(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.a(canvas);
        View view = this.f37084a;
        if (view == null || view.getVisibility() != 0 || (valueAnimator = this.f37085b) == null || !valueAnimator.isStarted() || this.k == null || this.f37090i == null) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f37086c, this.d, null, 31);
        this.k.eraseColor(0);
        int i2 = this.m;
        int i3 = this.f37093p;
        canvas.drawLine(i2 + i3, 0.0f, this.f37092n + i3, this.d, this.f);
        Canvas canvas2 = this.f37090i;
        RectF rectF = this.j;
        float f = this.f37091l;
        canvas2.drawRoundRect(rectF, f, f, this.f37089h);
        canvas.drawBitmap(this.k, 0.0f, 0.0f, this.g);
        canvas.restoreToCount(iSaveLayer);
    }
}

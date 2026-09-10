package com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v5.b;

/* JADX INFO: loaded from: classes6.dex */
public class PictureVerifyView extends RoundImageView {
    private static final int A0 = 1;
    private static final int B0 = 2;
    private static final int C0 = 3;
    private static final int D0 = 4;
    private static final int E0 = 5;
    private static final int F0 = 6;
    private static final int G0 = 20;
    private int g0;
    private com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a h0;
    private com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a i0;
    private Bitmap j0;
    private Path k0;
    private Paint l0;
    private Paint m0;
    private Paint n0;
    private long o0;
    private long p0;
    private int q0;
    private boolean r0;
    private a s0;
    private com.smartdigimkt.v5.a t0;
    private int u0;
    private int v0;
    private float w0;
    private float x0;
    private float y0;
    private float z0;

    public interface a {
        void a();

        void a(long j);
    }

    public PictureVerifyView(Context context) {
        this(context, null);
    }

    private Bitmap c() {
        if (getDrawable() == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        canvas.clipPath(this.k0);
        getDrawable().draw(canvas);
        this.t0.a(getContext(), canvas, this.k0);
        return a(bitmapCreateBitmap);
    }

    private void d() {
        if (getDrawable() == null || getWidth() <= 0 || getHeight() < 0) {
            return;
        }
        if (this.h0 == null) {
            this.h0 = this.t0.a(getWidth(), getHeight(), this.q0);
        }
        if (this.i0 == null) {
            this.i0 = this.t0.b(getWidth(), getHeight(), this.q0);
        }
        if (this.k0 == null) {
            Path pathA = this.t0.a(this.q0);
            this.k0 = pathA;
            com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar = this.h0;
            pathA.offset(aVar.f38552a, aVar.f38553b);
        }
        if (this.j0 == null) {
            this.j0 = c();
        }
    }

    public void a(float f, float f2) {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar = this.i0;
        if (aVar != null) {
            this.g0 = 1;
            float f3 = this.q0 / 2.0f;
            aVar.f38552a = (int) (f - f3);
            aVar.f38553b = (int) (f2 - f3);
            this.o0 = System.currentTimeMillis();
            postInvalidate();
        }
    }

    public void b(float f, float f2) {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar = this.i0;
        if (aVar != null) {
            this.g0 = 2;
            aVar.f38552a = (int) (aVar.f38552a + f);
            aVar.f38553b = (int) (aVar.f38553b + f2);
            postInvalidate();
        }
    }

    public void callback(a aVar) {
        this.s0 = aVar;
    }

    public void down(int i2) {
        if (this.i0 != null) {
            this.o0 = System.currentTimeMillis();
            this.g0 = 1;
            com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar = this.i0;
            int width = getWidth() - this.q0;
            int i3 = this.i0.f38554c;
            aVar.f38552a = (int) (((i2 / 100.0f) * (width - (i3 * 2))) + i3);
            postInvalidate();
        }
    }

    public void e() {
        this.g0 = 4;
        this.j0 = null;
        this.h0 = null;
        this.k0 = null;
        postInvalidate();
    }

    public void f() {
        this.g0 = 6;
        postInvalidate();
    }

    public void loose() {
        this.g0 = 3;
        this.p0 = System.currentTimeMillis();
        b();
        postInvalidate();
    }

    public void move(int i2) {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar;
        if (this.v0 == i2 || (aVar = this.i0) == null) {
            return;
        }
        this.v0 = i2;
        this.g0 = 2;
        int width = getWidth() - this.q0;
        int i3 = this.i0.f38554c;
        aVar.f38552a = (int) (((i2 / 100.0f) * (width - (i3 * 2))) + i3);
        postInvalidate();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.component.RoundImageView, com.smartdigimkt.sdk.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar;
        d();
        if (getDrawable() == null) {
            return;
        }
        if (this.g0 == 5 || this.h0 == null) {
            canvas2 = canvas;
        } else {
            canvas.drawPath(this.k0, this.m0);
            com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar2 = this.h0;
            int i2 = aVar2.f38552a;
            int i3 = aVar2.f38553b;
            int i4 = this.q0;
            canvas2 = canvas;
            canvas2.drawRect(i2, i3, i2 + i4, i3 + i4, this.n0);
        }
        int i5 = this.g0;
        if ((i5 == 2 || i5 == 4 || i5 == 1 || i5 == 6) && (aVar = this.i0) != null) {
            canvas2.drawBitmap(this.j0, aVar.f38552a, aVar.f38553b, this.l0);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.k0 = null;
        this.i0 = null;
        this.h0 = null;
        this.j0.recycle();
        this.j0 = null;
        setImageBitmap(bitmap);
    }

    public void setBlockSize(int i2) {
        this.q0 = i2;
        this.k0 = null;
        this.i0 = null;
        this.h0 = null;
        this.j0 = null;
        postInvalidate();
    }

    public void setCaptchaStrategy(com.smartdigimkt.v5.a aVar) {
        this.t0 = aVar;
    }

    public void setTouchEnable(boolean z2) {
        this.r0 = z2;
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g0 = 4;
        this.q0 = 50;
        this.r0 = true;
        this.v0 = -1;
        b bVar = new b(context);
        this.t0 = bVar;
        this.m0 = bVar.b();
        Paint paint = new Paint();
        this.n0 = paint;
        paint.setColor(Color.parseColor("#B5B5B5"));
        this.n0.setStrokeWidth(h.a(getContext(), 1.0f));
        this.n0.setStyle(Paint.Style.STROKE);
        this.l0 = this.t0.a();
    }

    private void b() {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar;
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar2 = this.i0;
        if (aVar2 != null && (aVar = this.h0) != null && Math.abs(aVar2.f38552a - aVar.f38552a) < 20 && Math.abs(this.i0.f38553b - this.h0.f38553b) < 20) {
            a();
            a aVar3 = this.s0;
            if (aVar3 != null) {
                aVar3.a(this.p0 - this.o0);
                return;
            }
            return;
        }
        f();
        a aVar4 = this.s0;
        if (aVar4 != null) {
            aVar4.a();
        }
    }

    public void a() {
        this.g0 = 5;
        postInvalidate();
    }

    private Bitmap a(Bitmap bitmap) {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a aVar = this.h0;
        if (aVar == null) {
            return null;
        }
        int i2 = aVar.f38552a;
        int i3 = aVar.f38553b;
        int i4 = this.q0;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i2, i3, i4, i4);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}

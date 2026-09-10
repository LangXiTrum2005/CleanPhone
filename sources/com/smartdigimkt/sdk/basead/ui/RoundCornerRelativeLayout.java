package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {
    private Path e0;
    private Paint f0;
    private RectF g0;
    private float[] h0;

    public RoundCornerRelativeLayout(Context context) {
        super(context);
        this.h0 = new float[8];
        b();
    }

    private Path a() {
        this.e0.reset();
        this.e0.addRoundRect(this.g0, this.h0, Path.Direction.CW);
        return this.e0;
    }

    private void b() {
        float fA = h.a(getContext(), 12.0f);
        setRadius(fA, fA, fA, fA);
        this.e0 = new Path();
        this.f0 = new Paint(1);
        this.g0 = new RectF();
        this.f0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(a());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.g0.set(0.0f, 0.0f, i2, i3);
    }

    public void setRadius(int i2) {
        float fA = h.a(getContext(), i2);
        setRadius(fA, fA, fA, fA);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        float[] fArr = this.h0;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        invalidate();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h0 = new float[8];
        b();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h0 = new float[8];
        b();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.h0 = new float[8];
        b();
    }
}

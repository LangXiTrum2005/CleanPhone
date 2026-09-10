package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {
    private Paint m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f41848n;
    private Path o;
    private float[] o0;

    public RoundCornerRelativeLayout(Context context) {
        super(context);
        this.o0 = new float[8];
        o();
    }

    private Path m() {
        this.o.reset();
        this.o.addRoundRect(this.f41848n, this.o0, Path.Direction.CW);
        return this.o;
    }

    private void o() {
        float fO = o00.o(getContext(), 12.0f);
        setRadius(fO, fO, fO, fO);
        this.o = new Path();
        this.m = new Paint(1);
        this.f41848n = new RectF();
        this.m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        this.o.reset();
        this.o.addRoundRect(this.f41848n, this.o0, Path.Direction.CW);
        canvas.clipPath(this.o);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f41848n.set(0.0f, 0.0f, i2, i3);
    }

    public void setRadius(int i2) {
        float fO = o00.o(getContext(), i2);
        setRadius(fO, fO, fO, fO);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        float[] fArr = this.o0;
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
        this.o0 = new float[8];
        o();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o0 = new float[8];
        o();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.o0 = new float[8];
        o();
    }
}

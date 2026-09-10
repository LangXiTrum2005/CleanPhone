package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends View {
    private Paint JXs;
    private int LD;
    private int Lxb;
    private int OY;
    private Paint ZU;
    private Paint ebl;
    private int lc;
    private final RectF lk;

    public QAg(Context context) {
        super(context);
        this.lk = new RectF();
        Lxb();
    }

    private void Lxb() {
        Paint paint = new Paint();
        this.ZU = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.ebl = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.JXs = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.lk;
        int i = this.lc;
        canvas.drawRoundRect(rectF, i, i, this.JXs);
        RectF rectF2 = this.lk;
        int i2 = this.lc;
        canvas.drawRoundRect(rectF2, i2, i2, this.ZU);
        int i3 = this.Lxb;
        int i4 = this.LD;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.ebl);
        int i5 = this.Lxb;
        int i6 = this.LD;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.ebl);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Lxb = i;
        this.LD = i2;
        RectF rectF = this.lk;
        int i5 = this.OY;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }

    public void setBgColor(int i) {
        this.JXs.setStyle(Paint.Style.FILL);
        this.JXs.setColor(i);
    }

    public void setDislikeColor(int i) {
        this.ebl.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.ebl.setStrokeWidth(i);
    }

    public void setRadius(int i) {
        this.lc = i;
    }

    public void setStrokeColor(int i) {
        this.ZU.setStyle(Paint.Style.STROKE);
        this.ZU.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.ZU.setStrokeWidth(i);
        this.OY = i;
    }
}

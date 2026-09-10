package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends View {
    private int jpc;
    private final RectF lnr;
    private Paint mml;
    private int mo;
    private Paint mzz;
    private int qdl;
    private int ud;
    private Paint wd;

    public tvp(Context context) {
        super(context);
        this.lnr = new RectF();
        qdl();
    }

    private void qdl() {
        Paint paint = new Paint();
        this.mml = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.wd = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.mzz = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.lnr;
        int i2 = this.mo;
        canvas.drawRoundRect(rectF, i2, i2, this.mzz);
        RectF rectF2 = this.lnr;
        int i3 = this.mo;
        canvas.drawRoundRect(rectF2, i3, i3, this.mml);
        int i4 = this.qdl;
        int i5 = this.ud;
        canvas.drawLine(i4 * 0.3f, i5 * 0.3f, i4 * 0.7f, i5 * 0.7f, this.wd);
        int i6 = this.qdl;
        int i7 = this.ud;
        canvas.drawLine(i6 * 0.7f, i7 * 0.3f, i6 * 0.3f, i7 * 0.7f, this.wd);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.qdl = i2;
        this.ud = i3;
        RectF rectF = this.lnr;
        int i6 = this.jpc;
        rectF.set(i6, i6, i2 - i6, i3 - i6);
    }

    public void setBgColor(int i2) {
        this.mzz.setStyle(Paint.Style.FILL);
        this.mzz.setColor(i2);
    }

    public void setDislikeColor(int i2) {
        this.wd.setColor(i2);
    }

    public void setDislikeWidth(int i2) {
        this.wd.setStrokeWidth(i2);
    }

    public void setRadius(int i2) {
        this.mo = i2;
    }

    public void setStrokeColor(int i2) {
        this.mml.setStyle(Paint.Style.STROKE);
        this.mml.setColor(i2);
    }

    public void setStrokeWidth(int i2) {
        this.mml.setStrokeWidth(i2);
        this.jpc = i2;
    }
}

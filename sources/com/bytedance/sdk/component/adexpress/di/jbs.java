package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends View {
    private int di;
    private Paint fi;
    private final RectF ik;
    private Paint ka;
    private int lr;
    private int mj;
    private int ri;
    private Paint xha;

    public jbs(Context context) {
        super(context);
        this.ik = new RectF();
        ri();
    }

    private void ri() {
        Paint paint = new Paint();
        this.ka = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.xha = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.fi = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.ik;
        int i = this.di;
        canvas.drawRoundRect(rectF, i, i, this.fi);
        RectF rectF2 = this.ik;
        int i2 = this.di;
        canvas.drawRoundRect(rectF2, i2, i2, this.ka);
        int i3 = this.ri;
        int i4 = this.lr;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.xha);
        int i5 = this.ri;
        int i6 = this.lr;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.xha);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ri = i;
        this.lr = i2;
        RectF rectF = this.ik;
        int i5 = this.mj;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }

    public void setBgColor(int i) {
        this.fi.setStyle(Paint.Style.FILL);
        this.fi.setColor(i);
    }

    public void setDislikeColor(int i) {
        this.xha.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.xha.setStrokeWidth(i);
    }

    public void setRadius(int i) {
        this.di = i;
    }

    public void setStrokeColor(int i) {
        this.ka.setStyle(Paint.Style.STROKE);
        this.ka.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.ka.setStrokeWidth(i);
        this.mj = i;
    }
}

package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends View {
    private static final int[] Lxb = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final Paint JXs;
    private final RectF LD;
    private int OY;
    private int QAg;
    private final ArrayList<Lxb> ZU;
    private int ebl;
    private final Paint lc;
    private final RectF lk;

    public static final class Lxb {
        public float LD;
        public Paint Lxb;
        float ZU;
        float lk;

        public Lxb(Paint paint, float f, float f2, float f3) {
            this.Lxb = paint;
            this.LD = f;
            this.lk = f2;
            this.ZU = f3;
        }
    }

    public QAg(Context context) {
        super(context);
        this.LD = new RectF();
        this.lk = new RectF();
        this.ZU = new ArrayList<>();
        this.lc = new Paint();
        Paint paint = new Paint();
        this.JXs = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void Lxb() {
        if (this.ebl <= 0) {
            return;
        }
        this.lk.right = Math.max(this.QAg, (int) (((this.OY * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.LD;
        int i = this.ebl;
        canvas.drawRoundRect(rectF, i, i, this.JXs);
        RectF rectF2 = this.lk;
        int i2 = this.ebl;
        canvas.drawRoundRect(rectF2, i2, i2, this.lc);
        int iSave = canvas.save();
        canvas.translate(this.lk.right - this.QAg, 0.0f);
        for (Lxb lxb : this.ZU) {
            canvas.drawCircle(lxb.lk, lxb.ZU, lxb.LD, lxb.Lxb);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.ebl = i5;
        this.QAg = i5 * 5;
        float f = i;
        float f2 = i2;
        this.LD.set(0.0f, 0.0f, f, f2);
        this.lk.set(0.0f, 0.0f, 0.0f, f2);
        this.lc.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.ZU.clear();
        float f3 = this.ebl / 4.0f;
        for (int i6 : Lxb) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.ZU.add(new Lxb(paint, this.ebl / 2.0f, f3, f2 / 2.0f));
            f3 += (this.ebl / 2.0f) * 3.0f;
        }
        Lxb();
    }

    public void setProgress(int i) {
        int i2 = this.OY;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.OY = i;
        Lxb();
    }
}

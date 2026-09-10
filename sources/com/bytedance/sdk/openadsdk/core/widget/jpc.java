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

/* JADX INFO: loaded from: classes3.dex */
public class jpc extends View {
    private static final int[] qdl = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private int jpc;
    private final RectF lnr;
    private final ArrayList<qdl> mml;
    private final Paint mo;
    private final Paint mzz;
    private int tvp;
    private final RectF ud;
    private int wd;

    public static final class qdl {
        float lnr;
        float mml;
        public Paint qdl;
        public float ud;

        public qdl(Paint paint, float f, float f2, float f3) {
            this.qdl = paint;
            this.ud = f;
            this.lnr = f2;
            this.mml = f3;
        }
    }

    public jpc(Context context) {
        super(context);
        this.ud = new RectF();
        this.lnr = new RectF();
        this.mml = new ArrayList<>();
        this.mo = new Paint();
        Paint paint = new Paint();
        this.mzz = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void qdl() {
        if (this.wd <= 0) {
            return;
        }
        this.lnr.right = Math.max(this.tvp, (int) (((this.jpc * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.ud;
        int i2 = this.wd;
        canvas.drawRoundRect(rectF, i2, i2, this.mzz);
        RectF rectF2 = this.lnr;
        int i3 = this.wd;
        canvas.drawRoundRect(rectF2, i3, i3, this.mo);
        int iSave = canvas.save();
        canvas.translate(this.lnr.right - this.tvp, 0.0f);
        for (qdl qdlVar : this.mml) {
            canvas.drawCircle(qdlVar.lnr, qdlVar.mml, qdlVar.ud, qdlVar.qdl);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = i3 / 2;
        this.wd = i6;
        this.tvp = i6 * 5;
        float f = i2;
        float f2 = i3;
        this.ud.set(0.0f, 0.0f, f, f2);
        this.lnr.set(0.0f, 0.0f, 0.0f, f2);
        this.mo.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.mml.clear();
        float f3 = this.wd / 4.0f;
        for (int i7 : qdl) {
            Paint paint = new Paint();
            paint.setColor(i7);
            this.mml.add(new qdl(paint, this.wd / 2.0f, f3, f2 / 2.0f));
            f3 += (this.wd / 2.0f) * 3.0f;
        }
        qdl();
    }

    public void setProgress(int i2) {
        int i3 = this.jpc;
        if (i3 == i2) {
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 100) {
            i2 = 100;
        }
        if (i3 == i2) {
            return;
        }
        this.jpc = i2;
        qdl();
    }
}

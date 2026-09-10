package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class jpc extends qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> fs;
    private final Paint jpc;
    private final mzz rq;
    private final Path to;
    private final float[] tvp;
    private final RectF wd;

    public jpc(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar) {
        super(tvpVar, mzzVar);
        this.wd = new RectF();
        com.bytedance.adsdk.ud.qdl.qdl qdlVar = new com.bytedance.adsdk.ud.qdl.qdl();
        this.jpc = qdlVar;
        this.tvp = new float[8];
        this.to = new Path();
        this.rq = mzzVar;
        qdlVar.setAlpha(0);
        qdlVar.setStyle(Paint.Style.FILL);
        qdlVar.setColor(mzzVar.jtx());
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        super.qdl(rectF, matrix, z2);
        this.wd.set(0.0f, 0.0f, this.rq.jl(), this.rq.yt());
        this.qdl.mapRect(this.wd);
        rectF.set(this.wd);
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i2) {
        super.ud(canvas, matrix, i2);
        int iAlpha = Color.alpha(this.rq.jtx());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.mml.qdl() == null ? 100 : this.mml.qdl().wd().intValue())) / 100.0f) * (i2 / 255.0f) * 255.0f);
        this.jpc.setAlpha(iIntValue);
        com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> qdlVar = this.fs;
        if (qdlVar != null) {
            this.jpc.setColorFilter(qdlVar.wd());
        }
        if (iIntValue > 0) {
            float[] fArr = this.tvp;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.rq.jl();
            float[] fArr2 = this.tvp;
            fArr2[3] = 0.0f;
            fArr2[4] = this.rq.jl();
            this.tvp[5] = this.rq.yt();
            float[] fArr3 = this.tvp;
            fArr3[6] = 0.0f;
            fArr3[7] = this.rq.yt();
            matrix.mapPoints(this.tvp);
            this.to.reset();
            Path path = this.to;
            float[] fArr4 = this.tvp;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.to;
            float[] fArr5 = this.tvp;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.to;
            float[] fArr6 = this.tvp;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.to;
            float[] fArr7 = this.tvp;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.to;
            float[] fArr8 = this.tvp;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.to.close();
            canvas.drawPath(this.to, this.jpc);
        }
    }
}

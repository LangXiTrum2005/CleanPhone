package com.bytedance.adsdk.LD.lk.lk;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class OY extends Lxb {
    private final JXs JVA;
    private final Paint OY;
    private final float[] QAg;
    private final RectF ebl;
    private final Path nBu;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> sLN;

    public OY(com.bytedance.adsdk.LD.QAg qAg, JXs jXs) {
        super(qAg, jXs);
        this.ebl = new RectF();
        com.bytedance.adsdk.LD.Lxb.Lxb lxb = new com.bytedance.adsdk.LD.Lxb.Lxb();
        this.OY = lxb;
        this.QAg = new float[8];
        this.nBu = new Path();
        this.JVA = jXs;
        lxb.setAlpha(0);
        lxb.setStyle(Paint.Style.FILL);
        lxb.setColor(jXs.VVE());
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        super.LD(canvas, matrix, i);
        int iAlpha = Color.alpha(this.JVA.VVE());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.ZU.Lxb() == null ? 100 : this.ZU.Lxb().ebl().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        this.OY.setAlpha(iIntValue);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> lxb = this.sLN;
        if (lxb != null) {
            this.OY.setColorFilter(lxb.ebl());
        }
        if (iIntValue > 0) {
            float[] fArr = this.QAg;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.JVA.brP();
            float[] fArr2 = this.QAg;
            fArr2[3] = 0.0f;
            fArr2[4] = this.JVA.brP();
            this.QAg[5] = this.JVA.kqm();
            float[] fArr3 = this.QAg;
            fArr3[6] = 0.0f;
            fArr3[7] = this.JVA.kqm();
            matrix.mapPoints(this.QAg);
            this.nBu.reset();
            Path path = this.nBu;
            float[] fArr4 = this.QAg;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.nBu;
            float[] fArr5 = this.QAg;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.nBu;
            float[] fArr6 = this.QAg;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.nBu;
            float[] fArr7 = this.QAg;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.nBu;
            float[] fArr8 = this.QAg;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.nBu.close();
            canvas.drawPath(this.nBu, this.OY);
        }
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        super.Lxb(rectF, matrix, z);
        this.ebl.set(0.0f, 0.0f, this.JVA.brP(), this.JVA.kqm());
        this.Lxb.mapRect(this.ebl);
        rectF.set(this.ebl);
    }
}

package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* JADX INFO: loaded from: classes.dex */
public class QAg extends Lxb {
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU, com.bytedance.adsdk.LD.lk.LD.ZU> JVA;
    private final boolean JXs;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> NXR;
    private final RectF OY;
    private final com.bytedance.adsdk.LD.lk.LD.ebl QAg;
    private com.bytedance.adsdk.LD.Lxb.LD.kqm STP;
    private final String ZU;
    private final LongSparseArray<RadialGradient> ebl;
    private final LongSparseArray<LinearGradient> lc;
    private final int nBu;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> sLN;

    public QAg(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.lc lcVar) {
        super(qAg, lxb, lcVar.OY().Lxb(), lcVar.QAg().Lxb(), lcVar.sLN(), lcVar.ZU(), lcVar.ebl(), lcVar.nBu(), lcVar.JVA());
        this.lc = new LongSparseArray<>();
        this.ebl = new LongSparseArray<>();
        this.OY = new RectF();
        this.ZU = lcVar.Lxb();
        this.QAg = lcVar.LD();
        this.JXs = lcVar.NXR();
        this.nBu = (int) (qAg.id().JXs() / 32.0f);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU, com.bytedance.adsdk.LD.lk.LD.ZU> Lxb = lcVar.lk().Lxb();
        this.JVA = Lxb;
        Lxb.Lxb(this);
        lxb.Lxb(Lxb);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb2 = lcVar.JXs().Lxb();
        this.sLN = Lxb2;
        Lxb2.Lxb(this);
        lxb.Lxb(Lxb2);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb3 = lcVar.lc().Lxb();
        this.NXR = Lxb3;
        Lxb3.Lxb(this);
        lxb.Lxb(Lxb3);
    }

    private LinearGradient LD() {
        long jZU = ZU();
        LinearGradient linearGradient = this.lc.get(jZU);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFEbl = this.sLN.ebl();
        PointF pointFEbl2 = this.NXR.ebl();
        com.bytedance.adsdk.LD.lk.LD.ZU zuEbl = this.JVA.ebl();
        LinearGradient linearGradient2 = new LinearGradient(pointFEbl.x, pointFEbl.y, pointFEbl2.x, pointFEbl2.y, Lxb(zuEbl.LD()), zuEbl.Lxb(), Shader.TileMode.CLAMP);
        this.lc.put(jZU, linearGradient2);
        return linearGradient2;
    }

    private int ZU() {
        int iRound = Math.round(this.sLN.OY() * this.nBu);
        int iRound2 = Math.round(this.NXR.OY() * this.nBu);
        int iRound3 = Math.round(this.JVA.OY() * this.nBu);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private RadialGradient lk() {
        long jZU = ZU();
        RadialGradient radialGradient = this.ebl.get(jZU);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFEbl = this.sLN.ebl();
        PointF pointFEbl2 = this.NXR.ebl();
        com.bytedance.adsdk.LD.lk.LD.ZU zuEbl = this.JVA.ebl();
        int[] iArrLxb = Lxb(zuEbl.LD());
        float[] fArrLxb = zuEbl.Lxb();
        float f = pointFEbl.x;
        float f2 = pointFEbl.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot(pointFEbl2.x - f, pointFEbl2.y - f2), iArrLxb, fArrLxb, Shader.TileMode.CLAMP);
        this.ebl.put(jZU, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        if (this.JXs) {
            return;
        }
        Lxb(this.OY, matrix, false);
        Shader shaderLD = this.QAg == com.bytedance.adsdk.LD.lk.LD.ebl.LINEAR ? LD() : lk();
        shaderLD.setLocalMatrix(matrix);
        this.LD.setShader(shaderLD);
        super.Lxb(canvas, matrix, i);
    }

    private int[] Lxb(int[] iArr) {
        if (this.STP == null) {
            return iArr;
        }
        throw null;
    }
}

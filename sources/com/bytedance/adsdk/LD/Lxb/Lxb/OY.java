package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OY implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JVA, JXs {
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> DY;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> IeN;
    private final com.bytedance.adsdk.LD.lk.LD.ebl JVA;
    private final String LD;
    float Lxb;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> NXR;
    private final Paint OY;
    private final RectF QAg;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> STP;
    private com.bytedance.adsdk.LD.Lxb.LD.lk Sfi;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> VVE;
    private final com.bytedance.adsdk.LD.lk.lk.Lxb ZU;
    private final com.bytedance.adsdk.LD.QAg brP;
    private final Path ebl;
    private com.bytedance.adsdk.LD.Lxb.LD.kqm kqm;
    private final boolean lk;
    private final List<NXR> nBu;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU, com.bytedance.adsdk.LD.lk.LD.ZU> sLN;
    private final int tD;
    private final LongSparseArray<LinearGradient> JXs = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> lc = new LongSparseArray<>();

    public OY(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.JXs jXs) {
        Path path = new Path();
        this.ebl = path;
        this.OY = new com.bytedance.adsdk.LD.Lxb.Lxb(1);
        this.QAg = new RectF();
        this.nBu = new ArrayList();
        this.Lxb = 0.0f;
        this.ZU = lxb;
        this.LD = jXs.Lxb();
        this.lk = jXs.OY();
        this.brP = qAg;
        this.JVA = jXs.LD();
        path.setFillType(jXs.lk());
        this.tD = (int) (eblVar.JXs() / 32.0f);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU, com.bytedance.adsdk.LD.lk.LD.ZU> Lxb = jXs.ZU().Lxb();
        this.sLN = Lxb;
        Lxb.Lxb(this);
        lxb.Lxb(Lxb);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> Lxb2 = jXs.JXs().Lxb();
        this.NXR = Lxb2;
        Lxb2.Lxb(this);
        lxb.Lxb(Lxb2);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb3 = jXs.lc().Lxb();
        this.STP = Lxb3;
        Lxb3.Lxb(this);
        lxb.Lxb(Lxb3);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb4 = jXs.ebl().Lxb();
        this.IeN = Lxb4;
        Lxb4.Lxb(this);
        lxb.Lxb(Lxb4);
        if (lxb.nBu() != null) {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb5 = lxb.nBu().Lxb().Lxb();
            this.DY = Lxb5;
            Lxb5.Lxb(this);
            lxb.Lxb(this.DY);
        }
        if (lxb.JVA() != null) {
            this.Sfi = new com.bytedance.adsdk.LD.Lxb.LD.lk(this, lxb, lxb.JVA());
        }
    }

    private LinearGradient LD() {
        long jZU = ZU();
        LinearGradient linearGradient = this.JXs.get(jZU);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFEbl = this.STP.ebl();
        PointF pointFEbl2 = this.IeN.ebl();
        com.bytedance.adsdk.LD.lk.LD.ZU zuEbl = this.sLN.ebl();
        LinearGradient linearGradient2 = new LinearGradient(pointFEbl.x, pointFEbl.y, pointFEbl2.x, pointFEbl2.y, Lxb(zuEbl.LD()), zuEbl.Lxb(), Shader.TileMode.CLAMP);
        this.JXs.put(jZU, linearGradient2);
        return linearGradient2;
    }

    private int ZU() {
        int iRound = Math.round(this.STP.OY() * this.tD);
        int iRound2 = Math.round(this.IeN.OY() * this.tD);
        int iRound3 = Math.round(this.sLN.OY() * this.tD);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private RadialGradient lk() {
        long jZU = ZU();
        RadialGradient radialGradient = this.lc.get(jZU);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFEbl = this.STP.ebl();
        PointF pointFEbl2 = this.IeN.ebl();
        com.bytedance.adsdk.LD.lk.LD.ZU zuEbl = this.sLN.ebl();
        int[] iArrLxb = Lxb(zuEbl.LD());
        float[] fArrLxb = zuEbl.Lxb();
        float f = pointFEbl.x;
        float f2 = pointFEbl.y;
        float fHypot = (float) Math.hypot(pointFEbl2.x - f, pointFEbl2.y - f2);
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot <= 0.0f ? 0.001f : fHypot, iArrLxb, fArrLxb, Shader.TileMode.CLAMP);
        this.lc.put(jZU, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        this.brP.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        for (int i = 0; i < list2.size(); i++) {
            lk lkVar = list2.get(i);
            if (lkVar instanceof NXR) {
                this.nBu.add((NXR) lkVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        Shader shaderLk;
        if (this.lk) {
            return;
        }
        com.bytedance.adsdk.LD.JXs.Lxb("GradientFillContent#draw");
        this.ebl.reset();
        for (int i2 = 0; i2 < this.nBu.size(); i2++) {
            this.ebl.addPath(this.nBu.get(i2).ZU(), matrix);
        }
        this.ebl.computeBounds(this.QAg, false);
        if (this.JVA == com.bytedance.adsdk.LD.lk.LD.ebl.LINEAR) {
            shaderLk = LD();
        } else {
            shaderLk = lk();
        }
        shaderLk.setLocalMatrix(matrix);
        this.OY.setShader(shaderLk);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> lxb = this.VVE;
        if (lxb != null) {
            this.OY.setColorFilter(lxb.ebl());
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb2 = this.DY;
        if (lxb2 != null) {
            float fFloatValue = lxb2.ebl().floatValue();
            if (fFloatValue == 0.0f) {
                this.OY.setMaskFilter(null);
            } else if (fFloatValue != this.Lxb) {
                this.OY.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.Lxb = fFloatValue;
        }
        com.bytedance.adsdk.LD.Lxb.LD.lk lkVar = this.Sfi;
        if (lkVar != null) {
            lkVar.Lxb(this.OY);
        }
        this.OY.setAlpha(com.bytedance.adsdk.LD.lc.JXs.Lxb((int) ((((i / 255.0f) * this.NXR.ebl().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.ebl, this.OY);
        com.bytedance.adsdk.LD.JXs.LD("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        this.ebl.reset();
        for (int i = 0; i < this.nBu.size(); i++) {
            this.ebl.addPath(this.nBu.get(i).ZU(), matrix);
        }
        this.ebl.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] Lxb(int[] iArr) {
        if (this.kqm == null) {
            return iArr;
        }
        throw null;
    }
}

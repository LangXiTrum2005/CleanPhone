package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class VVE {
    private ZU JVA;
    private final float[] JXs;
    private final Matrix LD;
    private final Matrix Lxb = new Matrix();
    private Lxb<?, Float> NXR;
    private Lxb<com.bytedance.adsdk.LD.ebl.lk, com.bytedance.adsdk.LD.ebl.lk> OY;
    private Lxb<Float, Float> QAg;
    private Lxb<?, Float> STP;
    private final Matrix ZU;
    private Lxb<?, PointF> ebl;
    private Lxb<PointF, PointF> lc;
    private final Matrix lk;
    private Lxb<Integer, Integer> nBu;
    private ZU sLN;

    public VVE(com.bytedance.adsdk.LD.lk.Lxb.sLN sln) {
        this.lc = sln.Lxb() == null ? null : sln.Lxb().Lxb();
        this.ebl = sln.LD() == null ? null : sln.LD().Lxb();
        this.OY = sln.lk() == null ? null : sln.lk().Lxb();
        this.QAg = sln.ZU() == null ? null : sln.ZU().Lxb();
        ZU zu = sln.OY() == null ? null : (ZU) sln.OY().Lxb();
        this.JVA = zu;
        if (zu != null) {
            this.LD = new Matrix();
            this.lk = new Matrix();
            this.ZU = new Matrix();
            this.JXs = new float[9];
        } else {
            this.LD = null;
            this.lk = null;
            this.ZU = null;
            this.JXs = null;
        }
        this.sLN = sln.QAg() == null ? null : (ZU) sln.QAg().Lxb();
        if (sln.JXs() != null) {
            this.nBu = sln.JXs().Lxb();
        }
        if (sln.lc() != null) {
            this.NXR = sln.lc().Lxb();
        } else {
            this.NXR = null;
        }
        if (sln.ebl() != null) {
            this.STP = sln.ebl().Lxb();
        } else {
            this.STP = null;
        }
    }

    private void JXs() {
        for (int i = 0; i < 9; i++) {
            this.JXs[i] = 0.0f;
        }
    }

    public Lxb<?, Float> LD() {
        return this.NXR;
    }

    public void Lxb(com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        lxb.Lxb(this.nBu);
        lxb.Lxb(this.NXR);
        lxb.Lxb(this.STP);
        lxb.Lxb(this.lc);
        lxb.Lxb(this.ebl);
        lxb.Lxb(this.OY);
        lxb.Lxb(this.QAg);
        lxb.Lxb(this.JVA);
        lxb.Lxb(this.sLN);
    }

    public Matrix ZU() {
        PointF pointFEbl;
        PointF pointFEbl2;
        this.Lxb.reset();
        Lxb<?, PointF> lxb = this.ebl;
        if (lxb != null && (pointFEbl2 = lxb.ebl()) != null) {
            float f = pointFEbl2.x;
            if (f != 0.0f || pointFEbl2.y != 0.0f) {
                this.Lxb.preTranslate(f, pointFEbl2.y);
            }
        }
        Lxb<Float, Float> lxb2 = this.QAg;
        if (lxb2 != null) {
            float fFloatValue = lxb2 instanceof kqm ? lxb2.ebl().floatValue() : ((ZU) lxb2).QAg();
            if (fFloatValue != 0.0f) {
                this.Lxb.preRotate(fFloatValue);
            }
        }
        ZU zu = this.JVA;
        if (zu != null) {
            ZU zu2 = this.sLN;
            float fCos = zu2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-zu2.QAg()) + 90.0f));
            ZU zu3 = this.sLN;
            float fSin = zu3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-zu3.QAg()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(zu.QAg()));
            JXs();
            float[] fArr = this.JXs;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.LD.setValues(fArr);
            JXs();
            float[] fArr2 = this.JXs;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.lk.setValues(fArr2);
            JXs();
            float[] fArr3 = this.JXs;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.ZU.setValues(fArr3);
            this.lk.preConcat(this.LD);
            this.ZU.preConcat(this.lk);
            this.Lxb.preConcat(this.ZU);
        }
        Lxb<com.bytedance.adsdk.LD.ebl.lk, com.bytedance.adsdk.LD.ebl.lk> lxb3 = this.OY;
        if (lxb3 != null) {
            com.bytedance.adsdk.LD.ebl.lk lkVarEbl = lxb3.ebl();
            if (lkVarEbl.Lxb() != 1.0f || lkVarEbl.LD() != 1.0f) {
                this.Lxb.preScale(lkVarEbl.Lxb(), lkVarEbl.LD());
            }
        }
        Lxb<PointF, PointF> lxb4 = this.lc;
        if (lxb4 != null && (((pointFEbl = lxb4.ebl()) != null && pointFEbl.x != 0.0f) || pointFEbl.y != 0.0f)) {
            this.Lxb.preTranslate(-pointFEbl.x, -pointFEbl.y);
        }
        return this.Lxb;
    }

    public Lxb<?, Float> lk() {
        return this.STP;
    }

    public Matrix LD(float f) {
        Lxb<?, PointF> lxb = this.ebl;
        PointF pointFEbl = lxb == null ? null : lxb.ebl();
        Lxb<com.bytedance.adsdk.LD.ebl.lk, com.bytedance.adsdk.LD.ebl.lk> lxb2 = this.OY;
        com.bytedance.adsdk.LD.ebl.lk lkVarEbl = lxb2 == null ? null : lxb2.ebl();
        this.Lxb.reset();
        if (pointFEbl != null) {
            this.Lxb.preTranslate(pointFEbl.x * f, pointFEbl.y * f);
        }
        if (lkVarEbl != null) {
            double d = f;
            this.Lxb.preScale((float) Math.pow(lkVarEbl.Lxb(), d), (float) Math.pow(lkVarEbl.LD(), d));
        }
        Lxb<Float, Float> lxb3 = this.QAg;
        if (lxb3 != null) {
            float fFloatValue = lxb3.ebl().floatValue();
            Lxb<PointF, PointF> lxb4 = this.lc;
            PointF pointFEbl2 = lxb4 != null ? lxb4.ebl() : null;
            this.Lxb.preRotate(fFloatValue * f, pointFEbl2 == null ? 0.0f : pointFEbl2.x, pointFEbl2 != null ? pointFEbl2.y : 0.0f);
        }
        return this.Lxb;
    }

    public void Lxb(Lxb.InterfaceC0024Lxb interfaceC0024Lxb) {
        Lxb<Integer, Integer> lxb = this.nBu;
        if (lxb != null) {
            lxb.Lxb(interfaceC0024Lxb);
        }
        Lxb<?, Float> lxb2 = this.NXR;
        if (lxb2 != null) {
            lxb2.Lxb(interfaceC0024Lxb);
        }
        Lxb<?, Float> lxb3 = this.STP;
        if (lxb3 != null) {
            lxb3.Lxb(interfaceC0024Lxb);
        }
        Lxb<PointF, PointF> lxb4 = this.lc;
        if (lxb4 != null) {
            lxb4.Lxb(interfaceC0024Lxb);
        }
        Lxb<?, PointF> lxb5 = this.ebl;
        if (lxb5 != null) {
            lxb5.Lxb(interfaceC0024Lxb);
        }
        Lxb<com.bytedance.adsdk.LD.ebl.lk, com.bytedance.adsdk.LD.ebl.lk> lxb6 = this.OY;
        if (lxb6 != null) {
            lxb6.Lxb(interfaceC0024Lxb);
        }
        Lxb<Float, Float> lxb7 = this.QAg;
        if (lxb7 != null) {
            lxb7.Lxb(interfaceC0024Lxb);
        }
        ZU zu = this.JVA;
        if (zu != null) {
            zu.Lxb(interfaceC0024Lxb);
        }
        ZU zu2 = this.sLN;
        if (zu2 != null) {
            zu2.Lxb(interfaceC0024Lxb);
        }
    }

    public void Lxb(float f) {
        Lxb<Integer, Integer> lxb = this.nBu;
        if (lxb != null) {
            lxb.Lxb(f);
        }
        Lxb<?, Float> lxb2 = this.NXR;
        if (lxb2 != null) {
            lxb2.Lxb(f);
        }
        Lxb<?, Float> lxb3 = this.STP;
        if (lxb3 != null) {
            lxb3.Lxb(f);
        }
        Lxb<PointF, PointF> lxb4 = this.lc;
        if (lxb4 != null) {
            lxb4.Lxb(f);
        }
        Lxb<?, PointF> lxb5 = this.ebl;
        if (lxb5 != null) {
            lxb5.Lxb(f);
        }
        Lxb<com.bytedance.adsdk.LD.ebl.lk, com.bytedance.adsdk.LD.ebl.lk> lxb6 = this.OY;
        if (lxb6 != null) {
            lxb6.Lxb(f);
        }
        Lxb<Float, Float> lxb7 = this.QAg;
        if (lxb7 != null) {
            lxb7.Lxb(f);
        }
        ZU zu = this.JVA;
        if (zu != null) {
            zu.Lxb(f);
        }
        ZU zu2 = this.sLN;
        if (zu2 != null) {
            zu2.Lxb(f);
        }
    }

    public Lxb<?, Integer> Lxb() {
        return this.nBu;
    }
}

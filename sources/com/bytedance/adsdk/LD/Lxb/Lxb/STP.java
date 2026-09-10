package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Path;
import android.graphics.PointF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class STP implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JVA, NXR {
    private boolean IeN;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> JVA;
    private final boolean JXs;
    private final String LD;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> NXR;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, PointF> OY;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> QAg;
    private final com.bytedance.adsdk.LD.lk.LD.nBu.Lxb ZU;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> ebl;
    private final boolean lc;
    private final com.bytedance.adsdk.LD.QAg lk;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> nBu;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> sLN;
    private final Path Lxb = new Path();
    private final LD STP = new LD();

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.Lxb.Lxb.STP$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.adsdk.LD.lk.LD.nBu.Lxb.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.adsdk.LD.lk.LD.nBu.Lxb.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.LD.nBu.Lxb.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public STP(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.nBu nbu) {
        this.lk = qAg;
        this.LD = nbu.Lxb();
        com.bytedance.adsdk.LD.lk.LD.nBu.Lxb lxbLD = nbu.LD();
        this.ZU = lxbLD;
        this.JXs = nbu.nBu();
        this.lc = nbu.JVA();
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb = nbu.lk().Lxb();
        this.ebl = Lxb;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb2 = nbu.ZU().Lxb();
        this.OY = Lxb2;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb3 = nbu.JXs().Lxb();
        this.QAg = Lxb3;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb4 = nbu.ebl().Lxb();
        this.JVA = Lxb4;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb5 = nbu.QAg().Lxb();
        this.NXR = Lxb5;
        com.bytedance.adsdk.LD.lk.LD.nBu.Lxb lxb2 = com.bytedance.adsdk.LD.lk.LD.nBu.Lxb.STAR;
        if (lxbLD == lxb2) {
            this.nBu = nbu.lc().Lxb();
            this.sLN = nbu.OY().Lxb();
        } else {
            this.nBu = null;
            this.sLN = null;
        }
        lxb.Lxb(Lxb);
        lxb.Lxb(Lxb2);
        lxb.Lxb(Lxb3);
        lxb.Lxb(Lxb4);
        lxb.Lxb(Lxb5);
        if (lxbLD == lxb2) {
            lxb.Lxb(this.nBu);
            lxb.Lxb(this.sLN);
        }
        Lxb.Lxb(this);
        Lxb2.Lxb(this);
        Lxb3.Lxb(this);
        Lxb4.Lxb(this);
        Lxb5.Lxb(this);
        if (lxbLD == lxb2) {
            this.nBu.Lxb(this);
            this.sLN.Lxb(this);
        }
    }

    private void JXs() {
        int iFloor = (int) Math.floor(this.ebl.ebl().floatValue());
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb = this.QAg;
        double radians = Math.toRadians((lxb == null ? 0.0d : lxb.ebl().floatValue()) - 90.0d);
        double d = iFloor;
        float fFloatValue = this.NXR.ebl().floatValue() / 100.0f;
        float fFloatValue2 = this.JVA.ebl().floatValue();
        double d2 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d2);
        float fSin = (float) (Math.sin(radians) * d2);
        this.Lxb.moveTo(fCos, fSin);
        double d3 = (float) (6.283185307179586d / d);
        double d4 = radians + d3;
        double dCeil = Math.ceil(d);
        int i = 0;
        while (i < dCeil) {
            float fCos2 = (float) (Math.cos(d4) * d2);
            double d5 = dCeil;
            float fSin2 = (float) (Math.sin(d4) * d2);
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.Lxb.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan3)) * f), fSin2 + (f * ((float) Math.sin(dAtan3))), fCos2, fSin2);
            } else {
                this.Lxb.lineTo(fCos2, fSin2);
            }
            d4 += d3;
            i++;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d5;
            d2 = d2;
            d3 = d3;
        }
        PointF pointFEbl = this.OY.ebl();
        this.Lxb.offset(pointFEbl.x, pointFEbl.y);
        this.Lxb.close();
    }

    private void LD() {
        this.IeN = false;
        this.lk.invalidateSelf();
    }

    private void lk() {
        float f;
        float f2;
        double d;
        float fSin;
        float fW;
        float f3;
        float f4;
        float fFloatValue = this.ebl.ebl().floatValue();
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb = this.QAg;
        double radians = Math.toRadians((lxb == null ? 0.0d : lxb.ebl().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f5 = (float) (6.283185307179586d / d2);
        if (this.lc) {
            f5 *= -1.0f;
        }
        float f6 = f5 / 2.0f;
        float f7 = fFloatValue - ((int) fFloatValue);
        if (f7 != 0.0f) {
            radians += (double) ((1.0f - f7) * f6);
        }
        float fFloatValue2 = this.JVA.ebl().floatValue();
        float fFloatValue3 = this.nBu.ebl().floatValue();
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb2 = this.sLN;
        float fFloatValue4 = lxb2 != null ? lxb2.ebl().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb3 = this.NXR;
        float fFloatValue5 = lxb3 != null ? lxb3.ebl().floatValue() / 100.0f : 0.0f;
        if (f7 != 0.0f) {
            fW = AbstractC5044xl.w(fFloatValue2, fFloatValue3, f7, fFloatValue3);
            double d3 = fW;
            float fCos = (float) (Math.cos(radians) * d3);
            fSin = (float) (Math.sin(radians) * d3);
            this.Lxb.moveTo(fCos, fSin);
            d = radians + ((double) ((f5 * f7) / 2.0f));
            f = fCos;
            f2 = f6;
        } else {
            double d4 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d4);
            float fSin2 = (float) (d4 * Math.sin(radians));
            this.Lxb.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f6;
            d = radians + ((double) f2);
            fSin = fSin2;
            fW = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i = 0;
        float f8 = f2;
        float f9 = f;
        boolean z = false;
        while (true) {
            double d5 = i;
            if (d5 >= dCeil) {
                PointF pointFEbl = this.OY.ebl();
                this.Lxb.offset(pointFEbl.x, pointFEbl.y);
                this.Lxb.close();
                return;
            }
            float f10 = z ? fFloatValue2 : fFloatValue3;
            float f11 = (fW == 0.0f || d5 != dCeil - 2.0d) ? f8 : (f5 * f7) / 2.0f;
            if (fW == 0.0f || d5 != dCeil - 1.0d) {
                fW = f10;
            }
            double d6 = fW;
            double d7 = dCeil;
            float fCos3 = (float) (Math.cos(d) * d6);
            float fSin3 = (float) (d6 * Math.sin(d));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.Lxb.lineTo(fCos3, fSin3);
                f3 = fFloatValue4;
                f4 = fFloatValue5;
            } else {
                f3 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f9) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f4 = fFloatValue5;
                double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin5 = (float) Math.sin(dAtan3);
                float f12 = z ? f3 : f4;
                float f13 = z ? f4 : f3;
                float f14 = (z ? fFloatValue3 : fFloatValue2) * f12 * 0.47829f;
                float f15 = fCos4 * f14;
                float f16 = f14 * fSin4;
                float f17 = (z ? fFloatValue2 : fFloatValue3) * f13 * 0.47829f;
                float f18 = fCos5 * f17;
                float f19 = f17 * fSin5;
                if (f7 != 0.0f) {
                    if (i == 0) {
                        f15 *= f7;
                        f16 *= f7;
                    } else if (d5 == d7 - 1.0d) {
                        f18 *= f7;
                        f19 *= f7;
                    }
                }
                this.Lxb.cubicTo(f9 - f15, fSin - f16, fCos3 + f18, fSin3 + f19, fCos3, fSin3);
            }
            d += (double) f11;
            z = !z;
            i++;
            f9 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f4;
            fFloatValue4 = f3;
            fW = fW;
            f5 = f5;
            dCeil = d7;
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        LD();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.NXR
    public Path ZU() {
        if (this.IeN) {
            return this.Lxb;
        }
        this.Lxb.reset();
        if (this.JXs) {
            this.IeN = true;
            return this.Lxb;
        }
        int i = AnonymousClass1.Lxb[this.ZU.ordinal()];
        if (i == 1) {
            lk();
        } else if (i == 2) {
            JXs();
        }
        this.Lxb.close();
        this.STP.Lxb(this.Lxb);
        this.IeN = true;
        return this.Lxb;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        for (int i = 0; i < list.size(); i++) {
            lk lkVar = list.get(i);
            if (lkVar instanceof Sfi) {
                Sfi sfi = (Sfi) lkVar;
                if (sfi.LD() == com.bytedance.adsdk.LD.lk.LD.tD.Lxb.SIMULTANEOUSLY) {
                    this.STP.Lxb(sfi);
                    sfi.Lxb(this);
                }
            }
        }
    }
}

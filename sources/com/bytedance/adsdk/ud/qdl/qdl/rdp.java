package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.v4.media.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rdp implements exu, rq, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private boolean bjy;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> exu;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> fs;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, PointF> jpc;
    private final com.bytedance.adsdk.ud.tvp lnr;
    private final com.bytedance.adsdk.ud.lnr.ud.to.qdl mml;
    private final boolean mo;
    private final boolean mzz;
    private final Path qdl = new Path();
    private final ud rdp = new ud();
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> rq;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> to;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> tvp;
    private final String ud;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> wd;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.qdl.qdl.rdp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ud.lnr.ud.to.qdl.values().length];
            qdl = iArr;
            try {
                iArr[com.bytedance.adsdk.ud.lnr.ud.to.qdl.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[com.bytedance.adsdk.ud.lnr.ud.to.qdl.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public rdp(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.to toVar) {
        this.lnr = tvpVar;
        this.ud = toVar.qdl();
        com.bytedance.adsdk.ud.lnr.ud.to.qdl qdlVarUd = toVar.ud();
        this.mml = qdlVarUd;
        this.mzz = toVar.to();
        this.mo = toVar.rq();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = toVar.lnr().qdl();
        this.wd = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdlVarQdl2 = toVar.mml().qdl();
        this.jpc = qdlVarQdl2;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = toVar.mzz().qdl();
        this.tvp = qdlVarQdl3;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl4 = toVar.wd().qdl();
        this.rq = qdlVarQdl4;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl5 = toVar.tvp().qdl();
        this.exu = qdlVarQdl5;
        com.bytedance.adsdk.ud.lnr.ud.to.qdl qdlVar2 = com.bytedance.adsdk.ud.lnr.ud.to.qdl.STAR;
        if (qdlVarUd == qdlVar2) {
            this.to = toVar.mo().qdl();
            this.fs = toVar.jpc().qdl();
        } else {
            this.to = null;
            this.fs = null;
        }
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVar.qdl(qdlVarQdl3);
        qdlVar.qdl(qdlVarQdl4);
        qdlVar.qdl(qdlVarQdl5);
        if (qdlVarUd == qdlVar2) {
            qdlVar.qdl(this.to);
            qdlVar.qdl(this.fs);
        }
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
        qdlVarQdl3.qdl(this);
        qdlVarQdl4.qdl(this);
        qdlVarQdl5.qdl(this);
        if (qdlVarUd == qdlVar2) {
            this.to.qdl(this);
            this.fs.qdl(this);
        }
    }

    private void lnr() {
        float f;
        float f2;
        float fCos;
        float fSin;
        float f3;
        double d;
        float fA;
        float f4;
        float f5;
        float fFloatValue = this.wd.wd().floatValue();
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar = this.tvp;
        double radians = Math.toRadians((qdlVar == null ? 0.0d : qdlVar.wd().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f6 = (float) (6.283185307179586d / d2);
        if (this.mo) {
            f6 *= -1.0f;
        }
        float f7 = f6 / 2.0f;
        float f8 = fFloatValue - ((int) fFloatValue);
        if (f8 != 0.0f) {
            radians += (double) ((1.0f - f8) * f7);
        }
        float fFloatValue2 = this.rq.wd().floatValue();
        float fFloatValue3 = this.to.wd().floatValue();
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar2 = this.fs;
        float fFloatValue4 = qdlVar2 != null ? qdlVar2.wd().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar3 = this.exu;
        float fFloatValue5 = qdlVar3 != null ? qdlVar3.wd().floatValue() / 100.0f : 0.0f;
        if (f8 != 0.0f) {
            fA = a.a(fFloatValue2, fFloatValue3, f8, fFloatValue3);
            f2 = 0.0f;
            double d3 = fA;
            f = 2.0f;
            float fCos2 = (float) (Math.cos(radians) * d3);
            fSin = (float) (Math.sin(radians) * d3);
            this.qdl.moveTo(fCos2, fSin);
            d = radians + ((double) ((f6 * f8) / 2.0f));
            fCos = fCos2;
            f3 = f7;
        } else {
            f = 2.0f;
            f2 = 0.0f;
            double d4 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d4);
            fSin = (float) (d4 * Math.sin(radians));
            this.qdl.moveTo(fCos, fSin);
            f3 = f7;
            d = radians + ((double) f3);
            fA = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i2 = 0;
        boolean z2 = false;
        double d5 = d;
        float f9 = fSin;
        float f10 = fCos;
        double d6 = d5;
        while (true) {
            double d7 = i2;
            if (d7 >= dCeil) {
                PointF pointFWd = this.jpc.wd();
                this.qdl.offset(pointFWd.x, pointFWd.y);
                this.qdl.close();
                return;
            }
            float f11 = z2 ? fFloatValue2 : fFloatValue3;
            float f12 = (fA == f2 || d7 != dCeil - 2.0d) ? f3 : (f6 * f8) / f;
            double d8 = (fA == f2 || d7 != dCeil - 1.0d) ? f11 : fA;
            float fCos3 = (float) (Math.cos(d6) * d8);
            float f13 = f6;
            float fSin2 = (float) (Math.sin(d6) * d8);
            if (fFloatValue4 == f2 && fFloatValue5 == f2) {
                this.qdl.lineTo(fCos3, fSin2);
                f5 = fCos3;
                f4 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f9, f10) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f14 = f10;
                float f15 = f9;
                f4 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f16 = z2 ? fFloatValue4 : fFloatValue5;
                float f17 = z2 ? fFloatValue5 : fFloatValue4;
                float f18 = (z2 ? fFloatValue3 : fFloatValue2) * f16 * 0.47829f;
                float f19 = fCos4 * f18;
                float f20 = f18 * fSin3;
                float f21 = (z2 ? fFloatValue2 : fFloatValue3) * f17 * 0.47829f;
                float f22 = fCos5 * f21;
                float f23 = f21 * fSin4;
                if (f8 != 0.0f) {
                    if (i2 == 0) {
                        f19 *= f8;
                        f20 *= f8;
                    } else if (d7 == dCeil - 1.0d) {
                        f22 *= f8;
                        f23 *= f8;
                    }
                }
                f5 = fCos3;
                this.qdl.cubicTo(f14 - f19, f15 - f20, fCos3 + f22, f4 + f23, f5, f4);
            }
            d6 += (double) f12;
            z2 = !z2;
            i2++;
            f3 = f3;
            f10 = f5;
            f9 = f4;
            f6 = f13;
        }
    }

    private void mzz() {
        int iFloor = (int) Math.floor(this.wd.wd().floatValue());
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar = this.tvp;
        double radians = Math.toRadians((qdlVar == null ? 0.0d : qdlVar.wd().floatValue()) - 90.0d);
        double d = iFloor;
        float fFloatValue = this.exu.wd().floatValue() / 100.0f;
        float fFloatValue2 = this.rq.wd().floatValue();
        double d2 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d2);
        float fSin = (float) (Math.sin(radians) * d2);
        this.qdl.moveTo(fCos, fSin);
        double d3 = (float) (6.283185307179586d / d);
        double d4 = radians + d3;
        int i2 = 0;
        for (double dCeil = Math.ceil(d); i2 < dCeil; dCeil = dCeil) {
            float fCos2 = (float) (Math.cos(d4) * d2);
            int i3 = i2;
            double d5 = d4;
            float fSin2 = (float) (Math.sin(d4) * d2);
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.qdl.cubicTo(fCos - (f * fCos3), fSin - (f * fSin3), fCos2 + (((float) Math.cos(dAtan3)) * f), fSin2 + (f * ((float) Math.sin(dAtan3))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                fCos = fCos2;
                this.qdl.lineTo(fCos, fSin);
            }
            d4 = d5 + d3;
            i2 = i3 + 1;
        }
        PointF pointFWd = this.jpc.wd();
        this.qdl.offset(pointFWd.x, pointFWd.y);
        this.qdl.close();
    }

    private void ud() {
        this.bjy = false;
        this.lnr.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        if (this.bjy) {
            return this.qdl;
        }
        this.qdl.reset();
        if (this.mzz) {
            this.bjy = true;
            return this.qdl;
        }
        int i2 = AnonymousClass1.qdl[this.mml.ordinal()];
        if (i2 == 1) {
            lnr();
        } else if (i2 == 2) {
            mzz();
        }
        this.qdl.close();
        this.rdp.qdl(this.qdl);
        this.bjy = true;
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        ud();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            lnr lnrVar = list.get(i2);
            if (lnrVar instanceof jyq) {
                jyq jyqVar = (jyq) lnrVar;
                if (jyqVar.ud() == com.bytedance.adsdk.ud.lnr.ud.exc.qdl.SIMULTANEOUSLY) {
                    this.rdp.qdl(jyqVar);
                    jyqVar.qdl(this);
                }
            }
        }
    }
}

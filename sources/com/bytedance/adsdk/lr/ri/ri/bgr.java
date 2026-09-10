package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class bgr implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, aw, sf {
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> f18000co;
    private final boolean di;
    private final boolean fi;
    private final com.bytedance.adsdk.lr.jbs ik;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> jbs;
    private final com.bytedance.adsdk.lr.ik.lr.qt.ri ka;
    private final String lr;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, PointF> mj;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> qt;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> sf;
    private boolean vr;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> xha;
    private final Path ri = new Path();
    private final lr bgr = new lr();

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.bgr$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[com.bytedance.adsdk.lr.ik.lr.qt.ri.values().length];
            ri = iArr;
            try {
                iArr[com.bytedance.adsdk.lr.ik.lr.qt.ri.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.lr.qt.ri.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public bgr(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.qt qtVar) {
        this.ik = jbsVar;
        this.lr = qtVar.ri();
        com.bytedance.adsdk.lr.ik.lr.qt.ri riVarLr = qtVar.lr();
        this.ka = riVarLr;
        this.fi = qtVar.qt();
        this.di = qtVar.sf();
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi = qtVar.ik().ri();
        this.xha = riVarRi;
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi2 = qtVar.ka().ri();
        this.mj = riVarRi2;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi3 = qtVar.fi().ri();
        this.jbs = riVarRi3;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi4 = qtVar.xha().ri();
        this.sf = riVarRi4;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi5 = qtVar.jbs().ri();
        this.aw = riVarRi5;
        com.bytedance.adsdk.lr.ik.lr.qt.ri riVar2 = com.bytedance.adsdk.lr.ik.lr.qt.ri.STAR;
        if (riVarLr == riVar2) {
            this.qt = qtVar.di().ri();
            this.f18000co = qtVar.mj().ri();
        } else {
            this.qt = null;
            this.f18000co = null;
        }
        riVar.ri(riVarRi);
        riVar.ri(riVarRi2);
        riVar.ri(riVarRi3);
        riVar.ri(riVarRi4);
        riVar.ri(riVarRi5);
        if (riVarLr == riVar2) {
            riVar.ri(this.qt);
            riVar.ri(this.f18000co);
        }
        riVarRi.ri(this);
        riVarRi2.ri(this);
        riVarRi3.ri(this);
        riVarRi4.ri(this);
        riVarRi5.ri(this);
        if (riVarLr == riVar2) {
            this.qt.ri(this);
            this.f18000co.ri(this);
        }
    }

    private void fi() {
        int iFloor = (int) Math.floor(this.xha.xha().floatValue());
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar = this.jbs;
        double radians = Math.toRadians((riVar == null ? 0.0d : riVar.xha().floatValue()) - 90.0d);
        double d = iFloor;
        float fFloatValue = this.aw.xha().floatValue() / 100.0f;
        float fFloatValue2 = this.sf.xha().floatValue();
        double d2 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d2);
        float fSin = (float) (Math.sin(radians) * d2);
        this.ri.moveTo(fCos, fSin);
        double d3 = (float) (6.283185307179586d / d);
        double d4 = radians + d3;
        int i = 0;
        for (double dCeil = Math.ceil(d); i < dCeil; dCeil = dCeil) {
            float fCos2 = (float) (Math.cos(d4) * d2);
            int i2 = i;
            double d5 = d4;
            float fSin2 = (float) (d2 * Math.sin(d4));
            if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.ri.cubicTo(fCos - (f * fCos3), fSin - (f * fSin3), fCos2 + (((float) Math.cos(dAtan3)) * f), fSin2 + (f * ((float) Math.sin(dAtan3))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                fCos = fCos2;
                this.ri.lineTo(fCos, fSin);
            }
            d4 = d5 + d3;
            i = i2 + 1;
        }
        PointF pointFXha = this.mj.xha();
        this.ri.offset(pointFXha.x, pointFXha.y);
        this.ri.close();
    }

    private void ik() {
        float f;
        float f2;
        float fCos;
        float fSin;
        float f3;
        double d;
        float f4;
        float f5;
        float f6;
        float fFloatValue = this.xha.xha().floatValue();
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar = this.jbs;
        double radians = Math.toRadians((riVar == null ? 0.0d : riVar.xha().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f7 = (float) (6.283185307179586d / d2);
        if (this.di) {
            f7 *= -1.0f;
        }
        float f8 = f7 / 2.0f;
        float f9 = fFloatValue - ((int) fFloatValue);
        if (f9 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            radians += (double) ((1.0f - f9) * f8);
        }
        float fFloatValue2 = this.sf.xha().floatValue();
        float fFloatValue3 = this.qt.xha().floatValue();
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar2 = this.f18000co;
        float fFloatValue4 = riVar2 != null ? riVar2.xha().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar3 = this.aw;
        float fFloatValue5 = riVar3 != null ? riVar3.xha().floatValue() / 100.0f : 0.0f;
        if (f9 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = ((fFloatValue2 - fFloatValue3) * f9) + fFloatValue3;
            f2 = 0.0f;
            double d3 = f4;
            f = 2.0f;
            float fCos2 = (float) (d3 * Math.cos(radians));
            fSin = (float) (d3 * Math.sin(radians));
            this.ri.moveTo(fCos2, fSin);
            d = radians + ((double) ((f7 * f9) / 2.0f));
            fCos = fCos2;
            f3 = f8;
        } else {
            f = 2.0f;
            f2 = 0.0f;
            double d4 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d4);
            fSin = (float) (d4 * Math.sin(radians));
            this.ri.moveTo(fCos, fSin);
            f3 = f8;
            d = radians + ((double) f3);
            f4 = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i = 0;
        boolean z = false;
        double d5 = d;
        float f10 = fSin;
        float f11 = fCos;
        double d6 = d5;
        while (true) {
            double d7 = i;
            if (d7 >= dCeil) {
                PointF pointFXha = this.mj.xha();
                this.ri.offset(pointFXha.x, pointFXha.y);
                this.ri.close();
                return;
            }
            float f12 = z ? fFloatValue2 : fFloatValue3;
            float f13 = (f4 == f2 || d7 != dCeil - 2.0d) ? f3 : (f7 * f9) / f;
            double d8 = (f4 == f2 || d7 != dCeil - 1.0d) ? f12 : f4;
            float fCos3 = (float) (d8 * Math.cos(d6));
            float f14 = f7;
            float fSin2 = (float) (d8 * Math.sin(d6));
            if (fFloatValue4 == f2 && fFloatValue5 == f2) {
                this.ri.lineTo(fCos3, fSin2);
                f6 = fCos3;
                f5 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f10, f11) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f15 = f11;
                float f16 = f10;
                f5 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f17 = z ? fFloatValue4 : fFloatValue5;
                float f18 = z ? fFloatValue5 : fFloatValue4;
                float f19 = (z ? fFloatValue3 : fFloatValue2) * f17 * 0.47829f;
                float f20 = fCos4 * f19;
                float f21 = f19 * fSin3;
                float f22 = (z ? fFloatValue2 : fFloatValue3) * f18 * 0.47829f;
                float f23 = fCos5 * f22;
                float f24 = f22 * fSin4;
                if (f9 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (i == 0) {
                        f20 *= f9;
                        f21 *= f9;
                    } else if (d7 == dCeil - 1.0d) {
                        f23 *= f9;
                        f24 *= f9;
                    }
                }
                f6 = fCos3;
                this.ri.cubicTo(f15 - f20, f16 - f21, fCos3 + f23, f5 + f24, f6, f5);
            }
            d6 += (double) f13;
            z = !z;
            i++;
            f3 = f3;
            f11 = f6;
            f10 = f5;
            f7 = f14;
        }
    }

    private void lr() {
        this.vr = false;
        this.ik.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.aw
    public Path ka() {
        if (this.vr) {
            return this.ri;
        }
        this.ri.reset();
        if (this.fi) {
            this.vr = true;
            return this.ri;
        }
        int i = AnonymousClass1.ri[this.ka.ordinal()];
        if (i == 1) {
            ik();
        } else if (i == 2) {
            fi();
        }
        this.ri.close();
        this.bgr.ri(this.ri);
        this.vr = true;
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        lr();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        for (int i = 0; i < list.size(); i++) {
            ik ikVar = list.get(i);
            if (ikVar instanceof ihz) {
                ihz ihzVar = (ihz) ikVar;
                if (ihzVar.lr() == com.bytedance.adsdk.lr.ik.lr.tan.ri.SIMULTANEOUSLY) {
                    this.bgr.ri(ihzVar);
                    ihzVar.ri(this);
                }
            }
        }
    }
}

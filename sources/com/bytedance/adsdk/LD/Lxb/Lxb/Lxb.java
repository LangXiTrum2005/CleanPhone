package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JVA, JXs {
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> IeN;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> JVA;
    final Paint LD;
    protected final com.bytedance.adsdk.LD.lk.lk.Lxb Lxb;
    private final List<com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float>> NXR;
    private final com.bytedance.adsdk.LD.QAg OY;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> STP;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> VVE;
    private com.bytedance.adsdk.LD.Lxb.LD.lk kqm;
    float lk;
    private final float[] nBu;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Integer> sLN;
    private final PathMeasure ZU = new PathMeasure();
    private final Path JXs = new Path();
    private final Path lc = new Path();
    private final RectF ebl = new RectF();
    private final List<C0025Lxb> QAg = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.Lxb.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public static final class C0025Lxb {
        private final Sfi LD;
        private final List<NXR> Lxb;

        private C0025Lxb(Sfi sfi) {
            this.Lxb = new ArrayList();
            this.LD = sfi;
        }
    }

    public Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.LD.lk.Lxb.ZU zu, com.bytedance.adsdk.LD.lk.Lxb.LD ld, List<com.bytedance.adsdk.LD.lk.Lxb.LD> list, com.bytedance.adsdk.LD.lk.Lxb.LD ld2) {
        com.bytedance.adsdk.LD.Lxb.Lxb lxb2 = new com.bytedance.adsdk.LD.Lxb.Lxb(1);
        this.LD = lxb2;
        this.lk = 0.0f;
        this.OY = qAg;
        this.Lxb = lxb;
        lxb2.setStyle(Paint.Style.STROKE);
        lxb2.setStrokeCap(cap);
        lxb2.setStrokeJoin(join);
        lxb2.setStrokeMiter(f);
        this.sLN = zu.Lxb();
        this.JVA = ld.Lxb();
        if (ld2 == null) {
            this.STP = null;
        } else {
            this.STP = ld2.Lxb();
        }
        this.NXR = new ArrayList(list.size());
        this.nBu = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.NXR.add(list.get(i).Lxb());
        }
        lxb.Lxb(this.sLN);
        lxb.Lxb(this.JVA);
        for (int i2 = 0; i2 < this.NXR.size(); i2++) {
            lxb.Lxb(this.NXR.get(i2));
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb3 = this.STP;
        if (lxb3 != null) {
            lxb.Lxb(lxb3);
        }
        this.sLN.Lxb(this);
        this.JVA.Lxb(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.NXR.get(i3).Lxb(this);
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb4 = this.STP;
        if (lxb4 != null) {
            lxb4.Lxb(this);
        }
        if (lxb.nBu() != null) {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb = lxb.nBu().Lxb().Lxb();
            this.VVE = Lxb;
            Lxb.Lxb(this);
            lxb.Lxb(this.VVE);
        }
        if (lxb.JVA() != null) {
            this.kqm = new com.bytedance.adsdk.LD.Lxb.LD.lk(this, lxb, lxb.JVA());
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        this.OY.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        Sfi sfi = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            lk lkVar = list.get(size);
            if (lkVar instanceof Sfi) {
                Sfi sfi2 = (Sfi) lkVar;
                if (sfi2.LD() == com.bytedance.adsdk.LD.lk.LD.tD.Lxb.INDIVIDUALLY) {
                    sfi = sfi2;
                }
            }
        }
        if (sfi != null) {
            sfi.Lxb(this);
        }
        C0025Lxb c0025Lxb = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            lk lkVar2 = list2.get(size2);
            if (lkVar2 instanceof Sfi) {
                Sfi sfi3 = (Sfi) lkVar2;
                if (sfi3.LD() == com.bytedance.adsdk.LD.lk.LD.tD.Lxb.INDIVIDUALLY) {
                    if (c0025Lxb != null) {
                        this.QAg.add(c0025Lxb);
                    }
                    c0025Lxb = new C0025Lxb(sfi3);
                    sfi3.Lxb(this);
                } else if (!(lkVar2 instanceof NXR)) {
                    if (c0025Lxb == null) {
                        c0025Lxb = new C0025Lxb(sfi);
                    }
                    c0025Lxb.Lxb.add((NXR) lkVar2);
                }
            } else if (!(lkVar2 instanceof NXR)) {
                if (c0025Lxb == null) {
                    c0025Lxb = new C0025Lxb(sfi);
                }
                c0025Lxb.Lxb.add((NXR) lkVar2);
            }
        }
        if (c0025Lxb != null) {
            this.QAg.add(c0025Lxb);
        }
    }

    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.LD.JXs.Lxb("StrokeContent#draw");
        if (com.bytedance.adsdk.LD.lc.lc.LD(matrix)) {
            com.bytedance.adsdk.LD.JXs.LD("StrokeContent#draw");
            return;
        }
        this.LD.setAlpha(com.bytedance.adsdk.LD.lc.JXs.Lxb((int) ((((i / 255.0f) * ((com.bytedance.adsdk.LD.Lxb.LD.lc) this.sLN).QAg()) / 100.0f) * 255.0f), 0, 255));
        this.LD.setStrokeWidth(com.bytedance.adsdk.LD.lc.lc.Lxb(matrix) * ((com.bytedance.adsdk.LD.Lxb.LD.ZU) this.JVA).QAg());
        if (this.LD.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.LD.JXs.LD("StrokeContent#draw");
            return;
        }
        Lxb(matrix);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> lxb = this.IeN;
        if (lxb != null) {
            this.LD.setColorFilter(lxb.ebl());
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb2 = this.VVE;
        if (lxb2 != null) {
            float fFloatValue = lxb2.ebl().floatValue();
            if (fFloatValue == 0.0f) {
                this.LD.setMaskFilter(null);
            } else if (fFloatValue != this.lk) {
                this.LD.setMaskFilter(this.Lxb.LD(fFloatValue));
            }
            this.lk = fFloatValue;
        }
        com.bytedance.adsdk.LD.Lxb.LD.lk lkVar = this.kqm;
        if (lkVar != null) {
            lkVar.Lxb(this.LD);
        }
        for (int i2 = 0; i2 < this.QAg.size(); i2++) {
            C0025Lxb c0025Lxb = this.QAg.get(i2);
            if (c0025Lxb.LD != null) {
                Lxb(canvas, c0025Lxb, matrix);
            } else {
                com.bytedance.adsdk.LD.JXs.Lxb("StrokeContent#buildPath");
                this.JXs.reset();
                for (int size = c0025Lxb.Lxb.size() - 1; size >= 0; size--) {
                    this.JXs.addPath(((NXR) c0025Lxb.Lxb.get(size)).ZU(), matrix);
                }
                com.bytedance.adsdk.LD.JXs.LD("StrokeContent#buildPath");
                com.bytedance.adsdk.LD.JXs.Lxb("StrokeContent#drawPath");
                canvas.drawPath(this.JXs, this.LD);
                com.bytedance.adsdk.LD.JXs.LD("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.LD.JXs.LD("StrokeContent#draw");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0113  */
    private void Lxb(Canvas canvas, C0025Lxb c0025Lxb, Matrix matrix) {
        float f;
        float f2;
        float fMin;
        com.bytedance.adsdk.LD.JXs.Lxb("StrokeContent#applyTrimPath");
        if (c0025Lxb.LD == null) {
            com.bytedance.adsdk.LD.JXs.LD("StrokeContent#applyTrimPath");
            return;
        }
        this.JXs.reset();
        for (int size = c0025Lxb.Lxb.size() - 1; size >= 0; size--) {
            this.JXs.addPath(((NXR) c0025Lxb.Lxb.get(size)).ZU(), matrix);
        }
        float fFloatValue = c0025Lxb.LD.lk().ebl().floatValue() / 100.0f;
        float fFloatValue2 = c0025Lxb.LD.ZU().ebl().floatValue() / 100.0f;
        float fFloatValue3 = c0025Lxb.LD.JXs().ebl().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.JXs, this.LD);
            com.bytedance.adsdk.LD.JXs.LD("StrokeContent#applyTrimPath");
            return;
        }
        this.ZU.setPath(this.JXs, false);
        float length = this.ZU.getLength();
        while (this.ZU.nextContour()) {
            length += this.ZU.getLength();
        }
        float f3 = fFloatValue3 * length;
        float f4 = (fFloatValue * length) + f3;
        float fMin2 = Math.min((fFloatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = c0025Lxb.Lxb.size() - 1; size2 >= 0; size2--) {
            this.lc.set(((NXR) c0025Lxb.Lxb.get(size2)).ZU());
            this.lc.transform(matrix);
            this.ZU.setPath(this.lc, false);
            float length2 = this.ZU.getLength();
            if (fMin2 > length) {
                float f6 = fMin2 - length;
                if (f6 >= f5 + length2 || f5 >= f6) {
                    f = f5 + length2;
                    if (f < f4 && f5 <= fMin2) {
                        if (f > fMin2 || f4 >= f5) {
                            f2 = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                            fMin = fMin2 > f ? 1.0f : (fMin2 - f5) / length2;
                        } else {
                            canvas.drawPath(this.lc, this.LD);
                        }
                    }
                } else {
                    f2 = f4 > length ? (f4 - length) / length2 : 0.0f;
                    fMin = Math.min(f6 / length2, 1.0f);
                }
                com.bytedance.adsdk.LD.lc.lc.Lxb(this.lc, f2, fMin, 0.0f);
                canvas.drawPath(this.lc, this.LD);
            } else {
                f = f5 + length2;
                if (f < f4) {
                }
            }
            f5 += length2;
        }
        com.bytedance.adsdk.LD.JXs.LD("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        com.bytedance.adsdk.LD.JXs.Lxb("StrokeContent#getBounds");
        this.JXs.reset();
        for (int i = 0; i < this.QAg.size(); i++) {
            C0025Lxb c0025Lxb = this.QAg.get(i);
            for (int i2 = 0; i2 < c0025Lxb.Lxb.size(); i2++) {
                this.JXs.addPath(((NXR) c0025Lxb.Lxb.get(i2)).ZU(), matrix);
            }
        }
        this.JXs.computeBounds(this.ebl, false);
        float fQAg = ((com.bytedance.adsdk.LD.Lxb.LD.ZU) this.JVA).QAg();
        RectF rectF2 = this.ebl;
        float f = fQAg / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.ebl);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.LD.JXs.LD("StrokeContent#getBounds");
    }

    private void Lxb(Matrix matrix) {
        com.bytedance.adsdk.LD.JXs.Lxb("StrokeContent#applyDashPattern");
        if (this.NXR.isEmpty()) {
            com.bytedance.adsdk.LD.JXs.LD("StrokeContent#applyDashPattern");
            return;
        }
        float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb(matrix);
        for (int i = 0; i < this.NXR.size(); i++) {
            this.nBu[i] = this.NXR.get(i).ebl().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.nBu;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.nBu;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.nBu;
            fArr3[i] = fArr3[i] * fLxb;
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb = this.STP;
        this.LD.setPathEffect(new DashPathEffect(this.nBu, lxb == null ? 0.0f : fLxb * lxb.ebl().floatValue()));
        com.bytedance.adsdk.LD.JXs.LD("StrokeContent#applyDashPattern");
    }
}

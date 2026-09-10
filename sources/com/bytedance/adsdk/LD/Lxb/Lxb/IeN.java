package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class IeN implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JVA, NXR {
    private boolean JVA;
    private final com.bytedance.adsdk.LD.QAg JXs;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> OY;
    private final boolean ZU;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, PointF> ebl;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, PointF> lc;
    private final String lk;
    private final Path Lxb = new Path();
    private final RectF LD = new RectF();
    private final LD QAg = new LD();
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> nBu = null;

    public IeN(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.JVA jva) {
        this.lk = jva.Lxb();
        this.ZU = jva.JXs();
        this.JXs = qAg;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb = jva.ZU().Lxb();
        this.lc = Lxb;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb2 = jva.lk().Lxb();
        this.ebl = Lxb2;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb3 = jva.LD().Lxb();
        this.OY = Lxb3;
        lxb.Lxb(Lxb);
        lxb.Lxb(Lxb2);
        lxb.Lxb(Lxb3);
        Lxb.Lxb(this);
        Lxb2.Lxb(this);
        Lxb3.Lxb(this);
    }

    private void LD() {
        this.JVA = false;
        this.JXs.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        LD();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.NXR
    public Path ZU() {
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb;
        if (this.JVA) {
            return this.Lxb;
        }
        this.Lxb.reset();
        if (this.ZU) {
            this.JVA = true;
            return this.Lxb;
        }
        PointF pointFEbl = this.ebl.ebl();
        float f = pointFEbl.x / 2.0f;
        float f2 = pointFEbl.y / 2.0f;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Float> lxb2 = this.OY;
        float fQAg = lxb2 == null ? 0.0f : ((com.bytedance.adsdk.LD.Lxb.LD.ZU) lxb2).QAg();
        if (fQAg == 0.0f && (lxb = this.nBu) != null) {
            fQAg = Math.min(lxb.ebl().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fQAg > fMin) {
            fQAg = fMin;
        }
        PointF pointFEbl2 = this.lc.ebl();
        this.Lxb.moveTo(pointFEbl2.x + f, (pointFEbl2.y - f2) + fQAg);
        this.Lxb.lineTo(pointFEbl2.x + f, (pointFEbl2.y + f2) - fQAg);
        if (fQAg > 0.0f) {
            RectF rectF = this.LD;
            float f3 = pointFEbl2.x;
            float f4 = fQAg * 2.0f;
            float f5 = pointFEbl2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.Lxb.arcTo(this.LD, 0.0f, 90.0f, false);
        }
        this.Lxb.lineTo((pointFEbl2.x - f) + fQAg, pointFEbl2.y + f2);
        if (fQAg > 0.0f) {
            RectF rectF2 = this.LD;
            float f6 = pointFEbl2.x;
            float f7 = pointFEbl2.y;
            float f8 = fQAg * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.Lxb.arcTo(this.LD, 90.0f, 90.0f, false);
        }
        this.Lxb.lineTo(pointFEbl2.x - f, (pointFEbl2.y - f2) + fQAg);
        if (fQAg > 0.0f) {
            RectF rectF3 = this.LD;
            float f9 = pointFEbl2.x;
            float f10 = pointFEbl2.y;
            float f11 = fQAg * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.Lxb.arcTo(this.LD, 180.0f, 90.0f, false);
        }
        this.Lxb.lineTo((pointFEbl2.x + f) - fQAg, pointFEbl2.y - f2);
        if (fQAg > 0.0f) {
            RectF rectF4 = this.LD;
            float f12 = pointFEbl2.x;
            float f13 = fQAg * 2.0f;
            float f14 = pointFEbl2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.Lxb.arcTo(this.LD, 270.0f, 90.0f, false);
        }
        this.Lxb.close();
        this.QAg.Lxb(this.Lxb);
        this.JVA = true;
        return this.Lxb;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        for (int i = 0; i < list.size(); i++) {
            lk lkVar = list.get(i);
            if (lkVar instanceof Sfi) {
                Sfi sfi = (Sfi) lkVar;
                if (sfi.LD() == com.bytedance.adsdk.LD.lk.LD.tD.Lxb.SIMULTANEOUSLY) {
                    this.QAg.Lxb(sfi);
                    sfi.Lxb(this);
                } else if (lkVar instanceof kqm) {
                    this.nBu = ((kqm) lkVar).LD();
                }
            } else if (lkVar instanceof kqm) {
                this.nBu = ((kqm) lkVar).LD();
            }
        }
    }
}

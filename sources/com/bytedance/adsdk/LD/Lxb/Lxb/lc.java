package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lc implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JVA, NXR {
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, PointF> JXs;
    private final String LD;
    private boolean OY;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, PointF> ZU;
    private final com.bytedance.adsdk.LD.lk.LD.LD lc;
    private final com.bytedance.adsdk.LD.QAg lk;
    private final Path Lxb = new Path();
    private final LD ebl = new LD();

    public lc(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.LD ld) {
        this.LD = ld.Lxb();
        this.lk = qAg;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb = ld.lk().Lxb();
        this.ZU = Lxb;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb2 = ld.LD().Lxb();
        this.JXs = Lxb2;
        this.lc = ld;
        lxb.Lxb(Lxb);
        lxb.Lxb(Lxb2);
        Lxb.Lxb(this);
        Lxb2.Lxb(this);
    }

    private void LD() {
        this.OY = false;
        this.lk.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        LD();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.NXR
    public Path ZU() {
        if (this.OY) {
            return this.Lxb;
        }
        this.Lxb.reset();
        if (this.lc.JXs()) {
            this.OY = true;
            return this.Lxb;
        }
        PointF pointFEbl = this.ZU.ebl();
        float f = pointFEbl.x / 2.0f;
        float f2 = pointFEbl.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.Lxb.reset();
        if (this.lc.ZU()) {
            float f5 = -f2;
            this.Lxb.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.Lxb.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.Lxb.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.Lxb.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.Lxb.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.Lxb.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.Lxb.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.Lxb.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.Lxb.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.Lxb.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFEbl2 = this.JXs.ebl();
        this.Lxb.offset(pointFEbl2.x, pointFEbl2.y);
        this.Lxb.close();
        this.ebl.Lxb(this.Lxb);
        this.OY = true;
        return this.Lxb;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        for (int i = 0; i < list.size(); i++) {
            lk lkVar = list.get(i);
            if (lkVar instanceof Sfi) {
                Sfi sfi = (Sfi) lkVar;
                if (sfi.LD() == com.bytedance.adsdk.LD.lk.LD.tD.Lxb.SIMULTANEOUSLY) {
                    this.ebl.Lxb(sfi);
                    sfi.Lxb(this);
                }
            }
        }
    }
}

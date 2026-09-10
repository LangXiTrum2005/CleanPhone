package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public class DY extends Lxb {
    private final String JXs;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> OY;
    private final com.bytedance.adsdk.LD.lk.lk.Lxb ZU;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> ebl;
    private final boolean lc;

    public DY(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.brP brp) {
        super(qAg, lxb, brp.ebl().Lxb(), brp.OY().Lxb(), brp.QAg(), brp.lk(), brp.ZU(), brp.JXs(), brp.lc());
        this.ZU = lxb;
        this.JXs = brp.Lxb();
        this.lc = brp.nBu();
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> Lxb = brp.LD().Lxb();
        this.ebl = Lxb;
        Lxb.Lxb(this);
        lxb.Lxb(Lxb);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        if (this.lc) {
            return;
        }
        this.LD.setColor(((com.bytedance.adsdk.LD.Lxb.LD.LD) this.ebl).QAg());
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> lxb = this.OY;
        if (lxb != null) {
            this.LD.setColorFilter(lxb.ebl());
        }
        super.Lxb(canvas, matrix, i);
    }
}

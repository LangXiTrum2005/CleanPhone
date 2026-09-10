package com.bytedance.adsdk.LD.lk.lk;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.LD.lk.LD.VVE;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class ebl extends Lxb {
    private final LD OY;
    private final com.bytedance.adsdk.LD.Lxb.Lxb.ZU ebl;

    public ebl(com.bytedance.adsdk.LD.QAg qAg, JXs jXs, LD ld, com.bytedance.adsdk.LD.ebl eblVar) {
        super(qAg, jXs);
        this.OY = ld;
        com.bytedance.adsdk.LD.Lxb.Lxb.ZU zu = new com.bytedance.adsdk.LD.Lxb.Lxb.ZU(qAg, this, new VVE("__container", jXs.STP(), false), eblVar);
        this.ebl = zu;
        zu.Lxb(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public com.bytedance.adsdk.LD.JXs.nBu JVA() {
        com.bytedance.adsdk.LD.JXs.nBu nbuJVA = super.JVA();
        return nbuJVA != null ? nbuJVA : this.OY.JVA();
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        super.LD(canvas, matrix, i);
        this.ebl.Lxb(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        super.Lxb(rectF, matrix, z);
        this.ebl.Lxb(rectF, this.Lxb, z);
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public com.bytedance.adsdk.LD.lk.LD.Lxb nBu() {
        com.bytedance.adsdk.LD.lk.LD.Lxb lxbNBu = super.nBu();
        return lxbNBu != null ? lxbNBu : this.OY.nBu();
    }
}

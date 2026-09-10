package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ebl implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JVA, JXs {
    private final com.bytedance.adsdk.LD.QAg JVA;
    private final String JXs;
    private final Path LD;
    float Lxb;
    private com.bytedance.adsdk.LD.Lxb.LD.lk NXR;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> OY;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> QAg;
    private final com.bytedance.adsdk.LD.lk.lk.Lxb ZU;
    private final List<NXR> ebl;
    private final boolean lc;
    private final Paint lk;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> nBu;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> sLN;

    public ebl(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.IeN ieN) {
        Path path = new Path();
        this.LD = path;
        this.lk = new com.bytedance.adsdk.LD.Lxb.Lxb(1);
        this.ebl = new ArrayList();
        this.ZU = lxb;
        this.JXs = ieN.Lxb();
        this.lc = ieN.JXs();
        this.JVA = qAg;
        if (lxb.nBu() != null) {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb = lxb.nBu().Lxb().Lxb();
            this.sLN = Lxb;
            Lxb.Lxb(this);
            lxb.Lxb(this.sLN);
        }
        if (lxb.JVA() != null) {
            this.NXR = new com.bytedance.adsdk.LD.Lxb.LD.lk(this, lxb, lxb.JVA());
        }
        if (ieN.LD() == null || ieN.lk() == null) {
            this.OY = null;
            this.QAg = null;
            return;
        }
        path.setFillType(ieN.ZU());
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> Lxb2 = ieN.LD().Lxb();
        this.OY = Lxb2;
        Lxb2.Lxb(this);
        lxb.Lxb(Lxb2);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> Lxb3 = ieN.lk().Lxb();
        this.QAg = Lxb3;
        Lxb3.Lxb(this);
        lxb.Lxb(Lxb3);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        this.JVA.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        for (int i = 0; i < list2.size(); i++) {
            lk lkVar = list2.get(i);
            if (lkVar instanceof NXR) {
                this.ebl.add((NXR) lkVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        if (this.lc) {
            return;
        }
        com.bytedance.adsdk.LD.JXs.Lxb("FillContent#draw");
        this.lk.setColor((com.bytedance.adsdk.LD.lc.JXs.Lxb((int) ((((i / 255.0f) * this.QAg.ebl().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.LD.Lxb.LD.LD) this.OY).QAg() & ViewCompat.MEASURED_SIZE_MASK));
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<ColorFilter, ColorFilter> lxb = this.nBu;
        if (lxb != null) {
            this.lk.setColorFilter(lxb.ebl());
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb2 = this.sLN;
        if (lxb2 != null) {
            float fFloatValue = lxb2.ebl().floatValue();
            if (fFloatValue == 0.0f) {
                this.lk.setMaskFilter(null);
            } else if (fFloatValue != this.Lxb) {
                this.lk.setMaskFilter(this.ZU.LD(fFloatValue));
            }
            this.Lxb = fFloatValue;
        }
        com.bytedance.adsdk.LD.Lxb.LD.lk lkVar = this.NXR;
        if (lkVar != null) {
            lkVar.Lxb(this.lk);
        }
        this.LD.reset();
        for (int i2 = 0; i2 < this.ebl.size(); i2++) {
            this.LD.addPath(this.ebl.get(i2).ZU(), matrix);
        }
        canvas.drawPath(this.LD, this.lk);
        com.bytedance.adsdk.LD.JXs.LD("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        this.LD.reset();
        for (int i = 0; i < this.ebl.size(); i++) {
            this.LD.addPath(this.ebl.get(i).ZU(), matrix);
        }
        this.LD.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}

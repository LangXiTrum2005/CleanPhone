package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class VVE implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JVA, JXs, NXR, nBu {
    private final String JXs;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> OY;
    private final com.bytedance.adsdk.LD.Lxb.LD.VVE QAg;
    private final com.bytedance.adsdk.LD.lk.lk.Lxb ZU;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> ebl;
    private final boolean lc;
    private final com.bytedance.adsdk.LD.QAg lk;
    private ZU nBu;
    private final Matrix Lxb = new Matrix();
    private final Path LD = new Path();

    public VVE(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.sLN sln) {
        this.lk = qAg;
        this.ZU = lxb;
        this.JXs = sln.Lxb();
        this.lc = sln.JXs();
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb = sln.LD().Lxb();
        this.ebl = Lxb;
        lxb.Lxb(Lxb);
        Lxb.Lxb(this);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb2 = sln.lk().Lxb();
        this.OY = Lxb2;
        lxb.Lxb(Lxb2);
        Lxb2.Lxb(this);
        com.bytedance.adsdk.LD.Lxb.LD.VVE vveNBu = sln.ZU().nBu();
        this.QAg = vveNBu;
        vveNBu.Lxb(lxb);
        vveNBu.Lxb(this);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.nBu
    public void Lxb(ListIterator<lk> listIterator) {
        if (this.nBu != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.nBu = new ZU(this.lk, this.ZU, "Repeater", this.lc, arrayList, null);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.NXR
    public Path ZU() {
        Path pathZU = this.nBu.ZU();
        this.LD.reset();
        float fFloatValue = this.ebl.ebl().floatValue();
        float fFloatValue2 = this.OY.ebl().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.Lxb.set(this.QAg.LD(i + fFloatValue2));
            this.LD.addPath(pathZU, this.Lxb);
        }
        return this.LD;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        this.nBu.Lxb(list, list2);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.ebl.ebl().floatValue();
        float fFloatValue2 = this.OY.ebl().floatValue();
        float fFloatValue3 = this.QAg.LD().ebl().floatValue() / 100.0f;
        float fFloatValue4 = this.QAg.lk().ebl().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.Lxb.set(matrix);
            float f = i2;
            this.Lxb.preConcat(this.QAg.LD(f + fFloatValue2));
            this.nBu.Lxb(canvas, this.Lxb, (int) (com.bytedance.adsdk.LD.lc.JXs.Lxb(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        this.nBu.Lxb(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        this.lk.invalidateSelf();
    }
}

package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class jtx implements exu, mzz, rq, to, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> jpc;
    private final com.bytedance.adsdk.ud.tvp lnr;
    private final com.bytedance.adsdk.ud.lnr.lnr.qdl mml;
    private final boolean mo;
    private final String mzz;
    private mml to;
    private final com.bytedance.adsdk.ud.qdl.ud.jtx tvp;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> wd;
    private final Matrix qdl = new Matrix();
    private final Path ud = new Path();

    public jtx(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.fs fsVar) {
        this.lnr = tvpVar;
        this.mml = qdlVar;
        this.mzz = fsVar.qdl();
        this.mo = fsVar.mzz();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = fsVar.ud().qdl();
        this.wd = qdlVarQdl;
        qdlVar.qdl(qdlVarQdl);
        qdlVarQdl.qdl(this);
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl2 = fsVar.lnr().qdl();
        this.jpc = qdlVarQdl2;
        qdlVar.qdl(qdlVarQdl2);
        qdlVarQdl2.qdl(this);
        com.bytedance.adsdk.ud.qdl.ud.jtx jtxVar = fsVar.mml().to();
        this.tvp = jtxVar;
        jtxVar.qdl(qdlVar);
        jtxVar.qdl(this);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        Path pathMml = this.to.mml();
        this.ud.reset();
        float fFloatValue = this.wd.wd().floatValue();
        float fFloatValue2 = this.jpc.wd().floatValue();
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.qdl.set(this.tvp.ud(i2 + fFloatValue2));
            this.ud.addPath(pathMml, this.qdl);
        }
        return this.ud;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.to
    public void qdl(ListIterator<lnr> listIterator) {
        if (this.to != null) {
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
        this.to = new mml(this.lnr, this.mml, "Repeater", this.mo, arrayList, null);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        this.to.qdl(list, list2);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i2) {
        float fFloatValue = this.wd.wd().floatValue();
        float fFloatValue2 = this.jpc.wd().floatValue();
        float fFloatValue3 = this.tvp.ud().wd().floatValue() / 100.0f;
        float fFloatValue4 = this.tvp.lnr().wd().floatValue() / 100.0f;
        for (int i3 = ((int) fFloatValue) - 1; i3 >= 0; i3--) {
            this.qdl.set(matrix);
            float f = i3;
            this.qdl.preConcat(this.tvp.ud(f + fFloatValue2));
            this.to.qdl(canvas, this.qdl, (int) (com.bytedance.adsdk.ud.mo.mzz.qdl(fFloatValue3, fFloatValue4, f / fFloatValue) * i2));
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        this.to.qdl(rectF, matrix, z2);
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        this.lnr.invalidateSelf();
    }
}

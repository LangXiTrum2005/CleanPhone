package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wd implements mzz, rq, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private com.bytedance.adsdk.ud.qdl.ud.lnr exu;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> fs;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> jpc;
    private final Paint lnr;
    private final com.bytedance.adsdk.ud.lnr.lnr.qdl mml;
    private final boolean mo;
    private final String mzz;
    float qdl;
    private final com.bytedance.adsdk.ud.tvp rq;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> to;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> tvp;
    private final Path ud;
    private final List<exu> wd;

    public wd(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.bjy bjyVar) {
        Path path = new Path();
        this.ud = path;
        this.lnr = new com.bytedance.adsdk.ud.qdl.qdl(1);
        this.wd = new ArrayList();
        this.mml = qdlVar;
        this.mzz = bjyVar.qdl();
        this.mo = bjyVar.mzz();
        this.rq = tvpVar;
        if (qdlVar.to() != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = qdlVar.to().qdl().qdl();
            this.fs = qdlVarQdl;
            qdlVarQdl.qdl(this);
            qdlVar.qdl(this.fs);
        }
        if (qdlVar.rq() != null) {
            this.exu = new com.bytedance.adsdk.ud.qdl.ud.lnr(this, qdlVar, qdlVar.rq());
        }
        if (bjyVar.ud() == null || bjyVar.lnr() == null) {
            this.jpc = null;
            this.tvp = null;
            return;
        }
        path.setFillType(bjyVar.mml());
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl2 = bjyVar.ud().qdl();
        this.jpc = qdlVarQdl2;
        qdlVarQdl2.qdl(this);
        qdlVar.qdl(qdlVarQdl2);
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl3 = bjyVar.lnr().qdl();
        this.tvp = qdlVarQdl3;
        qdlVarQdl3.qdl(this);
        qdlVar.qdl(qdlVarQdl3);
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        this.rq.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            lnr lnrVar = list2.get(i2);
            if (lnrVar instanceof exu) {
                this.wd.add((exu) lnrVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i2) {
        if (this.mo) {
            return;
        }
        com.bytedance.adsdk.ud.mzz.qdl("FillContent#draw");
        this.lnr.setColor((com.bytedance.adsdk.ud.mo.mzz.qdl((int) ((((i2 / 255.0f) * this.tvp.wd().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.ud.qdl.ud.ud) this.jpc).tvp() & 16777215));
        com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> qdlVar = this.to;
        if (qdlVar != null) {
            this.lnr.setColorFilter(qdlVar.wd());
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar2 = this.fs;
        if (qdlVar2 != null) {
            float fFloatValue = qdlVar2.wd().floatValue();
            if (fFloatValue == 0.0f) {
                this.lnr.setMaskFilter(null);
            } else if (fFloatValue != this.qdl) {
                this.lnr.setMaskFilter(this.mml.ud(fFloatValue));
            }
            this.qdl = fFloatValue;
        }
        com.bytedance.adsdk.ud.qdl.ud.lnr lnrVar = this.exu;
        if (lnrVar != null) {
            lnrVar.qdl(this.lnr);
        }
        this.ud.reset();
        for (int i3 = 0; i3 < this.wd.size(); i3++) {
            this.ud.addPath(this.wd.get(i3).mml(), matrix);
        }
        canvas.drawPath(this.ud, this.lnr);
        com.bytedance.adsdk.ud.mzz.ud("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        this.ud.reset();
        for (int i2 = 0; i2 < this.wd.size(); i2++) {
            this.ud.addPath(this.wd.get(i2).mml(), matrix);
        }
        this.ud.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}

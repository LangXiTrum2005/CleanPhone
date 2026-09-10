package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public class aaj extends qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> jpc;
    private final com.bytedance.adsdk.ud.lnr.lnr.qdl mml;
    private final boolean mo;
    private final String mzz;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> wd;

    public aaj(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.jl jlVar) {
        super(tvpVar, qdlVar, jlVar.wd().qdl(), jlVar.jpc().qdl(), jlVar.tvp(), jlVar.lnr(), jlVar.mml(), jlVar.mzz(), jlVar.mo());
        this.mml = qdlVar;
        this.mzz = jlVar.qdl();
        this.mo = jlVar.to();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl = jlVar.ud().qdl();
        this.wd = qdlVarQdl;
        qdlVarQdl.qdl(this);
        qdlVar.qdl(qdlVarQdl);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i2) {
        if (this.mo) {
            return;
        }
        this.ud.setColor(((com.bytedance.adsdk.ud.qdl.ud.ud) this.wd).tvp());
        com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> qdlVar = this.jpc;
        if (qdlVar != null) {
            this.ud.setColorFilter(qdlVar.wd());
        }
        super.qdl(canvas, matrix, i2);
    }
}

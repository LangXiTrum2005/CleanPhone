package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends com.bytedance.adsdk.ud.wd.qdl<PointF> {
    private final com.bytedance.adsdk.ud.wd.qdl<PointF> rq;
    private Path to;

    public tvp(com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar) {
        super(wdVar, qdlVar.qdl, qdlVar.ud, qdlVar.lnr, qdlVar.mml, qdlVar.mzz, qdlVar.mo, qdlVar.wd);
        this.rq = qdlVar;
        qdl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void qdl() {
        T t;
        T t2;
        T t3 = this.ud;
        boolean z2 = (t3 == 0 || (t2 = this.qdl) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.qdl;
        if (t4 == 0 || (t = this.ud) == 0 || z2) {
            return;
        }
        com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar = this.rq;
        this.to = com.bytedance.adsdk.ud.mo.mo.qdl((PointF) t4, (PointF) t, qdlVar.jpc, qdlVar.tvp);
    }

    public Path ud() {
        return this.to;
    }
}

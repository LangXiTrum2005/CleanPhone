package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends com.bytedance.adsdk.lr.xha.ri<PointF> {
    private Path qt;
    private final com.bytedance.adsdk.lr.xha.ri<PointF> sf;

    public jbs(com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.xha.ri<PointF> riVar) {
        super(xhaVar, riVar.ri, riVar.lr, riVar.ik, riVar.ka, riVar.fi, riVar.di, riVar.xha);
        this.sf = riVar;
        ri();
    }

    public Path lr() {
        return this.qt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ri() {
        T t;
        T t2;
        T t3 = this.lr;
        boolean z = (t3 == 0 || (t2 = this.ri) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.ri;
        if (t4 == 0 || (t = this.lr) == 0 || z) {
            return;
        }
        com.bytedance.adsdk.lr.xha.ri<PointF> riVar = this.sf;
        this.qt = com.bytedance.adsdk.lr.di.di.ri((PointF) t4, (PointF) t, riVar.mj, riVar.jbs);
    }
}

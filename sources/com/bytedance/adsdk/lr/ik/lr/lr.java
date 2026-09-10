package com.bytedance.adsdk.lr.ik.lr;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements ik {
    private final boolean fi;
    private final com.bytedance.adsdk.lr.ik.ri.di ik;
    private final boolean ka;
    private final com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> lr;
    private final String ri;

    public lr(String str, com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVar, com.bytedance.adsdk.lr.ik.ri.di diVar, boolean z, boolean z2) {
        this.ri = str;
        this.lr = awVar;
        this.ik = diVar;
        this.ka = z;
        this.fi = z2;
    }

    public boolean fi() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ik.ri.di ik() {
        return this.ik;
    }

    public boolean ka() {
        return this.ka;
    }

    public com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> lr() {
        return this.lr;
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.di(jbsVar, riVar, this);
    }

    public String ri() {
        return this.ri;
    }
}

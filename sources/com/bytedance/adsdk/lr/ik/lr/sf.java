package com.bytedance.adsdk.lr.ik.lr;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class sf implements ik {
    private final boolean fi;
    private final com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> ik;
    private final com.bytedance.adsdk.lr.ik.ri.lr ka;
    private final com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> lr;
    private final String ri;

    public sf(String str, com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVar, com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVar2, com.bytedance.adsdk.lr.ik.ri.lr lrVar, boolean z) {
        this.ri = str;
        this.lr = awVar;
        this.ik = awVar2;
        this.ka = lrVar;
        this.fi = z;
    }

    public boolean fi() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> ik() {
        return this.ik;
    }

    public com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> ka() {
        return this.lr;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr lr() {
        return this.ka;
    }

    public String ri() {
        return this.ri;
    }

    public String toString() {
        return "RectangleShape{position=" + this.lr + ", size=" + this.ik + '}';
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.vr(jbsVar, riVar, this);
    }
}

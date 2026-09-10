package com.bytedance.adsdk.lr.ik.lr;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class qt implements ik {
    private final com.bytedance.adsdk.lr.ik.ri.lr di;
    private final com.bytedance.adsdk.lr.ik.ri.lr fi;
    private final com.bytedance.adsdk.lr.ik.ri.lr ik;
    private final com.bytedance.adsdk.lr.ik.ri.lr jbs;
    private final com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> ka;
    private final ri lr;
    private final com.bytedance.adsdk.lr.ik.ri.lr mj;
    private final boolean qt;
    private final String ri;
    private final boolean sf;
    private final com.bytedance.adsdk.lr.ik.ri.lr xha;

    public enum ri {
        STAR(1),
        POLYGON(2);

        private final int ik;

        ri(int i) {
            this.ik = i;
        }

        public static ri ri(int i) {
            for (ri riVar : values()) {
                if (riVar.ik == i) {
                    return riVar;
                }
            }
            return null;
        }
    }

    public qt(String str, ri riVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar, com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar2, com.bytedance.adsdk.lr.ik.ri.lr lrVar3, com.bytedance.adsdk.lr.ik.ri.lr lrVar4, com.bytedance.adsdk.lr.ik.ri.lr lrVar5, com.bytedance.adsdk.lr.ik.ri.lr lrVar6, boolean z, boolean z2) {
        this.ri = str;
        this.lr = riVar;
        this.ik = lrVar;
        this.ka = awVar;
        this.fi = lrVar2;
        this.di = lrVar3;
        this.xha = lrVar4;
        this.mj = lrVar5;
        this.jbs = lrVar6;
        this.qt = z;
        this.sf = z2;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr di() {
        return this.di;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr fi() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr ik() {
        return this.ik;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr jbs() {
        return this.jbs;
    }

    public com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> ka() {
        return this.ka;
    }

    public ri lr() {
        return this.lr;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr mj() {
        return this.mj;
    }

    public boolean qt() {
        return this.qt;
    }

    public String ri() {
        return this.ri;
    }

    public boolean sf() {
        return this.sf;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr xha() {
        return this.xha;
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.bgr(jbsVar, riVar, this);
    }
}

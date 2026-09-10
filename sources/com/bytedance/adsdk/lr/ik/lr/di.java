package com.bytedance.adsdk.lr.ik.lr;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class di implements ik {
    private final boolean aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final com.bytedance.adsdk.lr.ik.ri.lr f17997co;
    private final com.bytedance.adsdk.lr.ik.ri.di di;
    private final com.bytedance.adsdk.lr.ik.ri.di fi;
    private final com.bytedance.adsdk.lr.ik.ri.ik ik;
    private final nr.lr jbs;
    private final com.bytedance.adsdk.lr.ik.ri.ka ka;
    private final xha lr;
    private final nr.ri mj;
    private final float qt;
    private final String ri;
    private final List<com.bytedance.adsdk.lr.ik.ri.lr> sf;
    private final com.bytedance.adsdk.lr.ik.ri.lr xha;

    public di(String str, xha xhaVar, com.bytedance.adsdk.lr.ik.ri.ik ikVar, com.bytedance.adsdk.lr.ik.ri.ka kaVar, com.bytedance.adsdk.lr.ik.ri.di diVar, com.bytedance.adsdk.lr.ik.ri.di diVar2, com.bytedance.adsdk.lr.ik.ri.lr lrVar, nr.ri riVar, nr.lr lrVar2, float f, List<com.bytedance.adsdk.lr.ik.ri.lr> list, com.bytedance.adsdk.lr.ik.ri.lr lrVar3, boolean z) {
        this.ri = str;
        this.lr = xhaVar;
        this.ik = ikVar;
        this.ka = kaVar;
        this.fi = diVar;
        this.di = diVar2;
        this.xha = lrVar;
        this.mj = riVar;
        this.jbs = lrVar2;
        this.qt = f;
        this.sf = list;
        this.f17997co = lrVar3;
        this.aw = z;
    }

    public boolean aw() {
        return this.aw;
    }

    public float co() {
        return this.qt;
    }

    public com.bytedance.adsdk.lr.ik.ri.di di() {
        return this.di;
    }

    public com.bytedance.adsdk.lr.ik.ri.di fi() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ik.ri.ik ik() {
        return this.ik;
    }

    public nr.lr jbs() {
        return this.jbs;
    }

    public com.bytedance.adsdk.lr.ik.ri.ka ka() {
        return this.ka;
    }

    public xha lr() {
        return this.lr;
    }

    public nr.ri mj() {
        return this.mj;
    }

    public List<com.bytedance.adsdk.lr.ik.ri.lr> qt() {
        return this.sf;
    }

    public String ri() {
        return this.ri;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr sf() {
        return this.f17997co;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr xha() {
        return this.xha;
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.jbs(jbsVar, riVar, this);
    }
}

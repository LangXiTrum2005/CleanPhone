package com.bytedance.adsdk.lr.ik.lr;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements ik {
    private final com.bytedance.adsdk.lr.ik.ri.di di;
    private final com.bytedance.adsdk.lr.ik.ri.di fi;
    private final com.bytedance.adsdk.lr.ik.ri.ik ik;
    private final com.bytedance.adsdk.lr.ik.ri.lr jbs;
    private final com.bytedance.adsdk.lr.ik.ri.ka ka;
    private final Path.FillType lr;
    private final com.bytedance.adsdk.lr.ik.ri.lr mj;
    private final boolean qt;
    private final xha ri;
    private final String xha;

    public fi(String str, xha xhaVar, Path.FillType fillType, com.bytedance.adsdk.lr.ik.ri.ik ikVar, com.bytedance.adsdk.lr.ik.ri.ka kaVar, com.bytedance.adsdk.lr.ik.ri.di diVar, com.bytedance.adsdk.lr.ik.ri.di diVar2, com.bytedance.adsdk.lr.ik.ri.lr lrVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar2, boolean z) {
        this.ri = xhaVar;
        this.lr = fillType;
        this.ik = ikVar;
        this.ka = kaVar;
        this.fi = diVar;
        this.di = diVar2;
        this.xha = str;
        this.mj = lrVar;
        this.jbs = lrVar2;
        this.qt = z;
    }

    public com.bytedance.adsdk.lr.ik.ri.di di() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ik.ri.ka fi() {
        return this.ka;
    }

    public Path.FillType ik() {
        return this.lr;
    }

    public com.bytedance.adsdk.lr.ik.ri.ik ka() {
        return this.ik;
    }

    public xha lr() {
        return this.ri;
    }

    public boolean mj() {
        return this.qt;
    }

    public String ri() {
        return this.xha;
    }

    public com.bytedance.adsdk.lr.ik.ri.di xha() {
        return this.di;
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.mj(jbsVar, xhaVar, riVar, this);
    }
}

package com.bytedance.adsdk.lr.ik.lr;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public class vr implements ik {
    private final boolean di;
    private final com.bytedance.adsdk.lr.ik.ri.ka fi;
    private final String ik;
    private final com.bytedance.adsdk.lr.ik.ri.ri ka;
    private final Path.FillType lr;
    private final boolean ri;

    public vr(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.lr.ik.ri.ri riVar, com.bytedance.adsdk.lr.ik.ri.ka kaVar, boolean z2) {
        this.ik = str;
        this.ri = z;
        this.lr = fillType;
        this.ka = riVar;
        this.fi = kaVar;
        this.di = z2;
    }

    public boolean fi() {
        return this.di;
    }

    public com.bytedance.adsdk.lr.ik.ri.ka ik() {
        return this.fi;
    }

    public Path.FillType ka() {
        return this.lr;
    }

    public com.bytedance.adsdk.lr.ik.ri.ri lr() {
        return this.ka;
    }

    public String ri() {
        return this.ik;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.ri + '}';
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.xha(jbsVar, riVar, this);
    }
}

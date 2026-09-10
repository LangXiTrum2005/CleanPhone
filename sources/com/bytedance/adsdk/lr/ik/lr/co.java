package com.bytedance.adsdk.lr.ik.lr;

/* JADX INFO: loaded from: classes2.dex */
public class co implements ik {
    private final boolean fi;
    private final com.bytedance.adsdk.lr.ik.ri.lr ik;
    private final com.bytedance.adsdk.lr.ik.ri.co ka;
    private final com.bytedance.adsdk.lr.ik.ri.lr lr;
    private final String ri;

    public co(String str, com.bytedance.adsdk.lr.ik.ri.lr lrVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar2, com.bytedance.adsdk.lr.ik.ri.co coVar, boolean z) {
        this.ri = str;
        this.lr = lrVar;
        this.ik = lrVar2;
        this.ka = coVar;
        this.fi = z;
    }

    public boolean fi() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr ik() {
        return this.ik;
    }

    public com.bytedance.adsdk.lr.ik.ri.co ka() {
        return this.ka;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.slm(jbsVar, riVar, this);
    }
}

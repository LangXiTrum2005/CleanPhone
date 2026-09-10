package com.bytedance.adsdk.lr.ik.lr;

/* JADX INFO: loaded from: classes2.dex */
public class bu implements ik {
    private final com.bytedance.adsdk.lr.ik.ri.mj ik;
    private final boolean ka;
    private final int lr;
    private final String ri;

    public bu(String str, int i, com.bytedance.adsdk.lr.ik.ri.mj mjVar, boolean z) {
        this.ri = str;
        this.lr = i;
        this.ik = mjVar;
        this.ka = z;
    }

    public boolean ik() {
        return this.ka;
    }

    public com.bytedance.adsdk.lr.ik.ri.mj lr() {
        return this.ik;
    }

    public String ri() {
        return this.ri;
    }

    public String toString() {
        return "ShapePath{name=" + this.ri + ", index=" + this.lr + '}';
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.nr(jbsVar, riVar, this);
    }
}

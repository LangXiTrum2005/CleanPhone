package com.bytedance.adsdk.lr.ik.lr;

/* JADX INFO: loaded from: classes2.dex */
public class aw implements ik {
    private final com.bytedance.adsdk.lr.ik.ri.aw<Float, Float> lr;
    private final String ri;

    public aw(String str, com.bytedance.adsdk.lr.ik.ri.aw<Float, Float> awVar) {
        this.ri = str;
        this.lr = awVar;
    }

    public com.bytedance.adsdk.lr.ik.ri.aw<Float, Float> lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.bu(jbsVar, riVar, this);
    }
}

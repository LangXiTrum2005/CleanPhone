package com.bytedance.adsdk.lr.ik.lr;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private final com.bytedance.adsdk.lr.ik.ri.ka ik;
    private final boolean ka;
    private final com.bytedance.adsdk.lr.ik.ri.mj lr;
    private final ri ri;

    public enum ri {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public mj(ri riVar, com.bytedance.adsdk.lr.ik.ri.mj mjVar, com.bytedance.adsdk.lr.ik.ri.ka kaVar, boolean z) {
        this.ri = riVar;
        this.lr = mjVar;
        this.ik = kaVar;
        this.ka = z;
    }

    public com.bytedance.adsdk.lr.ik.ri.ka ik() {
        return this.ik;
    }

    public boolean ka() {
        return this.ka;
    }

    public com.bytedance.adsdk.lr.ik.ri.mj lr() {
        return this.lr;
    }

    public ri ri() {
        return this.ri;
    }
}

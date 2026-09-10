package com.bytedance.adsdk.lr.ik.lr;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class slm implements ik {
    private final boolean ik;
    private final List<ik> lr;
    private final String ri;

    public slm(String str, List<ik> list, boolean z) {
        this.ri = str;
        this.lr = list;
        this.ik = z;
    }

    public boolean ik() {
        return this.ik;
    }

    public List<ik> lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.ri + "' Shapes: " + Arrays.toString(this.lr.toArray()) + '}';
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.ka(jbsVar, riVar, this, xhaVar);
    }
}

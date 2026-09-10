package com.bytedance.adsdk.lr.ri.lr;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends xha<com.bytedance.adsdk.lr.ik.lr.ka> {
    private final com.bytedance.adsdk.lr.ik.lr.ka ka;

    public fi(List<com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.ka>> list) {
        super(list);
        com.bytedance.adsdk.lr.ik.lr.ka kaVar = list.get(0).ri;
        int iIk = kaVar != null ? kaVar.ik() : 0;
        this.ka = new com.bytedance.adsdk.lr.ik.lr.ka(new float[iIk], new int[iIk]);
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lr.ik.lr.ka ri(com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.ka> riVar, float f) {
        this.ka.ri(riVar.ri, riVar.lr, f);
        return this.ka;
    }
}

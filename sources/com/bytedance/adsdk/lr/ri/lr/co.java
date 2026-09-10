package com.bytedance.adsdk.lr.ri.lr;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class co extends xha<com.bytedance.adsdk.lr.xha.ik> {
    private final com.bytedance.adsdk.lr.xha.ik ka;

    public co(List<com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.xha.ik>> list) {
        super(list);
        this.ka = new com.bytedance.adsdk.lr.xha.ik();
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lr.xha.ik ri(com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.xha.ik> riVar, float f) {
        com.bytedance.adsdk.lr.xha.ik ikVar;
        com.bytedance.adsdk.lr.xha.ik ikVar2 = riVar.ri;
        if (ikVar2 == null || (ikVar = riVar.lr) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.lr.xha.ik ikVar3 = ikVar2;
        com.bytedance.adsdk.lr.xha.ik ikVar4 = ikVar;
        if (this.ik == null) {
            this.ka.ri(com.bytedance.adsdk.lr.di.fi.ri(ikVar3.ri(), ikVar4.ri(), f), com.bytedance.adsdk.lr.di.fi.ri(ikVar3.lr(), ikVar4.lr(), f));
            return this.ka;
        }
        riVar.xha.getClass();
        ka();
        mj();
        throw null;
    }
}

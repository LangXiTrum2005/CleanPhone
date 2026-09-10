package com.bytedance.adsdk.lr.ri.lr;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class di extends xha<Integer> {
    public di(List<com.bytedance.adsdk.lr.xha.ri<Integer>> list) {
        super(list);
    }

    public int ik(com.bytedance.adsdk.lr.xha.ri<Integer> riVar, float f) {
        if (riVar.ri == null || riVar.lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.ik == null) {
            return com.bytedance.adsdk.lr.di.fi.ri(riVar.mj(), riVar.jbs(), f);
        }
        riVar.xha.getClass();
        ka();
        mj();
        throw null;
    }

    public int jbs() {
        return ik(ik(), fi());
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Integer ri(com.bytedance.adsdk.lr.xha.ri<Integer> riVar, float f) {
        return Integer.valueOf(ik(riVar, f));
    }
}

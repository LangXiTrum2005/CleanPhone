package com.bytedance.adsdk.lr.ri.lr;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends xha<Float> {
    public ka(List<com.bytedance.adsdk.lr.xha.ri<Float>> list) {
        super(list);
    }

    public float ik(com.bytedance.adsdk.lr.xha.ri<Float> riVar, float f) {
        if (riVar.ri == null || riVar.lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.ik == null) {
            return com.bytedance.adsdk.lr.di.fi.ri(riVar.di(), riVar.xha(), f);
        }
        riVar.xha.getClass();
        ka();
        mj();
        throw null;
    }

    public float jbs() {
        return ik(ik(), fi());
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Float ri(com.bytedance.adsdk.lr.xha.ri<Float> riVar, float f) {
        return Float.valueOf(ik(riVar, f));
    }
}

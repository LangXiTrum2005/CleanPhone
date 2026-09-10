package com.bytedance.adsdk.lr.ri.lr;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends xha<Integer> {
    public lr(List<com.bytedance.adsdk.lr.xha.ri<Integer>> list) {
        super(list);
    }

    public int ik(com.bytedance.adsdk.lr.xha.ri<Integer> riVar, float f) {
        if (riVar.ri == null || riVar.lr == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.ik == null) {
            return com.bytedance.adsdk.lr.di.lr.ri(com.bytedance.adsdk.lr.di.fi.lr(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), riVar.ri.intValue(), riVar.lr.intValue());
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

package com.bytedance.sdk.openadsdk.component.reward.lr;

import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    public static lr ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        wjv wjvVar = riVar.lr;
        if (xha.ri(wjvVar) && !ik.ri(wjvVar)) {
            return new xha(riVar);
        }
        if (ka.ri(wjvVar)) {
            return new ka(riVar);
        }
        return ik.ri(wjvVar) ? new ik(riVar) : new fi(riVar);
    }
}

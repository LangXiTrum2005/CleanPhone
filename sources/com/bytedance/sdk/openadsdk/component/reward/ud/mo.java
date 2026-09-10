package com.bytedance.sdk.openadsdk.component.reward.ud;

import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    public static ud qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        ljh ljhVar = qdlVar.ud;
        if (wd.qdl(ljhVar) && !lnr.qdl(ljhVar)) {
            return new wd(qdlVar);
        }
        if (jpc.qdl(ljhVar)) {
            return new jpc(qdlVar);
        }
        if (mml.qdl(ljhVar)) {
            return new mml(qdlVar);
        }
        return lnr.qdl(ljhVar) ? new lnr(qdlVar) : new mzz(qdlVar);
    }
}

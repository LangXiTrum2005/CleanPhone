package com.bytedance.sdk.openadsdk.bjy.ud;

import com.bytedance.sdk.component.jpc.lnr;
import com.bytedance.sdk.openadsdk.bjy.qdl.mml;
import com.bytedance.sdk.openadsdk.bjy.ud;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements lnr {
    @Override // com.bytedance.sdk.component.jpc.lnr
    public void qdl(final com.bytedance.sdk.component.jpc.ud.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl();
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl("stats_sdk_thread_num", false, new ud() { // from class: com.bytedance.sdk.openadsdk.bjy.ud.qdl.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                com.bytedance.sdk.component.jpc.ud.qdl qdlVar2;
                if (!yt.mml().dk() || (qdlVar2 = qdlVar) == null || qdlVar2.qdl() == null) {
                    return null;
                }
                return mml.ud().qdl("stats_sdk_thread_num").ud(qdlVar.qdl().toString());
            }
        });
    }
}

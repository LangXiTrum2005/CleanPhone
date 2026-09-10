package com.bytedance.sdk.openadsdk.STP.LD;

import com.bytedance.sdk.component.OY.lk;
import com.bytedance.sdk.openadsdk.STP.LD;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.core.kqm;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements lk {
    @Override // com.bytedance.sdk.component.OY.lk
    public void Lxb(final com.bytedance.sdk.component.OY.LD.Lxb lxb) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb();
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("stats_sdk_thread_num", false, new LD() { // from class: com.bytedance.sdk.openadsdk.STP.LD.Lxb.1
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                com.bytedance.sdk.component.OY.LD.Lxb lxb2;
                if (!kqm.ZU().Lpq() || (lxb2 = lxb) == null || lxb2.Lxb() == null) {
                    return null;
                }
                return ZU.LD().Lxb("stats_sdk_thread_num").LD(lxb.Lxb().toString());
            }
        });
    }
}

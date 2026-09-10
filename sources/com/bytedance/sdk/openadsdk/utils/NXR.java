package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NXR implements com.bytedance.sdk.openadsdk.oem.Lxb {
    private static com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb LD;
    private static final NXR Lxb = new NXR();
    private static boolean lk;

    public static void LD() {
        lk = true;
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        com.bytedance.sdk.openadsdk.core.model.HD hdWVT = lxb.LD.wVT();
        if (hdWVT == null || !hdWVT.Lxb()) {
            return;
        }
        LD = lxb;
        IPMiBroadcastReceiver iPMiBroadcastReceiverLxb = IPMiBroadcastReceiver.Lxb(lxb.NDz);
        if (iPMiBroadcastReceiverLxb != null) {
            iPMiBroadcastReceiverLxb.Lxb(Lxb);
        }
    }

    public static void Lxb() {
        if (LD == null) {
            return;
        }
        LD = null;
        IPMiBroadcastReceiver iPMiBroadcastReceiverLxb = IPMiBroadcastReceiver.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
        if (iPMiBroadcastReceiverLxb != null) {
            iPMiBroadcastReceiverLxb.Lxb();
        }
        lk = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.Lxb
    public void Lxb(String str, final int i) {
        com.bytedance.sdk.openadsdk.core.model.lk lkVarMGT;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = LD;
        if (lxb == null || (lkVarMGT = lxb.LD.MGT()) == null) {
            return;
        }
        String strLk = lkVarMGT.lk();
        if (TextUtils.isEmpty(strLk) || !strLk.equals(str)) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.NXR.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                if (NXR.LD == null || (i2 = i) <= 0 || i2 > 5) {
                    return;
                }
                boolean z = i2 == 1;
                if (NXR.lk) {
                    NXR.LD.dR.ZU();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, NXR.LD.LD, new com.bytedance.sdk.openadsdk.core.model.nBu.Lxb().Lxb(), NXR.LD.JXs, true, (Map<String, Object>) map, 1);
                } else if (!z) {
                    return;
                }
                NXR.Lxb();
            }
        });
    }
}

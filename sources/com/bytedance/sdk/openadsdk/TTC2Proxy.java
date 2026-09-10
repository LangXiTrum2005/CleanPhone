package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.ebl;
import com.bytedance.sdk.openadsdk.component.ebl.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void a(Context context) {
        Lxb.Lxb(context);
    }

    public static void load(Context context, AdSlot adSlot, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener, int i) {
        adSlot.setDurationSlotType(3);
        ebl.Lxb(context).Lxb(adSlot, pAGAppOpenAdLoadListener, i);
    }
}

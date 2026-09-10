package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.component.LD.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public class TTC5Proxy {
    public static void loadFeed(Context context, AdSlot adSlot, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        adSlot.setDurationSlotType(5);
        Lxb.Lxb().Lxb(context, adSlot, pAGNativeAdLoadListener);
    }
}

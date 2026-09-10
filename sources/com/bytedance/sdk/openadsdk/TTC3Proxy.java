package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.lk.LD;
import com.bytedance.sdk.openadsdk.component.reward.JXs;
import com.bytedance.sdk.openadsdk.component.reward.ebl;
import com.bytedance.sdk.openadsdk.component.reward.nBu;
import com.bytedance.sdk.openadsdk.component.reward.sLN;

/* JADX INFO: loaded from: classes2.dex */
public class TTC3Proxy {
    public static void a(Context context) {
        try {
            sLN.Lxb(context).Lxb();
        } catch (Throwable unused) {
        }
        try {
            JXs.Lxb(context).Lxb();
        } catch (Throwable unused2) {
        }
    }

    public static void loadFull(Context context, AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        adSlot.setDurationSlotType(8);
        JXs.Lxb(context).Lxb(adSlot, new LD(pAGInterstitialAdLoadListener));
    }

    public static void loadReward(Context context, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        adSlot.setDurationSlotType(7);
        sLN.Lxb(context).Lxb(adSlot, new ebl(pAGRewardedAdLoadListener));
    }

    public static void verityPlayable(String str, int i, String str2, String str3, String str4) {
        nBu.Lxb(str, i, str2, str3, str4);
    }
}

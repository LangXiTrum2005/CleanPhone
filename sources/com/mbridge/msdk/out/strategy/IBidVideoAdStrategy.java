package com.mbridge.msdk.out.strategy;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.video.bt.module.orglistener.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface IBidVideoAdStrategy extends IBaseVideoAdStrategy {
    void clearBitmapCache();

    boolean isBidReady();

    void loadFromBid(String str);

    void setIVRewardEnable(int i10, double d10);

    void setIVRewardEnable(int i10, int i11);

    void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener);

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void setRewardPlus(boolean z10);

    void setRewardVideoListener(g gVar);

    void showFromBid();

    void showFromBid(Activity activity);

    void showFromBid(Activity activity, String str);

    void showFromBid(Activity activity, String str, String str2);

    void showFromBid(String str);

    void showFromBid(String str, String str2);
}

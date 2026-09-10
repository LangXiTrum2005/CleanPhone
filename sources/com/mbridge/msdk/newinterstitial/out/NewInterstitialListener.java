package com.mbridge.msdk.newinterstitial.out;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface NewInterstitialListener {
    void onAdClicked(MBridgeIds mBridgeIds);

    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdShow(MBridgeIds mBridgeIds);

    void onEndcardShow(MBridgeIds mBridgeIds);

    void onLoadCampaignSuccess(MBridgeIds mBridgeIds);

    void onResourceLoadFail(MBridgeIds mBridgeIds, String str);

    void onResourceLoadSuccess(MBridgeIds mBridgeIds);

    void onShowFail(MBridgeIds mBridgeIds, String str);

    void onVideoComplete(MBridgeIds mBridgeIds);
}

package com.mbridge.msdk.out;

import com.mbridge.msdk.video.bt.module.orglistener.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface RewardVideoListener extends g {
    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onAdShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onEndcardShow(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onLoadSuccess(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onShowFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoAdClicked(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoComplete(MBridgeIds mBridgeIds);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoLoadFail(MBridgeIds mBridgeIds, String str);

    @Override // com.mbridge.msdk.video.bt.module.orglistener.g
    void onVideoLoadSuccess(MBridgeIds mBridgeIds);
}

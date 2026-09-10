package com.mbridge.msdk.newinterstitial.out;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.util.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NewInterstitialWithCodeListener implements NewInterstitialListener {
    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        onResourceLoadFailWithCode(mBridgeIds, a.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, str), str);
    }

    public abstract void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str);

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, a.b(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, str), str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str);
}

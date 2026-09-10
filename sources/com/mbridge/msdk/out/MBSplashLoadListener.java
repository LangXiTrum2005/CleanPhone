package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface MBSplashLoadListener {
    void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10);

    void onLoadFailed(MBridgeIds mBridgeIds, String str, int i10);

    void onLoadSuccessed(MBridgeIds mBridgeIds, int i10);
}

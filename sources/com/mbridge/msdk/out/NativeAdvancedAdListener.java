package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface NativeAdvancedAdListener {
    void closeFullScreen(MBridgeIds mBridgeIds);

    void onClick(MBridgeIds mBridgeIds);

    void onClose(MBridgeIds mBridgeIds);

    void onLeaveApp(MBridgeIds mBridgeIds);

    void onLoadFailed(MBridgeIds mBridgeIds, String str);

    void onLoadSuccessed(MBridgeIds mBridgeIds);

    void onLogImpression(MBridgeIds mBridgeIds);

    void showFullScreen(MBridgeIds mBridgeIds);
}

package com.mbridge.msdk.playercommon;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onBufferingTimeOut(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int i10, int i11);

    void onPlayProgressMS(int i10, int i11);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int i10);
}

package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface IDownloadListener {
    void onEnd(int i10, int i11, String str);

    void onProgressUpdate(int i10);

    void onStart();

    void onStatus(int i10);
}

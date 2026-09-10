package com.smartdigimkt.sdk.api.format;

/* JADX INFO: loaded from: classes6.dex */
public interface SDMNativeAdMediaViewListener {
    void onProgressUpdate(long j, long j2);

    void onVideoAdComplete();

    void onVideoAdStartPlay(long j);

    void onVideoError(String str, String str2);
}

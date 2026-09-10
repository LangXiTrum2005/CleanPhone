package com.smartdigimkt.e3;

import com.smartdigimkt.x.d;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    void onAdClose(boolean z2, String str, float f);

    void onAdCloseWithIVReward(boolean z2, int i2);

    void onAdShow();

    void onEndcardShow();

    void onLoadSuccess();

    void onShowFail(String str);

    void onVideoAdClicked(d dVar);

    void onVideoComplete();

    void onVideoLoadFail(String str);

    void onVideoLoadSuccess();
}

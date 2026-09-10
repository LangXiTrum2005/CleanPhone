package com.smartdigimkt.q8;

import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface k<T> {
    void onAdLoadFail(AdError adError);

    void onAdLoaded(T t);
}

package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface AdapterAdListener {
    void onAdClicked();

    default void onAdClicked(Map<String, Object> map) {
        onAdClicked();
    }

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str);

    default void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str, Map<String, Object> map) {
        onAdLoadFailed(adapterErrorType, i10, str);
    }

    void onAdLoadSuccess();

    default void onAdLoadSuccess(Map<String, Object> map) {
        onAdLoadSuccess();
    }

    void onAdOpened();

    default void onAdOpened(Map<String, Object> map) {
        onAdOpened();
    }

    void onAdShowFailed(int i10, String str);

    default void onAdShowFailed(int i10, String str, Map<String, Object> map) {
        onAdShowFailed(i10, str);
    }
}

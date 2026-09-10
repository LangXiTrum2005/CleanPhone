package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    default void onAdClosed(Map<String, Object> map) {
        onAdClosed();
    }

    void onAdEnded();

    default void onAdEnded(Map<String, Object> map) {
        onAdEnded();
    }

    void onAdStarted();

    default void onAdStarted(Map<String, Object> map) {
        onAdStarted();
    }

    void onAdVisible();

    default void onAdVisible(Map<String, Object> map) {
        onAdVisible();
    }
}

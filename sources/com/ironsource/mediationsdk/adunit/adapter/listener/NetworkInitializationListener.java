package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i10, String str);

    default void onInitFailed(int i10, String str, Map<String, Object> map) {
        onInitFailed(i10, str);
    }

    void onInitSuccess();

    default void onInitSuccess(Map<String, Object> map) {
        onInitSuccess();
    }
}

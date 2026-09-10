package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    default void onAdLeftApplication(Map<String, Object> map) {
        onAdLeftApplication();
    }

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    default void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        onAdLoadSuccess(view, layoutParams);
    }

    void onAdScreenDismissed();

    default void onAdScreenDismissed(Map<String, Object> map) {
        onAdScreenDismissed();
    }

    void onAdScreenPresented();

    default void onAdScreenPresented(Map<String, Object> map) {
        onAdScreenPresented();
    }
}

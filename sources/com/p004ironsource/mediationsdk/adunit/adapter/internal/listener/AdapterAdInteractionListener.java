package com.p004ironsource.mediationsdk.adunit.adapter.internal.listener;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdShowFailed(int i2, String str);

    void onAdShowSuccess();

    void onAdStarted();

    void onAdVisible();
}

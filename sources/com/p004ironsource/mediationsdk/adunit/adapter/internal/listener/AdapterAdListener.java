package com.p004ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;

/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i2, String str);

    void onAdLoadSuccess();

    void onAdOpened();
}

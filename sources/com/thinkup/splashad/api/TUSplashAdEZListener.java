package com.thinkup.splashad.api;

import android.content.Context;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUSplashAdEZListener implements TUSplashExListener {
    @Override // com.thinkup.splashad.api.TUSplashAdListener
    public final void onAdLoadTimeout() {
    }

    public abstract void onAdLoaded();

    @Override // com.thinkup.splashad.api.TUSplashAdListener
    public final void onAdLoaded(boolean z2) {
        onAdLoaded();
    }

    @Override // com.thinkup.splashad.api.TUSplashExListener
    public void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z2) {
    }

    @Override // com.thinkup.splashad.api.TUSplashExListener
    public void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
    }
}

package com.thinkup.splashad.o;

import android.content.Context;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.splashad.api.TUSplashAdExtraInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    boolean mHasDismiss;

    public abstract void onAdClick(TUAdInfo tUAdInfo);

    public abstract void onAdDismiss(TUAdInfo tUAdInfo, TUSplashAdExtraInfo tUSplashAdExtraInfo);

    public abstract void onAdShow(TUAdInfo tUAdInfo);

    public void onCallbackAdDismiss(TUAdInfo tUAdInfo, TUSplashAdExtraInfo tUSplashAdExtraInfo) {
        if (this.mHasDismiss) {
            return;
        }
        this.mHasDismiss = true;
        onAdDismiss(tUAdInfo, tUSplashAdExtraInfo);
    }

    public abstract void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z2);

    public abstract void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}

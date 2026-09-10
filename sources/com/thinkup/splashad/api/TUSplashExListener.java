package com.thinkup.splashad.api;

import android.content.Context;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TUSplashExListener extends TUSplashAdListener {
    void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z2);

    void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}

package com.thinkup.banner.api;

import android.content.Context;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TUBannerExListener extends TUBannerListener {
    void onDeeplinkCallback(boolean z2, TUAdInfo tUAdInfo, boolean z3);

    void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}

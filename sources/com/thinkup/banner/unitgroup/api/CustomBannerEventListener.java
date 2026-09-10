package com.thinkup.banner.unitgroup.api;

import android.content.Context;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface CustomBannerEventListener {
    void onBannerAdClicked();

    void onBannerAdClose();

    void onBannerAdShow();

    void onDeeplinkCallback(boolean z2);

    void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}

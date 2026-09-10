package com.thinkup.banner.o;

import android.content.Context;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface o0 {
    void onBannerClicked(CustomBannerAdapter customBannerAdapter);

    void onBannerClose(CustomBannerAdapter customBannerAdapter);

    void onBannerShow(CustomBannerAdapter customBannerAdapter, boolean z2);

    void onDeeplinkCallback(CustomBannerAdapter customBannerAdapter, boolean z2);

    void onDownloadConfirm(Context context, CustomBannerAdapter customBannerAdapter, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}

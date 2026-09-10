package com.thinkup.core.common.n;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface nm {
    void onAdClicked(View view);

    void onAdDislikeButtonClick();

    void onAdImpressed();

    void onAdVideoEnd();

    void onAdVideoProgress(int i2);

    void onAdVideoStart();

    void onDeeplinkCallback(boolean z2);

    void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}

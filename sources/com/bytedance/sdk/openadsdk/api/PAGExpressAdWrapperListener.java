package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i2);

    void onRenderFail(View view, String str, int i2);

    void onRenderSuccess(View view, float f, float f2);
}

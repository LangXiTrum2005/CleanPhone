package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory qdl;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return qdl;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        qdl = iSDKTypeFactory;
    }
}

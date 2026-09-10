package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3621lc implements InterfaceC3603kc {
    @Override // com.ironsource.InterfaceC3603kc
    public void a(Hc onNetworkSDKInitListener) {
        Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC3603kc
    public void b(String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC3603kc
    public void a(Context applicationContext, String applicationKey, String userId, Map<String, String> initParams) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC3603kc
    public void a(String controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC3603kc
    public void a(int i) {
        SDKUtils.setDebugMode(i);
    }
}

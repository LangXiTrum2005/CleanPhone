package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0536qc implements InterfaceC0518pc {
    @Override // com.ironsource.InterfaceC0518pc
    public void a(Mc onNetworkSDKInitListener) {
        kotlin.jvm.internal.n.f(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC0518pc
    public void b(String controllerUrl) {
        kotlin.jvm.internal.n.f(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC0518pc
    public void a(Context applicationContext, String applicationKey, String userId, Map<String, String> initParams) {
        kotlin.jvm.internal.n.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.n.f(applicationKey, "applicationKey");
        kotlin.jvm.internal.n.f(userId, "userId");
        kotlin.jvm.internal.n.f(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC0518pc
    public void a(String controllerConfig) {
        kotlin.jvm.internal.n.f(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC0518pc
    public void a(int i10) {
        SDKUtils.setDebugMode(i10);
    }
}

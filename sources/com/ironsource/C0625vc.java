package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;

/* JADX INFO: renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0625vc implements InterfaceC0607uc {
    @Override // com.ironsource.InterfaceC0607uc
    public void a(K9 adInstance, C0643wc loadParams) throws Exception {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }

    @Override // com.ironsource.InterfaceC0607uc
    public String a() {
        String version = IronSourceNetwork.getVersion();
        kotlin.jvm.internal.n.e(version, "getVersion()");
        return version;
    }
}

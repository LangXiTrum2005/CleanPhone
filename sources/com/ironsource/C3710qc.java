package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3710qc implements InterfaceC3693pc {
    @Override // com.ironsource.InterfaceC3693pc
    public void a(H9 adInstance, C3726rc loadParams) throws Exception {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }

    @Override // com.ironsource.InterfaceC3693pc
    public String a() {
        String version = IronSourceNetwork.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }
}

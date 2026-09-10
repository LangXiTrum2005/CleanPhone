package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3466d0 implements InterfaceC3448c0 {
    private final InterfaceC3794vc a;

    public C3466d0(InterfaceC3794vc networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC3448c0
    public void a(Activity activity, H9 adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC3448c0
    public boolean a(H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.a.a(adInstance);
    }
}

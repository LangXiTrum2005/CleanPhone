package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0291d0 implements InterfaceC0273c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ac f28408a;

    public C0291d0(Ac networkShowApi) {
        kotlin.jvm.internal.n.f(networkShowApi, "networkShowApi");
        this.f28408a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC0273c0
    public void a(Activity activity, K9 adInstance) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f28408a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC0273c0
    public boolean a(K9 adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        return this.f28408a.a(adInstance);
    }
}

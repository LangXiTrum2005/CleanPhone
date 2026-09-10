package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0255b0 implements InterfaceC0237a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0607uc f28237a;

    /* JADX INFO: renamed from: com.ironsource.b0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28238a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28239b = 1000;

        private a() {
        }
    }

    public C0255b0(InterfaceC0607uc networkLoadApi) {
        kotlin.jvm.internal.n.f(networkLoadApi, "networkLoadApi");
        this.f28237a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC0237a0
    public String a() {
        return this.f28237a.a();
    }

    @Override // com.ironsource.InterfaceC0237a0
    public void a(K9 adInstance, Map<String, String> loadParams) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        try {
            this.f28237a.a(adInstance, new C0643wc(null, false, 3, null));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e10.getMessage());
            String strN = defpackage.e.n("1000: loadAd failed: ", e10.getMessage());
            Hc hcB = adInstance.b();
            if (hcB instanceof C0261b6) {
                Hc hcB2 = adInstance.b();
                kotlin.jvm.internal.n.d(hcB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C0261b6) hcB2).onInterstitialLoadFailed(strN);
            } else if (hcB instanceof Jc) {
                Hc hcB3 = adInstance.b();
                kotlin.jvm.internal.n.d(hcB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Jc) hcB3).onBannerLoadFail(strN);
            }
        }
    }
}

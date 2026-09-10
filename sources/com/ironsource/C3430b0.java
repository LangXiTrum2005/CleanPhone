package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3430b0 implements InterfaceC3412a0 {
    private final InterfaceC3693pc a;

    /* JADX INFO: renamed from: com.ironsource.b0$a */
    public static final class a {
        public static final a a = new a();
        public static final int b = 1000;

        private a() {
        }
    }

    public C3430b0(InterfaceC3693pc networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC3412a0
    public String a() {
        return this.a.a();
    }

    @Override // com.ironsource.InterfaceC3412a0
    public void a(H9 adInstance, Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.a.a(adInstance, new C3726rc(null, false, 3, null));
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("1000: loadAd failed: ");
            sb.append(message);
            String string = sb.toString();
            Cc ccB = adInstance.b();
            if (ccB instanceof Y5) {
                Cc ccB2 = adInstance.b();
                Intrinsics.competently(ccB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((Y5) ccB2).onInterstitialLoadFailed(string);
            } else if (ccB instanceof Ec) {
                Cc ccB3 = adInstance.b();
                Intrinsics.competently(ccB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Ec) ccB3).onBannerLoadFail(string);
            }
        }
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3469d3 implements Ab {
    private final BannerAdRequest a;
    private final BannerAdLoaderListener b;
    private final InterfaceC3521g1 c;
    private final InterfaceC3715r1 d;

    public C3469d3(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC3521g1 adapterConfigProvider, InterfaceC3715r1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.Ab
    public InterfaceC3827xb a() throws Exception {
        IronSourceError ironSourceErrorA;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC3732s1 interfaceC3732s1A = this.d.a(new C3628m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            C3844yb c3844ybA = new C3861zb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C3496ec.e.a().c().get()).a();
            new C3433b3(c3844ybA, this.a.getSize()).a();
            C3710qc c3710qc = new C3710qc();
            C3665o2 c3665o2 = new C3665o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.beachfront(c3844ybA);
            P7 p7 = P7.a;
            return new C3415a3(bannerAdRequest, size, c3665o2, c3844ybA, c3710qc, interfaceC3732s1A, new C3451c3(p7, this.b), new I2(interfaceC3732s1A, p7.d()), null, null, 768, null);
        } catch (Exception e) {
            C3631m4.d().a(e);
            if (e instanceof C3498ee) {
                ironSourceErrorA = ((C3498ee) e).a();
            } else {
                C3753t5 c3753t5 = C3753t5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = c3753t5.a(message);
            }
            return new C3736s5(ironSourceErrorA, new C3451c3(P7.a, this.b), interfaceC3732s1A);
        }
    }

    public /* synthetic */ C3469d3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC3521g1 interfaceC3521g1, InterfaceC3715r1 interfaceC3715r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC3521g1, (i & 8) != 0 ? new C3699q1(IronSource.a.BANNER) : interfaceC3715r1);
    }
}

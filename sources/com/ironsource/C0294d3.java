package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;

/* JADX INFO: renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0294d3 implements Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f28410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerAdLoaderListener f28411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0346g1 f28412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0542r1 f28413d;

    public C0294d3(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC0346g1 adapterConfigProvider, InterfaceC0542r1 analyticsFactory) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        kotlin.jvm.internal.n.f(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.n.f(analyticsFactory, "analyticsFactory");
        this.f28410a = adRequest;
        this.f28411b = publisherListener;
        this.f28412c = adapterConfigProvider;
        this.f28413d = analyticsFactory;
    }

    @Override // com.ironsource.Eb
    public Bb a() throws Exception {
        IronSourceError ironSourceErrorA;
        String instanceId = this.f28410a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        kotlin.jvm.internal.n.e(sDKVersion, "getSDKVersion()");
        InterfaceC0560s1 interfaceC0560s1A = this.f28413d.a(new C0453m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Cb cbA = new Db(this.f28410a.getAdm(), this.f28410a.getProviderName$mediationsdk_release(), this.f28412c, C0410jc.f28993e.a().c().get()).a();
            new C0258b3(cbA, this.f28410a.getSize()).a();
            C0625vc c0625vc = new C0625vc();
            C0490o2 c0490o2 = new C0490o2(this.f28410a.getAdm(), this.f28410a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f28410a;
            AdSize size = bannerAdRequest.getSize();
            kotlin.jvm.internal.n.c(cbA);
            R7 r10 = R7.f27125a;
            return new C0240a3(bannerAdRequest, size, c0490o2, cbA, c0625vc, interfaceC0560s1A, new C0276c3(r10, this.f28411b), new I2(interfaceC0560s1A, r10.d()), null, null, 768, null);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            if (e10 instanceof C0555re) {
                ironSourceErrorA = ((C0555re) e10).a();
            } else {
                C0600u5 c0600u5 = C0600u5.f30795a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = c0600u5.a(message);
            }
            return new C0582t5(ironSourceErrorA, new C0276c3(R7.f27125a, this.f28411b), interfaceC0560s1A);
        }
    }

    public /* synthetic */ C0294d3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC0346g1 interfaceC0346g1, InterfaceC0542r1 interfaceC0542r1, int i10, kotlin.jvm.internal.g gVar) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC0346g1, (i10 & 8) != 0 ? new C0525q1(IronSource.a.BANNER) : interfaceC0542r1);
    }
}

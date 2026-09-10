package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class B9 implements Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f25729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterstitialAdLoaderListener f25730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0346g1 f25731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0542r1 f25732d;

    public B9(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC0346g1 adapterConfigProvider, InterfaceC0542r1 analyticsFactory) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        kotlin.jvm.internal.n.f(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.n.f(analyticsFactory, "analyticsFactory");
        this.f25729a = adRequest;
        this.f25730b = publisherListener;
        this.f25731c = adapterConfigProvider;
        this.f25732d = analyticsFactory;
    }

    @Override // com.ironsource.Eb
    public Bb a() throws Exception {
        IronSourceError ironSourceErrorB;
        String instanceId = this.f25729a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        kotlin.jvm.internal.n.e(sDKVersion, "getSDKVersion()");
        InterfaceC0560s1 interfaceC0560s1A = this.f25732d.a(new C0453m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Cb cbA = new Db(this.f25729a.getAdm(), this.f25729a.getProviderName$mediationsdk_release(), this.f25731c, C0410jc.f28993e.a().c().get()).a();
            new C0694z9(cbA).a();
            C0625vc c0625vc = new C0625vc();
            C0490o2 c0490o2 = new C0490o2(this.f25729a.getAdm(), this.f25729a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f25729a;
            kotlin.jvm.internal.n.c(cbA);
            R7 r10 = R7.f27125a;
            return new C0676y9(interstitialAdRequest, cbA, new A9(r10, this.f25730b), c0490o2, c0625vc, interfaceC0560s1A, new C0604u9(interfaceC0560s1A, r10.d()), null, null, 384, null);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            if (e10 instanceof C0555re) {
                ironSourceErrorB = ((C0555re) e10).a();
            } else {
                C0600u5 c0600u5 = C0600u5.f30795a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorB = c0600u5.b(message);
            }
            return new C0618v5(this.f25729a, new A9(R7.f27125a, this.f25730b), interfaceC0560s1A, ironSourceErrorB);
        }
    }

    public /* synthetic */ B9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC0346g1 interfaceC0346g1, InterfaceC0542r1 interfaceC0542r1, int i10, kotlin.jvm.internal.g gVar) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC0346g1, (i10 & 8) != 0 ? new C0525q1(IronSource.a.INTERSTITIAL) : interfaceC0542r1);
    }
}

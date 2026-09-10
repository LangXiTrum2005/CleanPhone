package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* JADX INFO: renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0269be implements Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f28303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RewardedAdLoaderListener f28304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0346g1 f28305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0542r1 f28306d;

    public C0269be(RewardedAdRequest adRequest, RewardedAdLoaderListener publisherListener, InterfaceC0346g1 adapterConfigProvider, InterfaceC0542r1 analyticsFactory) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        kotlin.jvm.internal.n.f(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.n.f(analyticsFactory, "analyticsFactory");
        this.f28303a = adRequest;
        this.f28304b = publisherListener;
        this.f28305c = adapterConfigProvider;
        this.f28306d = analyticsFactory;
    }

    @Override // com.ironsource.Eb
    public Bb a() throws Exception {
        IronSourceError ironSourceErrorD;
        String instanceId = this.f28303a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        kotlin.jvm.internal.n.e(sDKVersion, "getSDKVersion()");
        InterfaceC0560s1 interfaceC0560s1A = this.f28306d.a(new C0453m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Cb cbA = new Db(this.f28303a.getAdm(), this.f28303a.getProviderName$mediationsdk_release(), this.f28305c, C0410jc.f28993e.a().c().get()).a();
            new Zd(cbA).a();
            C0625vc c0625vc = new C0625vc();
            C0490o2 c0490o2 = new C0490o2(this.f28303a.getAdm(), this.f28303a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f28303a;
            kotlin.jvm.internal.n.c(cbA);
            R7 r10 = R7.f27125a;
            return new Yd(rewardedAdRequest, cbA, new C0251ae(r10, this.f28304b), c0490o2, c0625vc, interfaceC0560s1A, new Td(interfaceC0560s1A, r10.d()), null, null, 384, null);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            if (e10 instanceof C0555re) {
                ironSourceErrorD = ((C0555re) e10).a();
            } else {
                C0600u5 c0600u5 = C0600u5.f30795a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorD = c0600u5.d(message);
            }
            return new C0636w5(this.f28303a, new C0251ae(R7.f27125a, this.f28304b), interfaceC0560s1A, ironSourceErrorD);
        }
    }

    public /* synthetic */ C0269be(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC0346g1 interfaceC0346g1, InterfaceC0542r1 interfaceC0542r1, int i10, kotlin.jvm.internal.g gVar) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC0346g1, (i10 & 8) != 0 ? new C0525q1(IronSource.a.REWARDED_VIDEO) : interfaceC0542r1);
    }
}

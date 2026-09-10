package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3842y9 implements Ab {
    private final InterstitialAdRequest a;
    private final InterstitialAdLoaderListener b;
    private final InterfaceC3521g1 c;
    private final InterfaceC3715r1 d;

    public C3842y9(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC3521g1 adapterConfigProvider, InterfaceC3715r1 analyticsFactory) {
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
        IronSourceError ironSourceErrorB;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC3732s1 interfaceC3732s1A = this.d.a(new C3628m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            C3844yb c3844ybA = new C3861zb(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C3496ec.e.a().c().get()).a();
            new C3808w9(c3844ybA).a();
            C3710qc c3710qc = new C3710qc();
            C3665o2 c3665o2 = new C3665o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.a;
            Intrinsics.beachfront(c3844ybA);
            P7 p7 = P7.a;
            return new C3791v9(interstitialAdRequest, c3844ybA, new C3825x9(p7, this.b), c3665o2, c3710qc, interfaceC3732s1A, new C3723r9(interfaceC3732s1A, p7.d()), null, null, 384, null);
        } catch (Exception e) {
            C3631m4.d().a(e);
            if (e instanceof C3498ee) {
                ironSourceErrorB = ((C3498ee) e).a();
            } else {
                C3753t5 c3753t5 = C3753t5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorB = c3753t5.b(message);
            }
            return new C3770u5(this.a, new C3825x9(P7.a, this.b), interfaceC3732s1A, ironSourceErrorB);
        }
    }

    public /* synthetic */ C3842y9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC3521g1 interfaceC3521g1, InterfaceC3715r1 interfaceC3715r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC3521g1, (i & 8) != 0 ? new C3699q1(IronSource.a.INTERSTITIAL) : interfaceC3715r1);
    }
}

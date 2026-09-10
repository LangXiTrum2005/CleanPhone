package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3594k3 implements InterfaceC3521g1 {
    private final N3 a;
    private final C3846yd b;
    private final IronSource.a c;

    /* JADX INFO: renamed from: com.ironsource.k3$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C3594k3(N3 adFormatConfigurations, C3846yd c3846yd, IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormatConfigurations;
        this.b = c3846yd;
        this.c = adFormat;
    }

    @Override // com.ironsource.InterfaceC3521g1
    public InterfaceC3600k9 a(InterfaceC3727rd providerName) {
        NetworkSettings networkSettingsB;
        Rd rdF;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        C3846yd c3846yd = this.b;
        if (c3846yd == null || (networkSettingsB = c3846yd.b(providerName.value())) == null) {
            return null;
        }
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            U2 u2C = this.a.c();
            if (u2C != null) {
                return new Z2(new C3485e1(networkSettingsB, networkSettingsB.getBannerSettings(), this.c), u2C);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (rdF = this.a.f()) != null) {
                return new Id(new C3485e1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.c), rdF);
            }
            return null;
        }
        B9 b9D = this.a.d();
        if (b9D != null) {
            return new E9(new C3485e1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.c), b9D);
        }
        return null;
    }
}

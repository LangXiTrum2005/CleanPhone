package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0419k3 implements InterfaceC0346g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N3 f29021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ld f29022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IronSource.a f29023c;

    /* JADX INFO: renamed from: com.ironsource.k3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29024a;

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
            f29024a = iArr;
        }
    }

    public C0419k3(N3 adFormatConfigurations, Ld ld2, IronSource.a adFormat) {
        kotlin.jvm.internal.n.f(adFormatConfigurations, "adFormatConfigurations");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f29021a = adFormatConfigurations;
        this.f29022b = ld2;
        this.f29023c = adFormat;
    }

    @Override // com.ironsource.InterfaceC0346g1
    public InterfaceC0461m9 a(Ed providerName) {
        NetworkSettings networkSettingsB;
        C0323ee c0323eeF;
        kotlin.jvm.internal.n.f(providerName, "providerName");
        Ld ld2 = this.f29022b;
        if (ld2 == null || (networkSettingsB = ld2.b(providerName.value())) == null) {
            return null;
        }
        int i10 = a.f29024a[this.f29023c.ordinal()];
        if (i10 == 1) {
            U2 u2C = this.f29021a.c();
            if (u2C != null) {
                return new Z2(new C0310e1(networkSettingsB, networkSettingsB.getBannerSettings(), this.f29023c), u2C);
            }
            return null;
        }
        if (i10 != 2) {
            if (i10 == 3 && (c0323eeF = this.f29021a.f()) != null) {
                return new Vd(new C0310e1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.f29023c), c0323eeF);
            }
            return null;
        }
        E9 e9D = this.f29021a.d();
        if (e9D != null) {
            return new H9(new C0310e1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.f29023c), e9D);
        }
        return null;
    }
}

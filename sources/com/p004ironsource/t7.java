package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u0011\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0011\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/t7;", "Lcom/ironsource/c3;", "Lcom/ironsource/ar;", "providerName", "Lcom/ironsource/cj;", "a", "Lcom/ironsource/u8;", "Lcom/ironsource/u8;", "adFormatConfigurations", "Lcom/ironsource/er;", "b", "Lcom/ironsource/er;", "providerSettingsHolder", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", "c", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "<init>", "(Lcom/ironsource/u8;Lcom/ironsource/er;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t7 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u8 adFormatConfigurations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er providerSettingsHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27283a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27283a = iArr;
        }
    }

    public t7(u8 adFormatConfigurations, er erVar, IronSource.AD_UNIT adFormat) {
        Intrinsics.f(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.f(adFormat, "adFormat");
        this.adFormatConfigurations = adFormatConfigurations;
        this.providerSettingsHolder = erVar;
        this.adFormat = adFormat;
    }

    @Override // com.p004ironsource.c3
    public cj a(ar providerName) {
        NetworkSettings networkSettingsB;
        bs rewardedVideoConfigurations;
        Intrinsics.f(providerName, "providerName");
        er erVar = this.providerSettingsHolder;
        if (erVar == null || (networkSettingsB = erVar.b(providerName.value())) == null) {
            return null;
        }
        int i2 = a.f27283a[this.adFormat.ordinal()];
        if (i2 == 1) {
            u6 bannerConfigurations = this.adFormatConfigurations.getBannerConfigurations();
            if (bannerConfigurations != null) {
                return new z6(new a3(networkSettingsB, networkSettingsB.getBannerSettings(), this.adFormat), bannerConfigurations);
            }
            return null;
        }
        if (i2 != 2) {
            if (i2 == 3 && (rewardedVideoConfigurations = this.adFormatConfigurations.getRewardedVideoConfigurations()) != null) {
                return new or(new a3(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.adFormat), rewardedVideoConfigurations);
            }
            return null;
        }
        uj interstitialConfigurations = this.adFormatConfigurations.getInterstitialConfigurations();
        if (interstitialConfigurations != null) {
            return new xj(new a3(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.adFormat), interstitialConfigurations);
        }
        return null;
    }
}

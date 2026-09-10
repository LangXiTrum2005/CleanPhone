package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.ironsource.If;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppLovinWaterfallAppOpenAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0018J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\u0018J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/google/ads/mediation/applovin/AppLovinWaterfallAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/applovin/mediation/MaxAdListener;", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "loadCallback", "Lcom/google/ads/mediation/applovin/AppLovinInitializer;", "appLovinInitializer", "Lcom/google/ads/mediation/applovin/AppLovinAdFactory;", "appLovinAdFactory", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/applovin/AppLovinInitializer;Lcom/google/ads/mediation/applovin/AppLovinAdFactory;)V", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "appOpenAdConfiguration", "", "loadAd", "(Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;)V", "Landroid/content/Context;", "context", "showAd", "(Landroid/content/Context;)V", "Lcom/applovin/mediation/MaxAd;", "ad", If.j, "(Lcom/applovin/mediation/MaxAd;)V", "", "p0", "Lcom/applovin/mediation/MaxError;", "appLovinError", If.b, "(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V", "onAdDisplayed", "onAdHidden", If.f, "onAdDisplayFailed", "(Lcom/applovin/mediation/MaxAd;Lcom/applovin/mediation/MaxError;)V", "kowloon", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "arytenoidectomy", "Lcom/google/ads/mediation/applovin/AppLovinInitializer;", "monoploid", "Lcom/google/ads/mediation/applovin/AppLovinAdFactory;", "Lcom/applovin/mediation/ads/MaxAppOpenAd;", "polloi", "Lcom/applovin/mediation/ads/MaxAppOpenAd;", "appLovinAppOpenAd", "molybdenite", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "appOpenAdCallback", "applovin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppLovinWaterfallAppOpenAd implements MediationAppOpenAd, MaxAdListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final AppLovinInitializer appLovinInitializer;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> loadCallback;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public MediationAppOpenAdCallback appOpenAdCallback;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final AppLovinAdFactory appLovinAdFactory;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public MaxAppOpenAd appLovinAppOpenAd;

    public AppLovinWaterfallAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> loadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        Intrinsics.checkNotNullParameter(appLovinInitializer, "appLovinInitializer");
        Intrinsics.checkNotNullParameter(appLovinAdFactory, "appLovinAdFactory");
        this.loadCallback = loadCallback;
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
    }

    public static final void saneness(AppLovinWaterfallAppOpenAd appLovinWaterfallAppOpenAd, String str) {
        MaxAppOpenAd maxAppOpenAdSaneness = appLovinWaterfallAppOpenAd.appLovinAdFactory.saneness(str);
        appLovinWaterfallAppOpenAd.appLovinAppOpenAd = maxAppOpenAdSaneness;
        if (maxAppOpenAdSaneness != null) {
            maxAppOpenAdSaneness.setListener(appLovinWaterfallAppOpenAd);
        }
        MaxAppOpenAd maxAppOpenAd = appLovinWaterfallAppOpenAd.appLovinAppOpenAd;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.loadAd();
        }
    }

    public final void loadAd(MediationAppOpenAdConfiguration appOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(appOpenAdConfiguration, "appOpenAdConfiguration");
        Bundle serverParameters = appOpenAdConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (string == null || string.length() == 0) {
            this.loadCallback.onFailure(new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN));
            return;
        }
        final String string2 = serverParameters.getString("ad_unit_id");
        if (string2 != null && string2.length() != 0) {
            this.appLovinInitializer.initialize(appOpenAdConfiguration.getContext(), string, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.saneness
                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public final void onInitializeSuccess() {
                    AppLovinWaterfallAppOpenAd.saneness(this.f18826attabal, string2);
                }
            });
        } else {
            this.loadCallback.onFailure(new AdError(113, "Ad Unit ID is missing.", AppLovinMediationAdapter.ERROR_DOMAIN));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd ad, MaxError appLovinError) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(appLovinError, "appLovinError");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(new AdError(appLovinError.getCode(), appLovinError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback2 = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback2 != null) {
            mediationAppOpenAdCallback2.reportAdImpression();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String p0, MaxError appLovinError) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(appLovinError, "appLovinError");
        this.loadCallback.onFailure(new AdError(appLovinError.getCode(), appLovinError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.appOpenAdCallback = this.loadCallback.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MaxAppOpenAd maxAppOpenAd = this.appLovinAppOpenAd;
        if (maxAppOpenAd != null) {
            if (maxAppOpenAd == null || !maxAppOpenAd.isReady()) {
                MediationAppOpenAdCallback mediationAppOpenAdCallback = this.appOpenAdCallback;
                if (mediationAppOpenAdCallback != null) {
                    mediationAppOpenAdCallback.onAdFailedToShow(new AdError(106, "Ad is not ready to be displayed", AppLovinMediationAdapter.ERROR_DOMAIN));
                    return;
                }
                return;
            }
            MaxAppOpenAd maxAppOpenAd2 = this.appLovinAppOpenAd;
            if (maxAppOpenAd2 != null) {
                maxAppOpenAd2.showAd();
            }
        }
    }
}
